package com.target11.microservices.expensetemplateservice.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.target11.microservices.expensetemplateservice.domain.TemplateDomain;
import com.target11.microservices.expensetemplateservice.proxy.TemplateToReferenceServiceProxy;
import com.target11.microservices.expensetemplateservice.service.TemplateService;
import com.target11.microservices.expensetemplateservice.vo.TemplateVO;

@RestController
@RequestMapping(value = { "/template-service" })
public class TemplateController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	TemplateToReferenceServiceProxy referenceServiceProxy;
	
	@Autowired
	Environment environment;

	@Autowired
	private TemplateService templateService;
	private static final Logger logger = LoggerFactory.getLogger(TemplateController.class);

	@GetMapping(value = "/r/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TemplateVO> getAllTemplateR() {
		logger.info("Entering inside the getAllTemplate");
		List<TemplateVO> templateList = null;
		try {
			List<TemplateDomain> templateDomainList = templateService.getAllTemplate();
			logger.info("upto this point");
			// Making rest template call to Reference service

			List<String> categoryIdList = templateDomainList.stream().map(TemplateDomain::getCategoryId)
					.collect(Collectors.toList());

			logger.info("before making rest call");
			
			@SuppressWarnings("unchecked")
			Map<String, String> categoryMap = new RestTemplate()
					.postForObject("http://localhost:8045/reference/getDesc/categoryIdList", categoryIdList, Map.class);

			// Making rest template call to Reference service end

			templateList = Stream.generate(TemplateVO::new).limit(templateDomainList.size())
					.collect(Collectors.toList());
			logger.info("Control is coming here");
			for (int i = 0; i < templateDomainList.size(); i++) {
				BeanUtils.copyProperties(templateDomainList.get(i), templateList.get(i));
			}

			templateList.forEach(templateVO -> templateVO.setCategoryDesc(categoryMap.get(templateVO.getCategoryId())));

			templateDomainList.forEach(
					templateDomain -> System.out.println("Printing ID's :: " + templateDomain.getTemplateId()));
			logger.info("Exiting from the getAllTemplate :: " + templateDomainList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return templateList;
	}
	
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TemplateVO> getAllTemplate() {
		logger.info("Entering inside the getAllTemplate");
		List<TemplateVO> templateList = null;
		try {
			List<TemplateDomain> templateDomainList = templateService.getAllTemplate();
			logger.info("upto this point");
			// Making rest template call to Reference service

			List<String> categoryIdList = templateDomainList.stream().map(TemplateDomain::getCategoryId)
					.collect(Collectors.toList());
			
			List<String> tagIdList = templateDomainList.stream().map(TemplateDomain::getTagId)
					.collect(Collectors.toList());

			@SuppressWarnings("unchecked")
			/*
			 * Map<String, String> categoryMap = new RestTemplate()
			 * .postForObject("http://localhost:8045/reference/getDesc/categoryIdList",
			 * categoryIdList, Map.class);
			 */
			Map<String, String> categoryMap = referenceServiceProxy.getCategoryDescList(categoryIdList);
			
			Map<String, String> tagMap = referenceServiceProxy.getTagDescList(tagIdList);
			// Making rest template call to Reference service end

			templateList = Stream.generate(TemplateVO::new).limit(templateDomainList.size())
					.collect(Collectors.toList());

			for (int i = 0; i < templateDomainList.size(); i++) {
				BeanUtils.copyProperties(templateDomainList.get(i), templateList.get(i));
			}

			templateList.forEach(templateVO -> templateVO.setCategoryDesc(categoryMap.get(templateVO.getCategoryId())));
			templateList.forEach(templateVO -> templateVO.setTagDesc(tagMap.get(templateVO.getTagId())));

			templateDomainList.forEach(
					templateDomain -> System.out.println("Printing ID's :: " + templateDomain.getTemplateId()));
			
			logger.info("Response came from " + environment.getProperty("server.port"));
			
			logger.info("Exiting from the getAllTemplate :: " + templateDomainList.size());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return templateList;
	}

	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public TemplateVO saveTemplate(@RequestBody TemplateVO templateVO) {
		logger.info("expense : {}", templateVO);
		TemplateDomain templateDomain = new TemplateDomain();
		BeanUtils.copyProperties(templateVO, templateDomain);
		templateDomain = templateService.addTemplate(templateDomain);
		logger.info("yes   " + templateDomain.getTemplateId());
		BeanUtils.copyProperties(templateDomain, templateVO);
		return templateVO;
	}

	

}
