package com.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeservice.dto.EmployeeDeparmentDto;
import com.employeeservice.dto.EmployeeDto;
import com.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	// Build Save Employee rest api
	@PostMapping(value = "/savedemployee")
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
		EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	//get employee rest api 
	/*
	 * Changing this to get the Department from the Department Service
	 * Development Steps:-
	 * Create a Department Code in the Entity
	 * Create DepartmentDto Class in the Dto
	 * Create a rest template bean
	 * Create a response with employee and department*/
	@GetMapping(value="/getemployee/{id}")
	public ResponseEntity<EmployeeDeparmentDto> getEmployee(@PathVariable("id") Long id){
		EmployeeDeparmentDto employee=employeeService.getEmployeeById(id);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
}
