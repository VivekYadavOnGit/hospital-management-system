package com.vivekyadav.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 30, message = "Name should be of 3 to 30 characters long.")
    private String deptName;

    @OneToOne
    private Doctor headDoctor;

    @ManyToMany
    @JoinTable(name = "dept_doctor_table")
    private Set<Doctor> doctors = new HashSet<>();
}
