package com.example.flight.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.*;
import java.util.List;

@Entity @AllArgsConstructor @NoArgsConstructor
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String country;
    private String airportCode;

    @OneToMany(mappedBy = "airportOrigin")
    private List<Flight> arrivals;

    @OneToMany(mappedBy = "airportDestination")
    private List<Flight> destinations;
}
