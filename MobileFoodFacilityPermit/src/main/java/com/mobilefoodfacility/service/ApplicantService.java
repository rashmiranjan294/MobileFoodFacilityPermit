package com.mobilefoodfacility.service;

import java.util.List;

import com.mobilefoodfacility.model.Applicant;
import com.mobilefoodfacility.model.ApplicantSearch;

public interface ApplicantService {
	public Applicant addApplicant(Applicant applicant);
	//public Applicant getAllApplicant(Applicant applicant);
	//public void updateApplicant(long id);
	public List<Applicant> getAllApplicant();
	public Applicant getApplicantById(long id);
	public void updateApplicantById(long id, Applicant applicant);
	public void deleteApplicantById(long id);
	public ApplicantSearch searchApplicant(String searchanything);
	public Applicant rejectApplicant();
	

}
