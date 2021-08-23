package com.jeevanmaben.paymentserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApiApplication.class, args);
	}

}
