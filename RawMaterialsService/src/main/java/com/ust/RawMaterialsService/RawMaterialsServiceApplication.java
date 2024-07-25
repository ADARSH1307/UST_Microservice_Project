package com.ust.RawMaterialsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RawMaterialsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RawMaterialsServiceApplication.class, args);
	}

}
