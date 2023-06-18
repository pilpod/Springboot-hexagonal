package dev.giacomo.hexagonal.customers.infrastructure;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.giacomo.hexagonal.customers.application.CustomerService;
import dev.giacomo.hexagonal.customers.domain.Customer;

@RestController
@RequestMapping(path = "/api/v1")
public class CustomerController {

    CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping(path = "/customers")
    public Customer store(@RequestBody Customer newCustomer) {
        return service.save(newCustomer);
    }

}
