package com.vivekyadav.HospitalManagementSystem.DTO;

import com.vivekyadav.HospitalManagementSystem.Entity.types.BloodGroupType;

import java.time.LocalDate;

public class PatientDto {

    private Long id;

    private String name;

    private String phoneNo;

    private String email;

    private String address;

    private LocalDate birthDate;

    private BloodGroupType bloodGroup;

    private String gender;
}
