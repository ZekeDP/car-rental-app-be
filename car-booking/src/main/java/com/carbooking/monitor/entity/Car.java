package com.carbooking.monitor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String model;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "owner_name")
    private String ownerName;

    // You can optionally include enum or boolean fields like:
    // private boolean isSubcontractorOwned;

}
