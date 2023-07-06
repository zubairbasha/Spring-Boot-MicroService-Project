package com.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departmentservice.entity.Department;

@Repository
public interface DeparmentRepository extends JpaRepository<Department, Long>{
	Department findByDepartmentCode(String code);
}
