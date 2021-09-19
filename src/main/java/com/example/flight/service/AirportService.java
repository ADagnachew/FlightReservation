package com.example.flight.service;

import com.example.flight.model.Airport;
import com.example.flight.model.Flight;

import java.util.List;

public interface AirportService {

    public Airport addAirport(Airport airport);
    public List<Airport> addAirports(List<Airport> airports);
    public Airport getAirportById(Long id);
    public List<Airport> getAllAirports();
}
