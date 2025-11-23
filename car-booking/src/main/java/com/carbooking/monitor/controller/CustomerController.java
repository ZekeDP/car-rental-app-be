package com.carbooking.monitor.controller;


import com.carbooking.monitor.entity.Customer;
import com.carbooking.monitor.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCars() {
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping("/{id}")
    public Customer getCarById(@PathVariable("id") String id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id));
    }

    // @PutMapping("/{id}")
    // public Customer updateCustomer(@PathVariable String id, @RequestBody Customer updatedCustomer) {
    //     Customer customer = customerRepository.findById(id)
    //             .orElseThrow(() -> new RuntimeException("Customer not found"));
    //     customer.setFirstName(updatedCar.getFirstName());
    //     customer.setMiddleName(updatedCar.setMiddleName());
    //     customer.setLastName(updatedCar.setLastName());
    //     customer.setMobileNumber(updatedCar.setMobileNumber());
    //     customer.setEmailAddress(updatedCar.setEmailAddress());
    //     return customerRepository.save(customer);
    // }

    
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable String id) {
        customerRepository.deleteById(id);
    }

}