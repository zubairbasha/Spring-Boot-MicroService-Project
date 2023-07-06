package com.organisationservice.mapper;

import com.organisationservice.dto.OrganisationDto;
import com.organisationservice.entity.Organisation;

public class OrganisationMapper {
	public static OrganisationDto maptoOrganisationDto(Organisation organisation) {
		return OrganisationDto.builder().id(organisation.getId()).organisationCode(organisation.getOrganisationCode())
				.organisationDescription(organisation.getOrganisationDescription())
				.organisationName(organisation.getOrganisationName())
				.createdDate(organisation.getCreatedDate())
				.build();
	}

	public static Organisation maptoOrganisation(OrganisationDto organisationDto) {
		return Organisation.builder().organisationCode(organisationDto.getOrganisationCode())
				.organisationDescription(organisationDto.getOrganisationDescription())
				.organisationName(organisationDto.getOrganisationName()).id(organisationDto.getId()).build();
	}
}
