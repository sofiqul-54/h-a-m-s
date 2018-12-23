package com.sofiqul54.hams.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visa_info")
public class VisaInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date applyDate;
    @Column(unique = true, nullable = false)
    private String visaNo;
    @Temporal(TemporalType.DATE)
    private Date vIssueDate;
    @Temporal(TemporalType.DATE)
    private Date vValidityDate;
    private String status;

}
