package com.departmentservice;

import com.departmentservice.dto.DepartmentDto;
import com.departmentservice.entity.Department;

public class DepartmentMapper {
	public static DepartmentDto mapToDepartmentDto(Department department) {
		return DepartmentDto.builder().id(department.getId()).departmentCode(department.getDepartmentCode())
				.departmentDescription(department.getDepartmentDescription())
				.departmentName(department.getDepartmentName()).build();
	}
	public static Department maptToDepartment(DepartmentDto departmentDto) {
		return Department.builder().departmentCode(departmentDto.getDepartmentCode())
				.departmentDescription(departmentDto.getDepartmentDescription())
				.departmentName(departmentDto.getDepartmentName()).build();
	}
}
