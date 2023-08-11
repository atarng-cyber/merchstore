package com.swift.merchstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MerchstoreApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MerchstoreApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

	}
}
