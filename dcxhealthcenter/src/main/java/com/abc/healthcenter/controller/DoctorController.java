package com.abc.healthcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.healthcenter.entity.DoctorEntity;
import com.abc.healthcenter.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
    @PostMapping("/save")
    public void createDoctor(@RequestBody DoctorEntity doctor) {
    	doctorService.saveDoctor(doctor);
    	
    }
}
