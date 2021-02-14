package com.shehani.rentcloud.customerservice.repository;

import com.shehani.rentcloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
