package com.example.flight.controller;

import com.example.flight.model.Airplane;
import com.example.flight.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/flight/")
public class AirplaneController {


    private final AirplaneService airplaneService;

    @Autowired
    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }


    @PostMapping("addairplane")
    public Airplane addAirplane(Airplane airplane) {
        return airplaneService.addAirplane(airplane);
    }
    @PostMapping("addairplanes")
    public List<Airplane> addAirplanes(List<Airplane> airplanes) {
        return airplaneService.addAirplanes(airplanes);
    }

    @GetMapping("getairplane/{airplane_id}")
    public Airplane getAirplanesById(@PathVariable("airplane_id") Long id) {
        return airplaneService.getAirplanesById(id);
    }
    @GetMapping("getairplanes")
    public List<Airplane> getAllAirplanes() {
        return airplaneService.getAllAirplanes();
    }
}
