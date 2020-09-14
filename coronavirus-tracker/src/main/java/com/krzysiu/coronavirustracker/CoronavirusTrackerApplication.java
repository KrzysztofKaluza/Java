package com.krzysiu.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Collections;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CoronavirusTrackerApplication.class);
		//SpringApplication.run(CoronavirusTrackerApplication.class, args);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8079"));
		app.run(args);
	}

}
