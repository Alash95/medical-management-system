package com.alash.medicalmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patients")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patients {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_generator")
    private Long patientId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String MiddleName;
    @Column(name = "last_name")
    private String LastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "date_became_patient")
    private String dateBecamePatient;
    @Column(name = "other_details")
    private String otherDetails;
    @ManyToOne
    @JoinColumn(name = "medicalCenterId")
    private CommunityMedicalCenter medicalCenterId;
    @ManyToOne
    @JoinColumn(name = "addressId")
    private Addresses addressId;

}
