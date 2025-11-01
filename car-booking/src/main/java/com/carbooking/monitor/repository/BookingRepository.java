package com.carbooking.monitor.repository;

import com.carbooking.monitor.entity.Booking;
import com.carbooking.monitor.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByCar(Car car); // To get bookings per car
}