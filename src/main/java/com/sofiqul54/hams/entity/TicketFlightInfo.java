package com.sofiqul54.hams.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket_flight")
public class TicketFlightInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String ticketNo;
    private String tikAgnName;
    @Column(nullable = false, unique = true)
    private String flightNo;
    @Temporal(TemporalType.DATE)
    private Date flightDate;
    @Temporal(TemporalType.DATE)
    private Date returnDate;

}
