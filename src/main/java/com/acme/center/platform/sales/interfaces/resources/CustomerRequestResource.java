package com.acme.center.platform.sales.interfaces.resources;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Schema(description = "Resource used to create a customer")
public record CustomerRequestResource(

        @Schema(
                description = "Customer's full name",
                example = "Gonzalo Quintanilla"
        )
        @NotBlank
        String name,

        @Schema(
                description = "Institutional UPC email",
                example = "u20261234@upc.edu.pe"
        )
        @NotBlank
        @Pattern(
                regexp = "^[uU][0-9]{8}@upc\\.edu\\.pe$",
                message = "Email must have the format u########@upc.edu.pe"
        )
        String email,

        @Schema(
                description = "Customer's eight-digit DNI",
                example = "71234567"
        )
        @NotBlank
        @Pattern(
                regexp = "^[0-9]{8}$",
                message = "DNI must contain exactly eight digits"
        )
        String dni
) {
}