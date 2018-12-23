package com.sofiqul54.hams.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "income")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String accountTitle;
    private double amount;
    private double totalAmount;
    private Date cDate;
}
