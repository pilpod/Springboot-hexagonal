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
    private Long id;
    private Long customerId;
    private BigDecimal total;
}
