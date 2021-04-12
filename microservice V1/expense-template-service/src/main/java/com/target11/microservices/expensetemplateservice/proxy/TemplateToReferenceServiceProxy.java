package com.target11.microservices.expensetemplateservice.proxy;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name="expense-reference-service", url="localhost:8045/reference")
public interface TemplateToReferenceServiceProxy {

	@PostMapping(value = "/getDesc/categoryIdList", headers = "Accept=application/json")
	public Map<String, String> getCategoryDescList(@RequestBody List<String> categoryIdList);
	
	
	@PostMapping(value = "/getDesc/tagDesclist", headers = "Accept=application/json")
	public Map<String, String> getTagDescList(@RequestBody List<String> tagIdList);
	
}
