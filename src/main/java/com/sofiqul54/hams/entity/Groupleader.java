package com.sofiqul54.hams.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "group_leader")
public class Groupleader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "gleader_name", nullable = false)
    private String name;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "gleader_nidname", nullable = false, unique = true)
    private String nid;
    @Column(name = "pass_name", nullable = false, unique = true)
    private String passportNo;
    @Temporal(TemporalType.DATE)
    private Date issueDate;
    @Temporal(TemporalType.DATE)
    private Date expDate;
    @Column(name = "mobile", nullable = false, unique = true)
    private String mobile;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "address")
    private String address;


    @ManyToOne
    @JoinColumn(name = "pk_id", nullable = false)
    private Package Package;









}
