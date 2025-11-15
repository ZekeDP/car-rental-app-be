package com.carbooking.monitor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "plate_number")
    private String plateNumber;

    private String model;

    @Column(name = "car_type")
    private String carType;

    @Column(name = "year_model")
    private Integer yearModel;

    @Column(name = "car_status")
    private String status;

}
