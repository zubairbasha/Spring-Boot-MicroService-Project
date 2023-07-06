package com.departmentservice.service;

import com.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
	DepartmentDto saveDepartment(DepartmentDto department);
	DepartmentDto getDepartmentByCode(String code);
}
	
