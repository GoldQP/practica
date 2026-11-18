package com.acme.center.platform.sales.infrastructure.repositories;

import com.acme.center.platform.sales.domain.model.valueobjets.Dni;
import com.acme.center.platform.sales.infrastructure.entities.CustomerPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerJpaRepository extends JpaRepository<CustomerPersistenceEntity, Long> {
    Optional<CustomerPersistenceEntity> findByDni(Dni dni);
}
