package com.organisationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organisationservice.dto.OrganisationDto;
import com.organisationservice.entity.Organisation;
import com.organisationservice.mapper.OrganisationMapper;
import com.organisationservice.repository.OrganisationRepository;
@Service
public class OrganisationImpl implements OrganisationService{
	@Autowired
	private OrganisationRepository organisationRepo;
	@Override
	public OrganisationDto saveOrganisation(OrganisationDto organisationDto) {
		//Convert OrganisationDto to OrganisationJPA Entity
		Organisation organisation= organisationRepo.save(OrganisationMapper.maptoOrganisation(organisationDto));
		return OrganisationMapper.maptoOrganisationDto(organisation);
	}
	@Override
	public OrganisationDto getOrganisation(String organisationCode) {
		Organisation organisation=organisationRepo.findByOrganisationCode(organisationCode);
		return OrganisationMapper.maptoOrganisationDto(organisation);
	}

}
