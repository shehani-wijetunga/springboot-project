package com.shehani.rentcloud.profileservice.repository;

import com.shehani.rentcloud.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
