package com.example.flight.controller;

import com.example.flight.model.Airline;
import com.example.flight.model.Airplane;
import com.example.flight.service.AirlineService;
import com.example.flight.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/flight/")
public class AirlineController {

    private final AirlineService airplaneService;

    @Autowired
    public AirlineController(AirlineService airlineService) {
        this.airplaneService = airlineService;
    }


    @PostMapping("addairline")
    public Airline addAirplane(Airline airline) {
        return airplaneService.addAirline(airline);
    }
    @PostMapping("addairlines")
    public List<Airline> addAirplanes(List<Airline> airlines) {
        return airplaneService.addAAirlines(airlines);
    }

    @GetMapping("getairline/{airline_id}")
    public Airline getAirplanesById( @PathVariable("airline_id") Long id) {
        return airplaneService.getAirlineById(id);
    }
    @GetMapping("getairlines")
    public List<Airline> getAllAirplanes() {
        return airplaneService.getAllAirlines();
    }

}
