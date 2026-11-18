package com.acme.center.platform.sales.domain.model.valueobjets;

public record Dni(String dni) {
    public Dni {
        if(dni == null || dni.isBlank()) {
            throw new IllegalArgumentException("Dni must not be null or blank");
        }
        if(!dni.matches("^[0-9]{8}$")){
            throw new IllegalArgumentException("DNI must contain exactly eight digits");
        }
    }
}
