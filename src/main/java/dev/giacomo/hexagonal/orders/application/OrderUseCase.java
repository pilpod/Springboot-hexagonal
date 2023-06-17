package dev.giacomo.hexagonal.orders.application;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.giacomo.hexagonal.customers.infrastructure.outputPorts.EntityRepository;
import dev.giacomo.hexagonal.orders.domain.Order;
import dev.giacomo.hexagonal.orders.infrastructure.inputPorts.OrderInputPort;

@Component
public class OrderUseCase implements OrderInputPort {

    @Autowired
    EntityRepository entityRepository;

    @Override
    public Order createOrder(String customerId, BigDecimal total) {
        Order order = Order.builder()
            .id( UUID.randomUUID().toString() )
            .customerId( customerId )
            .total( total )
            .build();

        return entityRepository.save( order );
    }
    
}
