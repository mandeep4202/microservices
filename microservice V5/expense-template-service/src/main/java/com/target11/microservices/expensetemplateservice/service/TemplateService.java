package com.target11.microservices.expensetemplateservice.service;

import java.util.List;

import com.target11.microservices.expensetemplateservice.domain.TemplateDomain;

public interface TemplateService {

	public List<TemplateDomain> getAllTemplate();

	public TemplateDomain addTemplate(TemplateDomain templateDomain);
	
}
