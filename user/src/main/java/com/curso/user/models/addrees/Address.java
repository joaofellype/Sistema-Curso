package com.curso.user.models.addrees;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;
    private String uf;
    private String cep;
    private String district;
}
