package dev.giacomo.hexagonal.customers.application;

import org.springframework.stereotype.Service;

import dev.giacomo.hexagonal.core.IServiceBase;
import dev.giacomo.hexagonal.customers.domain.Customer;
import dev.giacomo.hexagonal.customers.infrastructure.output.CustomerRepository;

@Service
public class CustomerService implements IServiceBase<Customer> {

    CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);       
    }

}
