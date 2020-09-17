package com.example.rest_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RestServiceApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8079"));
		app.run(args);
	}

}
