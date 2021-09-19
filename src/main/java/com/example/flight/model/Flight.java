package com.example.flight.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate departureDate;
    private LocalDateTime departureTime;
    private LocalDate arrivalDate;
    private LocalDateTime arrivalTime;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "flight_id")
    private Airline airline;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "plane_id")
    private Airplane airplane;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "originAirport_id")
    private Airport airportOrigin;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "destinationAirport_id")
    private Airport airportDestination;
}
