package com.vivekyadav.HospitalManagementSystem.Repository;

import com.vivekyadav.HospitalManagementSystem.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
