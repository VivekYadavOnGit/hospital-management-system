package com.vivekyadav.HospitalManagementSystem.Repository;

import com.vivekyadav.HospitalManagementSystem.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
