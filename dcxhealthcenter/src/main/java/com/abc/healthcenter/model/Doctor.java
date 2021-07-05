package com.abc.healthcenter.model;





import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.abc.healthcenter.entity.AppointmentEntity;


public class Doctor{

	private int doctorID;

	@NotEmpty(message = "Doctor Name is required")	
	private String doctorName;
	
	@NotEmpty(message = " User Name is required")	
	private String doctoruserName;
	
	@NotEmpty(message = "Password is required")	
	private String doctorpassword;

	@NotEmpty(message = "Email is required")	
	private  String doctorEmail;

	@NotNull(message = "Contact is required")	
	private long doctorContact;

	@NotEmpty(message = "Gender is required")	
	private String doctorGender;

	@NotNull(message = "Experience is required")	
	private int doctorExperience;

	@NotEmpty(message = "Department is required")	
	private String doctorDepartment;

	@NotEmpty(message = "Doctor Qualification is required")	
	private String doctorQualification;
	
	@NotEmpty(message = "Address is required")	
	private String doctorAddress;
	
	
	private List <AppointmentEntity> appointments = new ArrayList <>();
	
	
	
	

	public String getDoctoruserName() {
		return doctoruserName;
	}

	public void setDoctoruserName(String doctoruserName) {
		this.doctoruserName = doctoruserName;
	}

	public String getDoctorpassword() {
		return doctorpassword;
	}

	public void setDoctorpassword(String doctorpassword) {
		this.doctorpassword = doctorpassword;
	}

	public String getDoctorDepartment() {
		return doctorDepartment;
	}

	public void setDoctorDepartment(String doctorDepartment) {
		this.doctorDepartment = doctorDepartment;
	}

	public String getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(String doctortAddress) {
		this.doctorAddress = doctortAddress;
	}

	public List<AppointmentEntity> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public long getDoctorContact() {
		return doctorContact;
	}

	public void setDoctorContact(long doctorContact) {
		this.doctorContact = doctorContact;
	}

	public String getDoctorGender() {
		return doctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public int getDoctorExperience() {
		return doctorExperience;
	}

	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}



	public String getDoctorQualification() {
		return doctorQualification;
	}

	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

}


