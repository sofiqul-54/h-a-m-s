package com.sofiqul54.hams.entity;

import javax.persistence.*;

@Entity
@Table(name = "account_head")
public class AccountHead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    private String description;
}
