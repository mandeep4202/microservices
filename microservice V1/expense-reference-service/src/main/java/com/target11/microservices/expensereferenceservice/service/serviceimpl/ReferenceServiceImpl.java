package com.target11.microservices.expensereferenceservice.service.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target11.microservices.expensereferenceservice.controller.ReferenceController;
import com.target11.microservices.expensereferenceservice.dao.ReferenceDAO;
import com.target11.microservices.expensereferenceservice.domain.Category;
import com.target11.microservices.expensereferenceservice.domain.ExpenseSource;
import com.target11.microservices.expensereferenceservice.domain.Tag;
import com.target11.microservices.expensereferenceservice.service.ReferenceService;
import com.target11.microservices.expensereferenceservice.vo.ValidValueListVO;

@Service
public class ReferenceServiceImpl implements ReferenceService {

	@Autowired
	ReferenceDAO referenceDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(ReferenceServiceImpl.class);

	public ValidValueListVO getReferenceValue() {
		List<Category> categoryList = referenceDAO.getCategoryList();

		List<Tag> tagList = referenceDAO.getTagList();

		List<ExpenseSource> expenseSources = referenceDAO.getExpenseSource();
		System.out.println("expenseSources in repository   " + expenseSources);

		ValidValueListVO validValueList = new ValidValueListVO();
		validValueList.setCategories(categoryList);
		validValueList.setTagList(tagList);
		validValueList.setExpenseSources(expenseSources);

		return validValueList;
	}

	@Override
	public String getCategoryDesc(int categoryId) {

		String desc = referenceDAO.getCategoryDesc(categoryId);

		return desc;
	}

	@Override
	public Map<String, String> getCategoriesDesc(List<String> categoryIdList) {

		logger.info("Entering into getCategoriesDesc " );
		List<Category> catDescList = referenceDAO.getCategoryDesc(categoryIdList);
		logger.info("response came back from DAO" );
		Map<String, String> categoryPair = catDescList.stream().collect(
				Collectors.toMap((category) -> String.valueOf(category.getCatrgoryId()), (category) -> category.getCategoryDesc()));

		logger.info("Exiting from getCategoriesDesc " );
		return categoryPair;
	}

	@Override
	public Map<String, String> getTagDesc(List<String> tagIdList) {
		List<Tag> tagDescList = referenceDAO.getTagDesc(tagIdList);
		System.out.println("tagIdList in service " + tagIdList);

		Map<String, String> tagPair = tagDescList.stream().collect(
				Collectors.toMap((tag) -> String.valueOf(tag.getTagId()) , (tag) -> tag.getTagDesc()));

		return tagPair;
	}

}
