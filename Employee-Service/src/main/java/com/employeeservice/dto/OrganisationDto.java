package com.employeeservice.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrganisationDto {
	private Long id;
	private String organisationName;
	private String organisationDescription;
	private String organisationCode;
	private LocalDateTime createdDate;
}
