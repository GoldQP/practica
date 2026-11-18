package com.acme.center.platform.sales.domain.model.valueobjets;

public record Name(String name) {

    public Name {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}
