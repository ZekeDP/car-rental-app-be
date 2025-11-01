package com.carbooking.monitor.repository;

import com.carbooking.monitor.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // You can add custom queries here later, like findByOwnerName, etc.
}
