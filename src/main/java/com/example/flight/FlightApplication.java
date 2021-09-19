package com.example.flight;

import com.example.flight.model.Airline;
import com.example.flight.model.Airplane;
import com.example.flight.model.Airport;
import com.example.flight.model.Flight;
import com.example.flight.service.AirlineService;
import com.example.flight.service.AirplaneService;
import com.example.flight.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class FlightApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightApplication.class, args);
    }
    @Bean
    CommandLineRunner run(AirplaneService airplaneService, AirlineService airlineService, AirportService airportService) {
        return args -> {
            airplaneService.addAirplane(new Airplane(null, "btre1234", "Boing787", 130, new ArrayList<>()));
            airplaneService.addAirplane(new Airplane(null, "123456", "boing737", 300, new ArrayList<>()));
            airplaneService.addAirplane(new Airplane(null, "134e1234", "ng787", 430, new ArrayList<>()));

            airlineService.addAirline(new Airline(null, "United Airline", new ArrayList<>()));
            airlineService.addAirline(new Airline(null, "Ethiopian Airline", new ArrayList<>()));
            airlineService.addAirline(new Airline(null, "American Airline", new ArrayList<>()));

            airportService.addAirport(new Airport(
                    null,
                    "Cedar rapids airport",
                    "Cedar Rapid", "USA",
                    "CedarUSA",
                    new ArrayList<>(),
                    new ArrayList<>()));
            airportService.addAirport(new Airport(
                    null,
                    "Addis Ababa airport",
                    "Addis Ababa", "Ethiopia",
                    "Addis",
                    new ArrayList<>(),
                    new ArrayList<>()));
        };
    }

}