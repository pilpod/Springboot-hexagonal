package dev.giacomo.hexagonal.customers.domain;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Customer {

    @Id
    private Long id;
    private String name;
    private String country;
}
