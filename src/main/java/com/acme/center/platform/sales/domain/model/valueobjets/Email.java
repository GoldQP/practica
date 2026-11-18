package com.acme.center.platform.sales.domain.model.valueobjets;

import com.acme.center.platform.sales.domain.exceptions.EMailException;

public record Email(String email) {
    public Email {
        if(email == null || email.isBlank()) {
            throw new IllegalArgumentException();
        }
        //Invariante de dominio
        if(!email.matches("^[uU][0-9]{8}@upc\\.edu\\.pe$") )
        {
                throw new EMailException("Invalid email address");
        }
    }
}
