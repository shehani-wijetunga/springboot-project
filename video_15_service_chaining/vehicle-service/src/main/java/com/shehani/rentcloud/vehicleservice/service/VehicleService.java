package com.shehani.rentcloud.vehicleservice.service;

import com.shehani.rentcloud.model.vehicle.Vehicle;

import java.util.List;


public interface VehicleService {
    Vehicle save(Vehicle vehicle);

    Vehicle findById(int id);

    List<Vehicle> findAll();

}
