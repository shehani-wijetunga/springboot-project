package com.shehani.rentcloud.rentservice.service;

import com.shehani.rentcloud.model.Rent;

import java.util.List;

public interface RentService {
    Rent save(Rent rent);

    Rent findById(int id);

    List<Rent> findAll();
}