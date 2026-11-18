package com.acme.center.platform.sales.interfaces.resources;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Customer information returned by the API")
public record CustomerRequestResponse(

        @Schema(description = "Generated customer identifier", example = "1")
        Long id,

        @Schema(description = "Customer's full name", example = "Gonzalo Quintanilla")
        String name,

        @Schema(description = "Institutional UPC email", example = "u20261234@upc.edu.pe")
        String email,

        @Schema(description = "Customer's DNI", example = "71234567")
        String dni
) {
}