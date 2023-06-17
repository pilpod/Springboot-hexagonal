package dev.giacomo.hexagonal.orders.infrastructure.inputPorts;

import java.math.BigDecimal;

import dev.giacomo.hexagonal.orders.domain.Order;

public interface OrderInputPort {
    
    public Order createOrder( String customerId, BigDecimal total );
}
