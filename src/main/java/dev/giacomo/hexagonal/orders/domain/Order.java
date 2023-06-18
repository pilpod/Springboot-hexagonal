package dev.giacomo.hexagonal.orders.domain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Builder
@Getter
@Setter
public class Order {
    
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String customerId;
    private BigDecimal total;
}
