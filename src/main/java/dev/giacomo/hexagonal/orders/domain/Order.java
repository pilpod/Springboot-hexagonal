package dev.giacomo.hexagonal.orders.domain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order")
@Builder
@Getter
@Setter
public class Order {
    
    @Id
    private String id;
    private String customerId;
    private BigDecimal total;
}
