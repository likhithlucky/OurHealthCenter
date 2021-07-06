/**
 * Test class updated by prasad
 * 
 */
package com.abc.healthcenter.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.abc.healthcenter.entity.DoctorEntity;
import com.abc.healthcenter.exception.ResourceNotFoundException;
import com.abc.healthcenter.model.Doctor;
import com.abc.healthcenter.repository.DoctorRepository;

/**
 * @author admin
 *
 * date: Jul 6, 2021

 */
@SpringBootTest
public class DoctorServiceTest {
	@Mock
	private DoctorRepository doctorRepository;
	@InjectMocks
	private DoctorServiceImpl doctorServiceImpl;
	
	@Test
	public void TestFindDoctorbyId() {
		DoctorEntity doctorEntity=new DoctorEntity();
		doctorEntity.setDoctorID(150);
		doctorEntity.setDoctorName("likhi");
		doctorEntity.setDoctorEmail("li");
		doctorEntity.setDoctorContact(990);
		doctorEntity.setDoctorDepartment("card");
		doctorEntity.setDoctorExperience(6);
		doctorEntity.setDoctorGender("MAle");
		doctorEntity.setDoctorQualification("l");
		doctorEntity.setDoctorAddress("att");
		doctorEntity.setDoctoruserName("li150");
		doctorEntity.setDoctorpassword("%%");
		Optional<DoctorEntity> optionalDoctor = Optional.of(doctorEntity);
        
        
		when(doctorRepository.findById(150)).thenReturn(optionalDoctor);
		
		Doctor doctor=doctorServiceImpl.findDoctorbyId(150);
		
		assertEquals(doctor.getDoctorName(),doctorEntity.getDoctorName());
		assertEquals(doctor.getDoctorID(),doctorEntity.getDoctorID());
      
	}
	
	
	 @Test
     public void testFindProductByIdThrowingException() {
        
         when(doctorRepository.findById(144)).thenThrow(ResourceNotFoundException.class);
        
         assertThrows(ResourceNotFoundException.class,()->doctorServiceImpl.findDoctorbyId(144));
     }
	 
	@Test
	public void testSaveDoctor() {
		Doctor doctor= new Doctor();
		doctor.setDoctorID(150);
		doctor.setDoctorName("likhi");
		doctor.setDoctorEmail("li");
		doctor.setDoctorContact(990);
		doctor.setDoctorDepartment("card");
		doctor.setDoctorGender("MAle");
		doctor.setDoctorQualification("l");
		doctor.setDoctorAddress("att");
		doctor.setDoctoruserName("li150");
		doctor.setDoctorpassword("%%");
		
		 doctorServiceImpl.saveDoctor(doctor);
		 
		 DoctorEntity doctorEntity=new DoctorEntity();
			doctorEntity.setDoctorID(150);
			doctorEntity.setDoctorName("likhi");
			doctorEntity.setDoctorEmail("li");
			doctorEntity.setDoctorContact(990);
			doctorEntity.setDoctorDepartment("card");
			doctorEntity.setDoctorExperience(6);
			doctorEntity.setDoctorGender("MAle");
			doctorEntity.setDoctorQualification("l");
			doctorEntity.setDoctorAddress("att");
			doctorEntity.setDoctoruserName("li150");
			doctorEntity.setDoctorpassword("%%");
			Optional<DoctorEntity> optionalDoctor = Optional.of(doctorEntity);
//			when(doctorRepository.findById(150)).thenReturn(optionalDoctor);
//		 verify(doctorRepository,times(1)).save(doctorEntity);
		
	}
}
