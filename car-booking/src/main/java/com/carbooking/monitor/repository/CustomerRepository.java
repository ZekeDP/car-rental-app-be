package com.carbooking.monitor.repository;

import com.carbooking.monitor.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    // You can add custom queries here later, like findByOwnerName, etc.
}
