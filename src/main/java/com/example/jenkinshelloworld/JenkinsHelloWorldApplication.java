package com.example.jenkinshelloworld;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsHelloWorldApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsHelloWorldApplication.class);

	@PostConstruct
	public void innit() {
		logger.info("Application Started...");
	}

	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(JenkinsHelloWorldApplication.class, args);
	}

}
