package dev.giacomo.hexagonal.orders.domain;

import java.math.BigDecimal;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Order {
    
    @Id
    private String id;
    private String customerId;
    private BigDecimal total;
}
