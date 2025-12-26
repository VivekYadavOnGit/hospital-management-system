package com.vivekyadav.HospitalManagementSystem.Entity;


import com.vivekyadav.HospitalManagementSystem.Entity.types.BloodGroupType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 30, message = "Name should be of 3 to 30 characters long.")
    private String name;

    @Email
    private String email;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false, length = 10)
    private String phoneNo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BloodGroupType bloodGroup;

    @Column(nullable = false)
    private LocalDate birthDate;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToOne(mappedBy = "patient")
    private Insurance insurance;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointment;
}
