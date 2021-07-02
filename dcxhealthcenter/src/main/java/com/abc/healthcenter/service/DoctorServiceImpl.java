package com.abc.healthcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.healthcenter.entity.DoctorEntity;
import com.abc.healthcenter.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	 @Autowired
	    private DoctorRepository doctorRepository;

	@Override
	public void saveDoctor(DoctorEntity doctor) {
		doctorRepository.save(doctor);
		
	}
		
	
	

}
