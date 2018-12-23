package com.sofiqul54.hams.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "expense")
public class Exprnses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountTitle;
    private double amount;
    private double totalAmount;
    private Date pDate;
}
