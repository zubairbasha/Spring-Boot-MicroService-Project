package com.employeeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employeeservice.dto.DepartmentDto;

@FeignClient(name="DEPARTMENT-SERVICE")
public interface Deparmentclientservice {
	@GetMapping("/api/department/getdepartment/{departmentcode}")
	DepartmentDto getDepartment(@PathVariable("departmentcode") String code);
}
