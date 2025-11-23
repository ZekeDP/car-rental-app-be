package com.carbooking.monitor.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "BILLING")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private String id;

    @OneToOne
    @JoinColumn(name = "BOOKING_ID", nullable = false)
    private Booking booking;

    @Column(name = "TOTAL_BILLING_AMOUNT")
    @Builder.Default
    private Double totalBillingAmount = 0.0;

    @Column(name = "BILLING_DUE_DATE")
    private LocalDateTime billingDueDate;

    @Column(name = "BILLING_STATUS")
    private String billingStatus; // e.g., 'DUE','PARTIAL','PAID','OVERDUE','REFUNDED'

    @Column(name = "DATE_CREATED")
    private OffsetDateTime dateCreated;

    @Column(name = "DATE_UPDATED")
    private OffsetDateTime dateUpdated;
}