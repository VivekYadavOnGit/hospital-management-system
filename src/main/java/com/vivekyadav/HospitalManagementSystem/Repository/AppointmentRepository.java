package com.vivekyadav.HospitalManagementSystem.Repository;

import com.vivekyadav.HospitalManagementSystem.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
