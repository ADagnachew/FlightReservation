package com.example.flight.serviceImpl;

import com.example.flight.model.Airplane;
import com.example.flight.repository.AirplaneRepository;
import com.example.flight.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneServiceImpl implements AirplaneService {

    private final AirplaneRepository airplaneRepository;

    @Autowired
    public AirplaneServiceImpl(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    @Override
    public Airplane addAirplane(Airplane airplane) {
        return airplaneRepository.save(airplane);
    }

    @Override
    public List<Airplane> addAirplanes(List<Airplane> airplanes) {
        return airplaneRepository.saveAll(airplanes);
    }

    @Override
    public Airplane getAirplanesById(Long id) {
        return airplaneRepository.findById(id).orElse(null);
    }

    @Override
    public List<Airplane> getAllAirplanes() {
        return airplaneRepository.findAll();
    }
}
