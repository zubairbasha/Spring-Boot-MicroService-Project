package com.departmentservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(
		description = "This is a Department Dto"
		)
public class DepartmentDto {
	@Schema(description = "This is the ID of the Department")
	private Long id;
	@Schema(description = "This is the Department Name of the Department")
	private String departmentName;
	@Schema(description = "This is the description of the Department")
	private String departmentDescription;
	@Schema(description = "This is the Code of the Department")
	private String departmentCode;
}
