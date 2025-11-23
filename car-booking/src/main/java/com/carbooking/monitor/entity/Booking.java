package com.carbooking.monitor.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "BOOKING")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private String id;

    @Column(name = "BOOKING_START_DATE")
    private LocalDateTime bookingStartDate;

    @Column(name = "BOOKING_END_DATE")
    private LocalDateTime bookingEndDate;

    // Many bookings can refer to one car
    @ManyToOne
    @JoinColumn(name = "CAR_ID", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;

    @Column(name = "BOOKING_STATUS")
    private String bookingStatus; // e.g., 'PENDING','CONFIRMED','CANCELLED'

    @Column(name = "DATE_CREATED")
    private OffsetDateTime dateCreated;

    @Column(name = "DATE_UPDATED")
    private OffsetDateTime dateUpdated;
}