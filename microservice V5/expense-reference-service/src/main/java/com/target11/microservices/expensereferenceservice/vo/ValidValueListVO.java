package com.target11.microservices.expensereferenceservice.vo;

import java.util.List;

import com.target11.microservices.expensereferenceservice.domain.Category;
import com.target11.microservices.expensereferenceservice.domain.ExpenseSource;
import com.target11.microservices.expensereferenceservice.domain.Tag;

public class ValidValueListVO {

	
	private List<Category> categories;
	private List<Tag> tagList;
	private List<ExpenseSource> expenseSources;
	
	
	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	/**
	 * @return the tagList
	 */
	public List<Tag> getTagList() {
		return tagList;
	}
	/**
	 * @param tagList the tagList to set
	 */
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
	/**
	 * @return the expenseSources
	 */
	public List<ExpenseSource> getExpenseSources() {
		return expenseSources;
	}
	/**
	 * @param expenseSources the expenseSources to set
	 */
	public void setExpenseSources(List<ExpenseSource> expenseSources) {
		this.expenseSources = expenseSources;
	}
	
	
}
