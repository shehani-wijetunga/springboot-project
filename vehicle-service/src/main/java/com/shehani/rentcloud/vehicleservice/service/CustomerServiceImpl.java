package com.shehani.rentcloud.vehicleservice.service;

import com.shehani.rentcloud.model.Vehicle;
import com.shehani.rentcloud.vehicleservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements VehicleService{

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle customer) {
        return vehicleRepository.save(customer);
    }
}
