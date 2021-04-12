package com.target11.microservices.expensetemplateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients("com.target11.microservices.expensetemplateservice")
@EnableDiscoveryClient
public class ExpenseTemplateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTemplateServiceApplication.class, args);
		System.out.println("This is starting page");
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
