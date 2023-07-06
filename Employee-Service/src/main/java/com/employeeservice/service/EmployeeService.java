package com.employeeservice.service;

import com.employeeservice.dto.EmployeeDeparmentDto;
import com.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	EmployeeDeparmentDto getEmployeeById(Long id);
}
