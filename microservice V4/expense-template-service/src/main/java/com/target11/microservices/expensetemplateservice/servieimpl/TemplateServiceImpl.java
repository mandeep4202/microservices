package com.target11.microservices.expensetemplateservice.servieimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target11.microservices.expensetemplateservice.dao.TemplateDao;
import com.target11.microservices.expensetemplateservice.domain.TemplateDomain;
import com.target11.microservices.expensetemplateservice.service.TemplateService;
import com.target11.microservices.expensetemplateservice.vo.TemplateVO;

@Service
public class TemplateServiceImpl implements TemplateService {
	
	@Autowired
	private TemplateDao templateDao;
	
	public List<TemplateDomain> getAllTemplate() {
		List<TemplateDomain> templateList = null;
		
		templateList = templateDao.getAllTemplate();
		
		return templateList;
		
	}

	@Override
	public TemplateDomain addTemplate(TemplateDomain templateDomain) {
		
		
		templateDomain = templateDao.addTemplate(templateDomain);
		
		return templateDomain;
	}

}
