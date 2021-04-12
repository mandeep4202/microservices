package com.target11.microservices.expensereferenceservice.dao.daoimpl;

import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.target11.microservices.expensereferenceservice.dao.ReferenceDAO;
import com.target11.microservices.expensereferenceservice.domain.Category;
import com.target11.microservices.expensereferenceservice.domain.ExpenseSource;
import com.target11.microservices.expensereferenceservice.domain.Tag;
import com.target11.microservices.expensereferenceservice.vo.ValidValueListVO;

@Repository
public class ReferenceDAOImpl implements ReferenceDAO {

	  @Autowired
	    private SessionFactory sessionFactory;
	  
	public List<Category> getCategoryList(){
		 Session session = sessionFactory.getCurrentSession();
	        @SuppressWarnings("unchecked")
	        List<Category> list= session.createCriteria(Category.class).list();
	        return list;
	}

	@Override
	public List<Tag> getTagList() {
		 Session session = sessionFactory.getCurrentSession();
	        @SuppressWarnings("unchecked")
			List<Tag> tags= session.createCriteria(Tag.class).list();  
	        return tags;
	}

	@Override
	public List<ExpenseSource> getExpenseSource() {
		 Session session = sessionFactory.getCurrentSession();
	        @SuppressWarnings("unchecked")
			List<ExpenseSource >  expenseSources= session.createCriteria(ExpenseSource.class).list();  
	        return expenseSources;
	}

	@Override
	public String getCategoryDesc(int categoryId) {
		 Session session = sessionFactory.getCurrentSession();
			Category  category= session.get(Category.class, categoryId);
	        return category != null ? category.getCategoryDesc() : null ;
	}

	@Override
	public List<Category> getCategoryDesc(List<String> categoryIdList) {
		List<Category> categoryList = null;
		try {
		 Session session = sessionFactory.getCurrentSession();
		 categoryList = session.createCriteria(Category.class ).add(Restrictions.in("catrgoryId", categoryIdList)).list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		 return categoryList;
	}

	@Override
	public List<Tag> getTagDesc(List<String> tagIdList) {
		 Session session = sessionFactory.getCurrentSession();
		 List<Tag> tagList = session.createCriteria(Tag.class ).add(Restrictions.in("tagId", tagIdList)).list();
		return tagList;
	}
	
	 

}
