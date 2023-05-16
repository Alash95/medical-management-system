package com.alash.medicalmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.NavigableMap;

@Entity
@Table(name = "ref_disciplines")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RefDisciplines {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "discipline_generator")
    private String disciplineCode;
    @Column(name = "discipline_name")
    private String disciplineName;
    @Column(name = "discipline_description")
    private String disciplineDescription;
}
