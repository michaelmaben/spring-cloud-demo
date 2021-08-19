package com.jeevanmaben.storeorderserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.jeevanmaben.storeorderserviceapi.domain")
public class OrderServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApiApplication.class, args);
	}

}
