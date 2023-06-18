package dev.giacomo.hexagonal.orders.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.giacomo.hexagonal.orders.domain.Order;

public interface OrderRepository extends JpaRepository<Order,String> {
    
}
