package com.mobilefoodfacility.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mobilefoodfacility.model.Applicant;
import com.mobilefoodfacility.model.ApplicantSearch;
import com.mobilefoodfacility.repository.ApplicantRepository;
import com.mobilefoodfacility.service.ApplicantService;

@Service
public class ApplicantServiceImpl implements ApplicantService{
	@Resource
	ApplicantRepository applicantRepo;

	@Override
	public Applicant addApplicant(Applicant applicant) {
		return applicantRepo.save(applicant);
	}

	@Override
	public List<Applicant> getAllApplicant() {
		return applicantRepo.findAll();
	}


	@Override
	public Applicant getApplicantById(long id) {
		return applicantRepo.getOne(id);
	}

	@Override
	public void updateApplicantById(long id, Applicant applicant) {
		applicantRepo.save(applicant);
		
	}

	@Override
	public void deleteApplicantById(long id) {
		applicantRepo.deleteById(id);
		
	}

	@Override
	public ApplicantSearch searchApplicant(String searchanything) {
		return applicantRepo.searchApplicant(searchanything);
		
	}

	@Override
	public Applicant rejectApplicant() {
		return applicantRepo.rejectApplicant();
	}

}
