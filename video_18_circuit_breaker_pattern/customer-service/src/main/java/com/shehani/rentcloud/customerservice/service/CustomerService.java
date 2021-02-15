package com.shehani.rentcloud.customerservice.service;

import com.shehani.rentcloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
