package dev.giacomo.hexagonal.customers.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.giacomo.hexagonal.customers.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    
}