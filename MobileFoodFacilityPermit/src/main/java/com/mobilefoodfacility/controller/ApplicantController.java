package com.mobilefoodfacility.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobilefoodfacility.model.Applicant;
import com.mobilefoodfacility.model.ApplicantSearch;
import com.mobilefoodfacility.service.ApplicantService;

@CrossOrigin
@RestController
@RequestMapping("/applicant")
public class ApplicantController {
	@Resource
	ApplicantService applicantService;
	
	@PostMapping("/save")
	public ResponseEntity<Applicant> addApplicant(@RequestBody Applicant applicant){
		try{
		Applicant result=null;
		result=applicantService.addApplicant(applicant);
		return new ResponseEntity<>(result,HttpStatus.CREATED);	
    	}
		catch(Exception e){
			//System.err.println("###########################");
			return new ResponseEntity<>(null,HttpStatus.EXPECTATION_FAILED);
		
	}
	
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Applicant>> getAllApplicant(){
		try{
		List<Applicant> applicant=applicantService.getAllApplicant();
		return new ResponseEntity<>(applicant,HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/getOne/{id}")
	public ResponseEntity<Applicant> getApplicantById(@PathVariable("id") long id){
		try{
		Applicant getApplicant=applicantService.getApplicantById(id);
		return new ResponseEntity<>(getApplicant,HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Applicant> updateApplicantById(@PathVariable("id") long id,
			@RequestBody Applicant applicant) {
		try{
		applicantService.updateApplicantById(id, applicant);
		return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Applicant> deleteApplicantById(@PathVariable("id") long id){
		try{
		applicantService.deleteApplicantById(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	}
	
	}
	
	@GetMapping("/search")
	public ResponseEntity<ApplicantSearch> searchApplicant(@RequestParam("searchanything") String searchanything){
		System.err.println("###########hello##########"+searchanything);
		try{
		ApplicantSearch search=applicantService.searchApplicant(searchanything);
		System.err.println("#####################"+searchanything+" "+search.getFacilityType());
		return new ResponseEntity<>(search,HttpStatus.OK);
		
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/rejectedlist")
	public ResponseEntity<Applicant> rejectApplicant(){
		//System.err.println("###########hello##########"+searchanything);
		try{
		Applicant search=applicantService.rejectApplicant();
		System.err.println("##################### "+search.getFacilityType());
		return new ResponseEntity<>(search,HttpStatus.OK);
		
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	}
