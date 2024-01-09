package com.nit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMvc11CurdOperationApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc11CurdOperationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Spring Boot");
		
	}

}
