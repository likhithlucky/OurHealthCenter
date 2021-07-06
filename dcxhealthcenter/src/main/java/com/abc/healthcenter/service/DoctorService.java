package com.abc.healthcenter.service;

import com.abc.healthcenter.exception.ResourceAlreadyExistingException;
import com.abc.healthcenter.exception.ResourceNotFoundException;
import com.abc.healthcenter.model.Doctor;
/**
 * 
 * @author Prasad
 *
 * date: Jul 5, 2021
 */
public interface DoctorService {
	/**
	 * Method to save the Doctor Details
	 * @param doctor
	 * @throws ResourceAlreadyExistingException
	 */
	 public void saveDoctor(Doctor doctor) throws ResourceAlreadyExistingException;
	 /**
	  * 
	  * @param id
	  * @return
	  * @throws ResourceNotFoundException
	  */
	 public Doctor findDoctorbyId(int id) throws ResourceNotFoundException;
	/**
	 * 
	 * @param id
	 * @throws ResourceNotFoundException
	 */
	 public void deleteDoctorbyId(int id)throws ResourceNotFoundException;

}
