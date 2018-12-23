package com.sofiqul54.hams.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "agency")
public class AgencyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String agnName;
    @Column(nullable = false)
    private String proName;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String mobile;
    private String phone;
    private String fax;
    private String webSite;
    @Column(nullable = false, unique = true)
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date openingDate;


}
