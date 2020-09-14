package com.mobilefoodfacility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mobilefoodfacility.model.Applicant;
import com.mobilefoodfacility.model.ApplicantSearch;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long>{
	
	@Query(value="select * from Applicant where applicant= :searchanything or facility_type= :searchanything or status= :searchanything",nativeQuery=true)
	ApplicantSearch searchApplicant(@Param("searchanything") String searchanything);
	
	@Query(value="select * from Applicant where expiration_date < now();",nativeQuery=true)
	Applicant rejectApplicant();

}
