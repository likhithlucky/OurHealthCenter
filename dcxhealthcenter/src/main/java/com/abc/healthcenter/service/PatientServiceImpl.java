/**
 * 
 */
package com.abc.healthcenter.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.healthcenter.entity.DoctorEntity;
import com.abc.healthcenter.entity.PatientEntity;
import com.abc.healthcenter.exception.ResourceAlreadyExistingException;
import com.abc.healthcenter.exception.ResourceNotFoundException;

import com.abc.healthcenter.model.Patient;

import com.abc.healthcenter.repository.PatientRepository;

/**
 * @author likhith A S
 *
 * date: Jul 5, 2021

 */
@Service
public class PatientServiceImpl implements PatientService{
	
	 @Autowired
	    private PatientRepository patientRepository;
	/**
	 * Implements Save Patient Details  from PatientService Interface
	 * {@inheritdoc}
	 */

	@Override
	public void savePatient(Patient patient) throws ResourceAlreadyExistingException {
		 Optional<PatientEntity> optionalPatient = patientRepository.findById(patient.getPatientId());
			
			if(optionalPatient.isPresent()) {
				throw new ResourceAlreadyExistingException("Patient already existing with id: "+patient.getPatientId());
			}
			else {
				PatientEntity patientEntity = new PatientEntity();
				patientEntity.setPatientId(patient.getPatientId());
				patientEntity.setPatientName(patient.getPatientName());
				patientEntity.setPatientAddress(patient.getPatientAddress());
				patientEntity.setPatientAge(patient.getPatientAge());
				patientEntity.setPatientContact(patient.getPatientContact());
				patientEntity.setPatientGender(patient.getPatientGender());
				patientEntity.setPatientEmail(patient.getPatientEmail());
				patientEntity.setPatientuserName(patient.getPatientuserName());
				patientEntity.setPatientpassword(patient.getPatientpassword());
				patientEntity.setPatientMessage(patient.getPatientMessage());
				patientEntity.setAppointments(patient.getAppointments());
				patientEntity.setPayments(patient.getPayments());
				patientRepository.save(patientEntity);
				
			}
		
	}
	/**
	 *Implements Find Patient by Id from PatientService Interface
	 * {@inheritdoc}
	 */

	@Override
	public Patient findPatientbyId(int id) throws ResourceNotFoundException {
		Patient patient = new Patient();
		Optional<PatientEntity> patientEntity = patientRepository.findById(id);
		if(patientEntity.isPresent()) {
		
			patient.setPatientId(patientEntity.get().getPatientId());
			patient.setPatientName(patientEntity.get().getPatientName());
			patient.setPatientAddress(patientEntity.get().getPatientAddress());
			patient.setPatientAge(patientEntity.get().getPatientAge());
			patient.setPatientContact(patientEntity.get().getPatientContact());
			patient.setPatientGender(patientEntity.get().getPatientGender());
			patient.setPatientEmail(patientEntity.get().getPatientEmail());
			patient.setPatientuserName(patientEntity.get().getPatientuserName());
			patient.setPatientpassword(patientEntity.get().getPatientpassword());
			patient.setPatientMessage(patientEntity.get().getPatientMessage());
			patient.setAppointments(patientEntity.get().getAppointments());
			patient.setPayments(patientEntity.get().getPayments());
			return patient;
		}
		else {
			throw new ResourceNotFoundException("Cannot find patient with this ID"+id);
		}
	}
	/**
	 *Implements delete Patient by Id from PatientService Interface
	 * {@inheritdoc}
	 */
	@Override
	public void deletePatientbyId(int id) throws ResourceNotFoundException {
		Optional<PatientEntity> patientEntity = patientRepository.findById(id);
		if(patientEntity.isPresent()) {
			patientRepository.deleteById(id);
		}
		else {
			throw new ResourceNotFoundException("Cannot find patient with this ID "+id);
		}
		
	}
	@Override
	public void updatePatient(Patient patient) throws ResourceNotFoundException {
		PatientEntity patientEntity = patientRepository.findById(patient.getPatientId()).get();
		
		if(patientEntity==null) {
			throw new ResourceNotFoundException("Cannot Find Patient with this id: "+patient.getPatientId());
		}
		else {
			
			patientEntity.setPatientId(patient.getPatientId());
			patientEntity.setPatientName(patient.getPatientName());
			patientEntity.setPatientAddress(patient.getPatientAddress());
			patientEntity.setPatientAge(patient.getPatientAge());
			patientEntity.setPatientContact(patient.getPatientContact());
			patientEntity.setPatientGender(patient.getPatientGender());
			patientEntity.setPatientEmail(patient.getPatientEmail());
			patientEntity.setPatientuserName(patient.getPatientuserName());
			patientEntity.setPatientpassword(patient.getPatientpassword());
			patientEntity.setPatientMessage(patient.getPatientMessage());
			patientEntity.setAppointments(patient.getAppointments());
			patientEntity.setPayments(patient.getPayments());
			patientRepository.save(patientEntity);
			
		}
		
	}

}
