package com.target11.microservices.expensetemplateservice.dao;

import java.util.List;

import com.target11.microservices.expensetemplateservice.domain.TemplateDomain;

public interface TemplateDao {

	public List<TemplateDomain> getAllTemplate();

	public TemplateDomain addTemplate(TemplateDomain templateDomain);
}
