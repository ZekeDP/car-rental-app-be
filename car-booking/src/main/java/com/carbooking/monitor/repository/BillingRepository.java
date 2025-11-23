package com.carbooking.monitor.repository;

import com.carbooking.monitor.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Billing, String> {
    // You can add custom queries here later, like findByOwnerName, etc.
}
