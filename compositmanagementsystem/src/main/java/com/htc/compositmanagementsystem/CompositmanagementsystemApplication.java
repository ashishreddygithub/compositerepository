package com.htc.compositmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.htc.compositmanagementsystem.externalservices")

public class CompositmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositmanagementsystemApplication.class, args);
	}

}
