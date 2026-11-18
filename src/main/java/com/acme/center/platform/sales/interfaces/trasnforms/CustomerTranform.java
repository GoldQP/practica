package com.acme.center.platform.sales.interfaces.trasnforms;

import com.acme.center.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.platform.sales.interfaces.resources.CustomerRequestResource;
import com.acme.center.platform.sales.interfaces.resources.CustomerRequestResponse;

public class CustomerTranform {


    public static CreateCustomerCommand toCreateCustomerCommandFromResource(CustomerRequestResource resource) {
        return new CreateCustomerCommand(
                resource.name(), resource.email(), resource.dni()
        );
    }

    public static CustomerRequestResponse toCustomerRequestResponseFromDomain(Customer customer) {
        return new CustomerRequestResponse(
                customer.getId(),
                customer.getName().name(),
                customer.getEmail().email(),
                customer.getDni().dni()
        );
    }


}
