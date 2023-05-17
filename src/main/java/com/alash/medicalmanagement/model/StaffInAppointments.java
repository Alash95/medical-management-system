package com.alash.medicalmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "staff_appointments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StaffInAppointments {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "appointmentId_generator")
    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointments appointments;

//    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "staffId_generator")
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private ProfessionalStaff professionalStaff;

    @Column(name = "comments")
    private String comments;



}
