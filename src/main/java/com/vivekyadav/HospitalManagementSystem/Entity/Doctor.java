package com.vivekyadav.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 30, message = "Name should be of 3 to 30 characters long.")
    private String name;

    @Email
    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 10)
    private String phoneNo;

    @Column(nullable = false, length = 50)
    private String Specialization;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    @OneToOne(mappedBy = "headDoctor")
    private Department department;

    @ManyToMany(mappedBy = "doctors")
    private Set<Department> departments = new HashSet<>();
}
