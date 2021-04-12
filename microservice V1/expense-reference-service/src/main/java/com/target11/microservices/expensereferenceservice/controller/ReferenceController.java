package com.target11.microservices.expensereferenceservice.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.target11.microservices.expensereferenceservice.service.ReferenceService;
import com.target11.microservices.expensereferenceservice.vo.ValidValueListVO;

@RestController
@RequestMapping(value = { "/reference" })
public class ReferenceController {

	@Autowired
	ReferenceService referenceService;

	private static final Logger logger = LoggerFactory.getLogger(ReferenceController.class);

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ValidValueListVO getReferenceValue() {
		logger.info("Going inside the getReferenceValue our logs are working fine");

		ValidValueListVO validValueList = referenceService.getReferenceValue();
		System.out.println(" Valid Value   " + validValueList.getExpenseSources());
		return validValueList;
	}

	@GetMapping(value = "/getDesc/categoryId/{categoryId}")
	public String getDescription(@PathVariable int categoryId) {
		logger.info("categoryId {} ", categoryId);
		String desc = referenceService.getCategoryDesc(categoryId);
		System.out.println("desc  " + desc);
		return desc;
	}

	@PostMapping(value = "/getDesc/categoryIdList", headers = "Accept=application/json")
	@ResponseBody
	public Map<String, String> getCategoryDescList(@RequestBody List<String> categoryIdList) {
		logger.info("Entering into  getCategoryDescList categoryId {} ", categoryIdList);

		Map<String, String> catDescMap = referenceService.getCategoriesDesc(categoryIdList);

		catDescMap.forEach((key, value) -> {
			System.out.println("Key : " + key + " Value : " + value);
		});
		logger.info("Exiting From  getCategoryDescList ");
		return catDescMap;
	}

	@PostMapping(value = "/getDesc/tagDesclist", headers = "Accept=application/json")
	@ResponseBody
	public Map<String, String> getTagDescList(@RequestBody List<String> tagIdList) {
		logger.info("Entering into getTagDescList tagList {} ", tagIdList);

		Map<String, String> tagDescMap = referenceService.getTagDesc(tagIdList);

		logger.info("catDescMap {} ", tagDescMap);
		tagDescMap.forEach((key, value) -> {
			System.out.println("Key : " + key + " Value : " + value);
		});
		logger.info("Existing from getTagDescList");
		return tagDescMap;
	}

	
	
	
	
}
