package com.sofiqul54.hams.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "pilgrim")
public class Pilgrim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private long accountNumber;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String fatherName;
    @Column(nullable = false)
    private String motherName;
    @Column(nullable = false)
    private String gender;
    @Temporal(TemporalType.DATE)
    private String dob;
    @Column(nullable = false)
    private String nid;
    @Column(nullable = false)
    private String maritalStatus;
    @Column(nullable = false)
    private String spouseName;
    @Column(nullable = false)
    private String occupation;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String district;
    private double bookingAmount;
    private double balanceAmount;






}
