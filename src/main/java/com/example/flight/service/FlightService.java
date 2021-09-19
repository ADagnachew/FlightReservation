package com.example.flight.service;

import com.example.flight.model.Airport;
import com.example.flight.model.Flight;

import java.util.List;

public interface FlightService {

    public Flight addFlight(Flight flight);
    public List<Flight> addFlights(List<Flight> flightList);
    public Flight getFlightById(Long id);
    public List<Flight> getAllFlights();

}
