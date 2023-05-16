package com.alash.medicalmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "staff_appointments")
public class StaffInAppointments {

    @ManyToOne
    private Appointments appointments;

    @ManyToOne
    private ProfessionalStaff professionalStaff;



}
