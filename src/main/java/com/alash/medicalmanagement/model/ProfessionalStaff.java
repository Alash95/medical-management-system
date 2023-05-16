package com.alash.medicalmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = )
public class ProfessionalStaff {

    private String staffId;
    private String staffDetails;
    @ManyToOne
    @JoinColumn(name = "discipline_code")
    private RefDisciplines disciplineCode;
}
