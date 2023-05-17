package com.alash.medicalmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "appointmentId_generator")
    private Long appointmentId;
    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;
    @Column(name = "medical_notes")
    private String medicalNotes;
    @Column(name = "other_details")
    private String otherDetails;
    @ManyToOne
    @JoinColumn(name = "location_code")
    private RefAppointmentLocations appointmentLocations;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patient;
}
