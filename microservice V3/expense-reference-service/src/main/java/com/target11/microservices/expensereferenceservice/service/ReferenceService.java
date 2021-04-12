package com.target11.microservices.expensereferenceservice.service;

import java.util.List;
import java.util.Map;

import com.target11.microservices.expensereferenceservice.vo.ValidValueListVO;

public interface ReferenceService {

	public ValidValueListVO getReferenceValue();

	public String getCategoryDesc(int categoryId);

	public Map<String, String> getCategoriesDesc(List<String> categoryIdList);

	public Map<String, String> getTagDesc(List<String> tagIdList);
}
