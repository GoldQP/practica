package com.acme.center.platform.sales.domain.model.aggregates;

import com.acme.center.platform.sales.domain.model.valueobjets.Dni;
import com.acme.center.platform.sales.domain.model.valueobjets.Email;
import com.acme.center.platform.sales.domain.model.valueobjets.Name;

public class Customer {
    private Long id;
    private Name name;
    private Email email;
    private Dni dni;

    public Customer(Name name, Email email, Dni dni) {
        this.name = name;
        this.email = email;
        this.dni = dni;
    }

  public Customer(Long id, Name name, Email email, Dni dni) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Dni getDni() {
        return dni;
    }
}
