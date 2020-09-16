package com.krzysiu.chatApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ChatAppApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ChatAppApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8079"));
		app.run(args);
	}

}
