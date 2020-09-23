package com.krzysztof.springBootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootTutorialApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8079"));
		app.run(args);
	}

}
