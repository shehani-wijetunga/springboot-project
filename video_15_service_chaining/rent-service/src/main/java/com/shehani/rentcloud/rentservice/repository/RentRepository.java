package com.shehani.rentcloud.rentservice.repository;

import com.shehani.rentcloud.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Integer> {
}
