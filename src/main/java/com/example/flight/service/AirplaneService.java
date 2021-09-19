package com.example.flight.service;

import com.example.flight.model.Airplane;
import com.example.flight.model.Airport;
import com.example.flight.model.Flight;

import java.util.List;

public interface AirplaneService {
    public Airplane addAirplane(Airplane airplane);
    public List<Airplane> addAirplanes(List<Airplane> airplanes);
    public Airplane getAirplanesById(Long id);
    public List<Airplane> getAllAirplanes();

}
