package com.target11.microservices.expensereferenceservice.dao.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.target11.microservices.expensereferenceservice.dao.ReferenceDAO;
import com.target11.microservices.expensereferenceservice.domain.Category;
import com.target11.microservices.expensereferenceservice.domain.ExpenseSource;
import com.target11.microservices.expensereferenceservice.domain.Tag;

@Repository
public class ReferenceDAOImpl implements ReferenceDAO {

	  @Autowired
	    private SessionFactory sessionFactory;
	  
	  private Session getSession() {
		  
		  Session  session;
	  try 
	  {
	      //Step-2: Implementation
	      session = sessionFactory.getCurrentSession();
	  } 
	  catch (HibernateException e) 
	  {
	      //Step-3: Implementation
	      session = sessionFactory.openSession();
	  }
	  return session;
	  }
	  
	public List<Category> getCategoryList(){
		 Session session = getSession();
	        @SuppressWarnings("unchecked")
	        List<Category> list= session.createCriteria(Category.class).list();
	        return list;
	}

	@Override
	public List<Tag> getTagList() {
		 Session session = getSession();
	        @SuppressWarnings("unchecked")
			List<Tag> tags= session.createCriteria(Tag.class).list();  
	        return tags;
	}

	@Override
	public List<ExpenseSource> getExpenseSource() {
		 Session session = getSession();
	        @SuppressWarnings("unchecked")
			List<ExpenseSource >  expenseSources= session.createCriteria(ExpenseSource.class).list();  
	        return expenseSources;
	}

	@Override
	public String getCategoryDesc(int categoryId) {
		 Session session = getSession();
			Category  category= session.get(Category.class, categoryId);
	        return category != null ? category.getCategoryDesc() : null ;
	}

	@Override
	public List<Category> getCategoryDesc(List<String> categoryIdList) {
		List<Category> categoryList = null;
		try {
		 Session session = getSession();
		 categoryList = session.createCriteria(Category.class ).add(Restrictions.in("catrgoryId", categoryIdList)).list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		 return categoryList;
	}

	@Override
	public List<Tag> getTagDesc(List<String> tagIdList) {
		 Session session = getSession();
		 List<Tag> tagList = session.createCriteria(Tag.class ).add(Restrictions.in("tagId", tagIdList)).list();
		return tagList;
	}
	
	 

}
