package com.dell.sit.demo.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
		info = @Info(title = "Download Demo Service",
		version = "v 3.0.0",
		contact = @Contact(name = "Namrata Kumari", email = "namrata_kumari@dell.com"),
		termsOfService = "https://www.dell.com/learn/us/en/uscorp1/site-terms-of-use-copyright")
)

public class SwaggerConfig {}