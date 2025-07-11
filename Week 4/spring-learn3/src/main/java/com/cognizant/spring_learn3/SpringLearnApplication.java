package com.cognizant.spring_learn3;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Starting application");
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Application Started");
	}

}
