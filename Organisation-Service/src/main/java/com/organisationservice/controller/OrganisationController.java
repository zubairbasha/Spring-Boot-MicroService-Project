package com.organisationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organisationservice.dto.OrganisationDto;
import com.organisationservice.service.OrganisationService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(
		name = "ORGANISATION - REST API",
		description = "This is a Organisation API"
		)
@RequestMapping("/api/organisation")
public class OrganisationController {
	@Autowired
	private OrganisationService organisationService;
	//Build Save Organisation Rest API
	@Operation(
			description = "Save Organisation API",
			summary = "This is a Save Organisation API"
			)
	@ApiResponse(
			responseCode = "201",
		description ="HTTP Created 201 . Organisation is Saved" 	
			)
	@PostMapping("/saveorganisation")
	public ResponseEntity<OrganisationDto> saveOrganisation(@RequestBody OrganisationDto organisationDto){
		return new ResponseEntity<>(organisationService.saveOrganisation(organisationDto),HttpStatus.CREATED);
	}
	//Build Get Organisation by Code Rest API
	@Operation(
			description = "Get Organisation By using Code",
			summary = "This is a get Organisation By Using Code"
			)
	@ApiResponse(
			responseCode = "200",
			description = "HTTP is Ok with the status Code 200"
			)
	@GetMapping("/getorganisation/{code}")
	public ResponseEntity<OrganisationDto> getOrganisation(@PathVariable("code") String organisationCode){
		return new ResponseEntity<>(organisationService.getOrganisation(organisationCode),HttpStatus.OK);
	}
}
