package com.curso.user.models.users;

import com.curso.user.models.addrees.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String password;
    private int age;
    private String occupation;
    @OneToOne(mappedBy = "user")
    private Address address;
    private boolean active;
    private String hashActive;
}
