package com.employeeservice.mapper;

import com.employeeservice.dto.EmployeeDto;
import com.employeeservice.entity.Employee;

public class EmployeeMapper {
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
	return Employee.builder()
			.email(employeeDto.getEmail())
			.firstName(employeeDto.getFirstName())
			.lastName(employeeDto.getLastName())
			.departmentCode(employeeDto.getDepartmentCode())
			.organisationCode(employeeDto.getOrganisationCode())
			.build();	
	}
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		return EmployeeDto.builder()
				.id(employee.getId())
				.email(employee.getEmail())
				.firstName(employee.getFirstName())
				.lastName(employee.getLastName())
				.departmentCode(employee.getDepartmentCode())
				.organisationCode(employee.getOrganisationCode())
				.build();
	}
}
