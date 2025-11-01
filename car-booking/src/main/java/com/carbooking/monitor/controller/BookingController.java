package com.carbooking.monitor.controller;

import com.carbooking.monitor.entity.Booking;
import com.carbooking.monitor.entity.Car;
import com.carbooking.monitor.repository.BookingRepository;
import com.carbooking.monitor.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingRepository bookingRepository;
    private final CarRepository carRepository;

    // Get all bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Add new booking
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

    // Get booking by ID
    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
    }

    // Get bookings for a specific car
    @GetMapping("/car/{carId}")
    public List<Booking> getBookingsByCar(@PathVariable Long carId) {
        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new RuntimeException("Car not found"));
        return bookingRepository.findByCar(car);
    }

    // ️ Update booking
    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking updatedBooking) {
        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        booking.setStartDate(updatedBooking.getStartDate());
        booking.setEndDate(updatedBooking.getEndDate());
        booking.setRenterName(updatedBooking.getRenterName());
        booking.setPaymentStatus(updatedBooking.getPaymentStatus());
        booking.setAmountPaid(updatedBooking.getAmountPaid());

        return bookingRepository.save(booking);
    }

    // Delete booking
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingRepository.deleteById(id);
    }
}
