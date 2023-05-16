package com.alash.medicalmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "medical_center")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommunityMedicalCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medical_generator")
    private Long medicalCenterId;
    @Column(name = "name")
    private String medicalCenterName;
    @Column(name = "manager")
    private String medicalCenterManager;
    @Column(name = "contact_details")
    private String contactDetails;
    @Column(name = "other_details")
    private String otherDetails;
    @ManyToOne
    @JoinColumn(name = "addressId")
    private Addresses address_id;
//    @OneToMany(mappedBy = "patient")
//    private List<Patients> patients;
}
