package com.example.flight.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serialNumber;
    private String model;
    private int capacity;

    @OneToMany(mappedBy = "airplane")
    private List<Flight> flights;

}
