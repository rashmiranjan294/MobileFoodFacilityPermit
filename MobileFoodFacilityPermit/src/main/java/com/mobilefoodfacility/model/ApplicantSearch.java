package com.mobilefoodfacility.model;

import java.util.Date;

import lombok.Data;

@Data
public class ApplicantSearch {
	private long locationid;
	private String applicant;
	private String facilityType;
	private long cnn;
	private String locationDescription;
	private String address;
	private String blocklot;
	private String block;
	private String lot;
	private String permit;
	private String status;
	private String foodItems;
	private long x;
	private long y;
	private long latitude;
	private long longitude;
	private String schedule;
	private Date nOISent;
	private Date approved;
	private Date received;
	private boolean priorPermit;
	private Date expirationDate;
	private String location;
	private String searchanything;
	
	public ApplicantSearch() {
		
	}

}
