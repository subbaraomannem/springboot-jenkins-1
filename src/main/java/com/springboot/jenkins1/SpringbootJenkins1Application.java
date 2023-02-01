
package com.springboot.jenkins1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootJenkins1Application {
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkins1Application.class);

	@PostConstruct
	public void intt() {
		logger.info("application started ...");
	}

	public static void main(String[] args) {
		logger.info("application executed...");
		SpringApplication.run(SpringbootJenkins1Application.class, args);
	}

}
