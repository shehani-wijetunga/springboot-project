package com.shehani.rentcloud.vehicleservice.repository;

import com.shehani.rentcloud.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
