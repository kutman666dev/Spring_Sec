package com.example.perfect.model;

import jakarta.persistence.*;

@Entity
@Table (name="qwerty")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
