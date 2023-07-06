package com.organisationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Organisation Service REST API Documentation",
				description = "This is a Organisation Rest API",
				contact = @Contact(
						name = "M Zubair Basha",
						email = "mohammedzubair006@gmail.com",
						url = "https://javatpoint.com"
						),
				license = @License(
						name = "APACHE 2.0",
						url = "https://javatpoint.com"
						)
				),
		externalDocs = @ExternalDocumentation(
				description = "This is a External Documentation",
				url = "https://javatpoint.com"
				)
		)
public class OrganisationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganisationServiceApplication.class, args);
	}

}
