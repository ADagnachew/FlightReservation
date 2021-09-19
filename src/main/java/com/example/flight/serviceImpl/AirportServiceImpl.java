package com.example.flight.serviceImpl;

import com.example.flight.model.Airport;
import com.example.flight.repository.AirportRepository;
import com.example.flight.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;

    @Autowired
    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public Airport addAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public List<Airport> addAirports(List<Airport> airports) {
        return airportRepository.saveAll(airports);
    }

    @Override
    public Airport getAirportById(Long id) {
        return airportRepository.findById(id).orElse(null);
    }

    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }
}
