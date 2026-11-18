package com.acme.center.platform.sales.infrastructure.adapters;
import com.acme.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.platform.sales.domain.repositories.CustomerRepository;
import com.acme.center.platform.sales.infrastructure.mappers.CustomerPersistenceMapper;
import com.acme.center.platform.sales.infrastructure.repositories.CustomerJpaRepository;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class CustomerPersistenceAdapter implements CustomerRepository {
    private final CustomerJpaRepository repository;
    public CustomerPersistenceAdapter(CustomerJpaRepository repository) {
        this.repository = repository;
    }
    @Override
    public Optional<Customer> findById(Long id) {
        return null;
    }
    @Override
    public Customer save(Customer customer) {
        var result = repository.save(CustomerPersistenceMapper.toEntity(customer));
        return CustomerPersistenceMapper.toDomain(result);
    }
    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public boolean existByDni(String dni) {
        return false;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Optional<Customer> findByDni(String dni) {
        return null;
    }
}
