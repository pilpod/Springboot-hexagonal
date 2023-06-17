package dev.giacomo.hexagonal.customers.infrastructure.inputPorts;

import java.util.List;

import dev.giacomo.hexagonal.customers.domain.Customer;

public interface CustomerInputPort {
    
    public Customer createCustomer( String name, String country);
    public Customer getById( Long id );
    public List<Customer> getAll();
}
