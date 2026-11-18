package com.acme.center.platform.sales.interfaces.controllers;

import com.acme.center.platform.sales.application.commandservices.CustomerCommandService;
import com.acme.center.platform.sales.interfaces.resources.CustomerRequestResource;
import com.acme.center.platform.sales.interfaces.resources.CustomerRequestResponse;
import com.acme.center.platform.sales.interfaces.trasnforms.CustomerTranform;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@Tag(
        name = "Customers",
        description = "Endpoints for customer management"
)
public class CustomerController {

    private final CustomerCommandService service;

    public CustomerController(CustomerCommandService service) {
        this.service = service;
    }

    @Operation(
            summary = "Create a customer",
            description = "Creates and persists a new customer"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "Customer created successfully",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(
                                    implementation = CustomerRequestResponse.class
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid request data",
                    content = @Content
            )
    })
    @PostMapping
    public ResponseEntity<CustomerRequestResponse> createCustomer(
            @Valid @RequestBody CustomerRequestResource resource) {

        var command =
                CustomerTranform.toCreateCustomerCommandFromResource(resource);

        var customer = service.handle(command);

        var response =
                CustomerTranform.toCustomerRequestResponseFromDomain(customer);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}
