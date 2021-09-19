package com.example.flight.serviceImpl;

import com.example.flight.model.Airline;
import com.example.flight.model.Airport;
import com.example.flight.repository.AirlineRepository;
import com.example.flight.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineServiceImpl implements AirlineService {

    private final AirlineRepository airlineRepository;

    @Autowired
    public AirlineServiceImpl(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }


    @Override
    public Airline addAirline(Airline airline) {
        return airlineRepository.save(airline);
    }

    @Override
    public List<Airline> addAAirlines(List<Airline> airlines) {
        return airlineRepository.saveAll(airlines);
    }

    @Override
    public Airline getAirlineById(Long id) {
        return airlineRepository.findById(id).orElse(null);
    }

    @Override
    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }
}
