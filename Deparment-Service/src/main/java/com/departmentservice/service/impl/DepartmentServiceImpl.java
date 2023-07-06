package com.departmentservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentservice.DepartmentMapper;
import com.departmentservice.dto.DepartmentDto;
import com.departmentservice.entity.Department;
import com.departmentservice.repository.DeparmentRepository;
import com.departmentservice.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DeparmentRepository departmentRepository;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		// convert department dto to department jpa entity

		Department department = DepartmentMapper.maptToDepartment(departmentDto);
		Department savedDepartment = departmentRepository.save(department);
		DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);
		return savedDepartmentDto;
	}

	@Override
	public DepartmentDto getDepartmentByCode(String code) {
		Department department =departmentRepository.findByDepartmentCode(code);
		return DepartmentMapper.mapToDepartmentDto(department);
	}

}
