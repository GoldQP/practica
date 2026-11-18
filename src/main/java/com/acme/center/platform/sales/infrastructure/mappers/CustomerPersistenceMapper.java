package com.acme.center.platform.sales.infrastructure.mappers;

import com.acme.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.platform.sales.infrastructure.entities.CustomerPersistenceEntity;

public class CustomerPersistenceMapper {
    public static Customer toDomain(CustomerPersistenceEntity entity) {
        return new Customer(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getDni()
        );
    }

   public static CustomerPersistenceEntity toEntity(Customer entity) {
        return CustomerPersistenceEntity.builder()
                .name(entity.getName())
                .email(entity.getEmail())
                .dni(entity.getDni())
                .build();
   }


}
