package com.vivekyadav.HospitalManagementSystem.Repository;

import com.vivekyadav.HospitalManagementSystem.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
