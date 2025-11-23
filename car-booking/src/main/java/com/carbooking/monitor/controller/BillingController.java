package com.carbooking.monitor.controller;

import com.carbooking.monitor.entity.Billing;
import com.carbooking.monitor.service.BillingService;
import com.carbooking.monitor.dto.ErrorResponse;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billing")
@RequiredArgsConstructor
public class BillingController {

    private final BillingService billingService;

    @GetMapping
    public List<Billing> getAllBillings() {
        return billingService.findAll();
    }

    @PostMapping
    public Billing addBilling(@RequestBody Billing Billing) {
        return billingService.save(Billing);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBillingById(@PathVariable("id") String id) {

        return billingService.findById(id)
                            .<ResponseEntity<?>>map(ResponseEntity::ok)
                            .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                                                .body(new ErrorResponse("Billing record not found: " + id, 404)));
    }

    // @PutMapping("/{id}")
    // public Billing updateBilling(@PathVariable Long id, @RequestBody Billing updatedBilling) {
    //     Billing Billing = BillingRepository.findById(id)
    //             .orElseThrow(() -> new RuntimeException("Billing not found"));
    //     Billing.setName(updatedBilling.getName());
    //     Billing.setModel(updatedBilling.getModel());
    //     Billing.setImageUrl(updatedBilling.getImageUrl());
    //     Billing.setOwnerName(updatedBilling.getOwnerName());
    //     return billingService.save(Billing);
    // }
    
    @DeleteMapping("/{id}")
    public void deleteBilling(@PathVariable String id) {
        billingService.deleteById(id);
    }

}