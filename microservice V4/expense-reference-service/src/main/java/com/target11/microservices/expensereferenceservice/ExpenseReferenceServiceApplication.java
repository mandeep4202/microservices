package com.target11.microservices.expensereferenceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExpenseReferenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseReferenceServiceApplication.class, args);
	}

}
