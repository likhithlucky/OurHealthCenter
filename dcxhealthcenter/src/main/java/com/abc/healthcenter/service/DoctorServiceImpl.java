package com.abc.healthcenter.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.healthcenter.entity.DoctorEntity;
import com.abc.healthcenter.exception.ResourceAlreadyExistingException;
import com.abc.healthcenter.exception.ResourceNotFoundException;
import com.abc.healthcenter.model.Doctor;
import com.abc.healthcenter.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	 @Autowired
	    private DoctorRepository doctorRepository;


	 @Override
		public void saveDoctor(Doctor doctor) throws ResourceAlreadyExistingException {		
			
		 Optional<DoctorEntity> optionalDoctor = doctorRepository.findById(doctor.getDoctorID());
			
			if(optionalDoctor.isPresent()) {
				throw new ResourceAlreadyExistingException("Doctor already existing with id: "+doctor.getDoctorID());
			}
			else {
				DoctorEntity doctorEntity = new DoctorEntity();
				doctorEntity.setDoctorID(doctor.getDoctorID());
				doctorEntity.setDoctorName(doctor.getDoctorName());
				doctorEntity.setDoctorEmail(doctor.getDoctorEmail());
				doctorEntity.setDoctorContact(doctor.getDoctorContact());
				doctorEntity.setDoctorGender(doctor.getDoctorGender());
				doctorEntity.setDoctorExperience(doctor.getDoctorExperience());
				doctorEntity.setDoctorQualification(doctor.getDoctorQualification());
				doctorEntity.setDoctorDepartment(doctor.getDoctorDepartment());
				doctorEntity.setDoctorAddress(doctor.getDoctorAddress());
				doctorEntity.setDoctoruserName(doctor.getDoctoruserName());
				doctorEntity.setDoctorpassword(doctor.getDoctorpassword());
				doctorEntity.setAppointments(doctor.getAppointments());
			
				doctorRepository.save(doctorEntity);
			}	
	
			
	

}


	@Override
	public Doctor findDoctorbyId(int id) throws ResourceNotFoundException {
		Doctor doctor = new Doctor();
		Optional<DoctorEntity> doctorEntity = doctorRepository.findById(id);
		if(doctorEntity.isPresent()) {
			doctor.setDoctorID(doctorEntity.get().getDoctorID());
			doctor.setDoctorName(doctorEntity.get().getDoctorName());
			doctor.setDoctorEmail(doctorEntity.get().getDoctorEmail());
			doctor.setDoctorContact(doctorEntity.get().getDoctorContact());
			doctor.setDoctorDepartment(doctorEntity.get().getDoctorDepartment());
			doctor.setDoctorExperience(doctorEntity.get().getDoctorExperience());
			doctor.setDoctorGender(doctorEntity.get().getDoctorGender());
			doctor.setDoctorQualification(doctorEntity.get().getDoctorQualification());
			doctor.setDoctorAddress(doctorEntity.get().getDoctorAddress());
			doctor.setDoctoruserName(doctorEntity.get().getDoctoruserName());
			doctor.setDoctorpassword(doctorEntity.get().getDoctorpassword());
			return doctor;
		}
		else {
			throw new ResourceNotFoundException("Cannot find doctor with this ID"+id);
		}
		
	}
	/**
	 * Implements delete doctor by Id from DoctorService Interface
     *  {@inheritdoc}
     *  
     */
	@Override
	
	public void deleteDoctorbyId(int id) throws ResourceNotFoundException {
		Optional<DoctorEntity> doctorEntity = doctorRepository.findById(id);
		if(doctorEntity.isPresent()) {
			doctorRepository.deleteById(id);
		}
		else {
			throw new ResourceNotFoundException("Cannot find doctor with this ID "+id);
		}
		
	}
}
