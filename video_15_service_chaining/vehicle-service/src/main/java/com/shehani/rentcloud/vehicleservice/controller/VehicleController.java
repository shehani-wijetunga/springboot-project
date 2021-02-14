package com.shehani.rentcloud.vehicleservice.controller;

import com.shehani.rentcloud.model.vehicle.Vehicle;
import com.shehani.rentcloud.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @RequestMapping(value= "/{id}",method= RequestMethod.GET)
    public Vehicle getVehicle(@PathVariable int id)
    {
        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return vehicleService.findById(id);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.findAll();
    }
}
