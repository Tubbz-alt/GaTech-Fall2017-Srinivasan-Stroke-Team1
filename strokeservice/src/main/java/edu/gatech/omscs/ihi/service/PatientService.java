package edu.gatech.omscs.ihi.service;

import org.springframework.stereotype.Service;

import edu.gatech.omscs.ihi.domain.StrokeCode;

@Service( value = "PatientService" )
public interface PatientService
{
//	Iterable< StrokeCode > getStrokeCodes();
//	
//	boolean authenticate( String username, String password );
//	
//	int getDestinationForSurveyAdmin( String username );
	
	void getPatientsFromFHIR();
	
}