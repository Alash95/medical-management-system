package com.alash.medicalmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "address")
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_generator")
    private Long addressId;
    @Column(name = "building_no")
    private String buildingNumber;
    @Column(name = "street_no")
    private String streetNumber;
    @Column(name = "lga")
    private String localGovernmentArea;
    @Column(name = "city")
    private String city;
    @Column(name = "postcode")
    private String postcode;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "address_details")
    private String addressDetails;
//    @OneToMany(mappedBy = "address")
//    private List<CommunityMedicalCenter> medicalCenter;
//    @OneToMany(mappedBy = "address")
//    private List<Patients> patients;

}
