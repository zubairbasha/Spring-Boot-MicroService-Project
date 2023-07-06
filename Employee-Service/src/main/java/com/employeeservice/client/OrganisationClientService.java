package com.employeeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employeeservice.dto.OrganisationDto;

@FeignClient(name = "ORGANISATION-SERVICE")
public interface OrganisationClientService {
	@GetMapping("/api/organisation/getorganisation/{code}")
	OrganisationDto getOrganisation(@PathVariable("code")String organisationCode);
}
