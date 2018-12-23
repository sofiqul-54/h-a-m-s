package com.sofiqul54.hams.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "passport_info")
public class PassportInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passportNo;
    @Temporal(TemporalType.DATE)
    private Date issueDate;
    @Temporal(TemporalType.DATE)
    private Date expDate;
    private String dip;

}
