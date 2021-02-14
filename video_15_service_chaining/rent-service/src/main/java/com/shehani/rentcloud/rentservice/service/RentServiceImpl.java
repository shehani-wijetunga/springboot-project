package com.shehani.rentcloud.rentservice.service;

import com.shehani.rentcloud.model.Rent;
import com.shehani.rentcloud.rentservice.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentServiceImpl implements RentService {
    @Autowired
    RentRepository rentRepository;
    @Override
    public Rent save(Rent rent) {
        return rentRepository.save(rent);
    }


    @Override
    public Rent findById(int id) {
        Optional<Rent> rent = rentRepository.findById(id);

        if (rent.isPresent())
            return rent.get();
        else
            return new Rent();

    }
    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }
}