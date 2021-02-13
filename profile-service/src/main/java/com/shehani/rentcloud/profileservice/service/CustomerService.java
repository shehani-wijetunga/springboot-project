package com.shehani.rentcloud.profileservice.service;

import com.shehani.rentcloud.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
