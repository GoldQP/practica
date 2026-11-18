package com.acme.center.platform.shared.interfaces.rest;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sales API")
                        .version("1.0")
                        .description(
                                "REST API for customer management in the Sales bounded context."
                        )
                        .contact(new Contact()
                                .name("Gonzalo Quintanilla")
                                .email("tu-correo@upc.edu.pe")));
    }
}