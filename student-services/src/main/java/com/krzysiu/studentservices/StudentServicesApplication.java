package com.krzysiu.studentservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class StudentServicesApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(StudentServicesApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8079"));
		app.run(args);
	}

}
