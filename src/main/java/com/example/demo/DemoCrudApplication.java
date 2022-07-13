package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class DemoCrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoCrudApplication.class, args);
	}

}
