package com.abc.healthcenter.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.abc.healthcenter.model.Doctor;
import com.abc.healthcenter.model.Response;
import com.abc.healthcenter.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	Response response = new Response();
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/save")
	public ResponseEntity<?> addProduct(@Valid @RequestBody Doctor doctor) {		
		doctorService.saveDoctor(doctor);
		return new ResponseEntity<>(doctor.getDoctorName()+" Your Profile is Saved Successfully",HttpStatus.CREATED);
	}
	@PostMapping("/find/{id}")
	public ResponseEntity<?> findDoctor(@Valid @Min(1) @PathVariable int id){
		Doctor doctor = doctorService.findDoctorbyId(id);
		return new ResponseEntity<>(doctor,HttpStatus.FOUND);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteDoctor(@Valid @Min(1) @PathVariable int id){
		doctorService.deleteDoctorbyId(id);
		response.setMsg("Deleted successfully");
		response.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<>(response,HttpStatus.FOUND);
	}

}
