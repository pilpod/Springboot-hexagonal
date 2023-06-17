package dev.giacomo.hexagonal.customers.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Builder
@Getter
@Setter
public class Customer {

    @Id
    private String id;
    private String name;
    private String country;
}
