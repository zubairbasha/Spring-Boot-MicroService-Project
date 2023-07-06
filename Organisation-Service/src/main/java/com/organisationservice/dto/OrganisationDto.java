package com.organisationservice.dto;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Organisation Model Information",
name = "Organisation Model")
public class OrganisationDto {
	@Schema(description = "ID of the Organisation")
	@Hidden
	private Long id;
	@Schema(description = "Organisation Name of the Organisation")
	private String organisationName;
	@Schema(description = "Description of the Organisation")
	private String organisationDescription;
	@Schema(description = "Organisation Code of the Organisation")
	private String organisationCode;
	@Schema(description = "Created Date of the Organisation",
			accessMode = AccessMode.READ_ONLY
			)
	private LocalDateTime createdDate;
}
