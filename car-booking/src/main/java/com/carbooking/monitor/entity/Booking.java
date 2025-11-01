package com.carbooking.monitor.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many bookings can refer to one car
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Column(name = "renter_name", nullable = false)
    private String renterName;


    private String paymentStatus; // e.g., "PAID", "UNPAID", "PARTIAL"

    private Double amountPaid;

    // Extendable later for audit fields, payment IDs, etc.
}