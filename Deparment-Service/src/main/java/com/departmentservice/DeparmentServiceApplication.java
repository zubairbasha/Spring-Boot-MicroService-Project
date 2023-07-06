package com.departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
@OpenAPIDefinition(
		info = @Info(
				title = "Department Service REST APIs",
				description = "This is a Department Service",
				contact = @Contact(
						name = "M Zubair Basha",
						email = "zubair@gmail.com",
						url = "https://www.javaguides.com"
						),
				license = @License(
						name = "Apache 2.0",
						url = "https://javatpoints.com"
						)
				),
		externalDocs = @ExternalDocumentation(
				description = "This is External Documentation",
				url = "https://javatpoint.com"
				)
		)
	
@SpringBootApplication
@RefreshScope
public class DeparmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeparmentServiceApplication.class, args);
	}

}
