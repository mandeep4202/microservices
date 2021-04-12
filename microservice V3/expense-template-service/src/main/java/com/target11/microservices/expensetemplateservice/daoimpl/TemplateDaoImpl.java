package com.target11.microservices.expensetemplateservice.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.target11.microservices.expensetemplateservice.dao.TemplateDao;
import com.target11.microservices.expensetemplateservice.domain.TemplateDomain;
import com.target11.microservices.expensetemplateservice.vo.TemplateVO;

@Repository
public class TemplateDaoImpl implements TemplateDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<TemplateDomain> getAllTemplate() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<TemplateDomain> templateList = session.createCriteria(TemplateDomain.class).list();
		return templateList;

	}

	@Override
	public TemplateDomain addTemplate(TemplateDomain templateDomain) {
		Session session = sessionFactory.getCurrentSession();
		session.save(templateDomain);
		return templateDomain;
	}

}
