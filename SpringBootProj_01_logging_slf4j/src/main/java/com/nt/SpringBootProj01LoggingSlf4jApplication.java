package com.nt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootProj01LoggingSlf4jApplication {

	Logger log = LoggerFactory.getLogger(SpringBootProj01LoggingSlf4jApplication.class);

	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name) {
		log.info("Request {}", name);
		if (name.equalsIgnoreCase("test")) {
			throw new RuntimeException("Opps Exception raised....");
		}
		String response = "Hi " + name + " Welcome to Java Techie";
		log.info("Response {}", response);
		return response;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj01LoggingSlf4jApplication.class, args);
	}

}
