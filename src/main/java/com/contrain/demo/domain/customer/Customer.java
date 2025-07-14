package com.contrain.demo.domain.customer;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @CreatedDate
    private LocalDateTime registrationDate;
}
