package com.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDeparmentDto {
	private EmployeeDto employeeDto;
	private DepartmentDto departmentDto;
	private OrganisationDto organisationDto;
}
