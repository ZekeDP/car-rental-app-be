package com.carbooking.monitor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.carbooking.monitor.entity.Billing;
import com.carbooking.monitor.repository.BillingRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BillingService{
    
    private final BillingRepository billingRepository;

    public List<Billing> findAll() {
        return billingRepository.findAll();
    }

    public Billing save(Billing Billing) {
        return billingRepository.save(Billing);
    }

    public Optional<Billing> findById(@PathVariable("id") String id) throws RuntimeException {
        return billingRepository.findById(id);
                //.orElseThrow(() -> new RuntimeException("Billing not found with ID: " + id));

        //TO DO: Error/HTTP Codes Handling
        // return Optional.ofNullable(billingRepository.findById(id)
        //         .orElseThrow(() -> new RuntimeException("Billing not found with ID: " + id)));
    }

    // public Billing updateBilling(String id, Billing updatedBilling) throws RuntimeException  {
    //     Optional<Billing> billing = BillingRepository.findById(id);
    //             // .orElseThrow(() -> new RuntimeException("Billing not found"));
    //     if(!billing.isEmpty()){
    //         Billing.setName(updatedBilling.getBooking());
    //         Billing.setModel(updatedBilling.getModel());
    //         Billing.setImageUrl(updatedBilling.getImageUrl());
    //         Billing.setOwnerName(updatedBilling.getOwnerName());
    //     } else{
    //         throw new RuntimeException("Billing not found"));
    //     }        
    //     return billingRepository.save(billing);
    // }

    public void deleteById(String id) {
        billingRepository.deleteById(id);
    }
}
