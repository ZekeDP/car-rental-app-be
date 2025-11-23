package com.carbooking.monitor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import java.time.OffsetDateTime;

@Entity
@Table(name = "CUSTOMER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private String id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "MOBILE_E164")
    private String mobileE164;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    @Column(name = "CUSTOMER_ADDRESS")
    private String customerAddress;

    @Column(name = "DATE_CREATED")
    private OffsetDateTime dateCreated;

    @Column(name = "DATE_UPDATED")
    private OffsetDateTime dateUpdated;
}
