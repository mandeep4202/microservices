package com.target11.microservices.expensereferenceservice.dao;

import java.util.List;
import java.util.Map;

import com.target11.microservices.expensereferenceservice.domain.Category;
import com.target11.microservices.expensereferenceservice.domain.ExpenseSource;
import com.target11.microservices.expensereferenceservice.domain.Tag;

public interface ReferenceDAO {

	public List<Category> getCategoryList();
	public List<Tag> getTagList();
	public List<ExpenseSource> getExpenseSource();
	public String getCategoryDesc(int categoryId);
	public List<Category> getCategoryDesc(List<String> categoryIdList);
	public List<Tag> getTagDesc(List<String> tagIdList);
}
