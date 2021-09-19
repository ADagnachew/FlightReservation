package com.example.flight.service;

import com.example.flight.model.Airline;
import com.example.flight.model.Airport;

import java.util.List;

public interface AirlineService {

    public Airline addAirline(Airline airline);
    public List<Airline> addAAirlines(List<Airline> airlines);
    public Airline getAirlineById(Long id);
    public List<Airline> getAllAirlines();
}
