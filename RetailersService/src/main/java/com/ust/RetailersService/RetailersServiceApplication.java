package com.ust.RetailersService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RetailersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailersServiceApplication.class, args);
	}

}
