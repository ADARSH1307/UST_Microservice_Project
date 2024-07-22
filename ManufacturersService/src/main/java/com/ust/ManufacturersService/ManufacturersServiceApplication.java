package com.ust.ManufacturersService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ManufacturersServiceApplication {

public static void main(String[] args) {
		SpringApplication.run(ManufacturersServiceApplication.class, args);
	}

}
