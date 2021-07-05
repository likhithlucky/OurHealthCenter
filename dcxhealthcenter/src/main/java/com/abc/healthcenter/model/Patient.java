/**
 * 
 */
package com.abc.healthcenter.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.abc.healthcenter.entity.AppointmentEntity;
import com.abc.healthcenter.entity.PaymentEntity;

/**
 * Model Class Of Patient
 * @author Likhith  A S
 *
 * date: Jul 5, 2021

 */
public class Patient{
	
	private int patientId ;
	
	@NotEmpty(message = "Patient Name is required")
	private String patientName;
	
	@NotEmpty(message = "Patient UserName is required")
	private String patientuserName;
	
	@NotEmpty(message = "Patient Password is required")
	private String patientpassword;
	
	@NotNull(message = "Patient Age is required")
	private int patientAge;
	
	@NotEmpty(message = "Patient Gender is required")
	private String patientGender;
	
	@NotEmpty(message = "Patient Address is required")
	private String patientAddress;
	
	@NotEmpty(message = "Patient Email is required")
	private String patientEmail;
	
	@NotNull(message = "Patient Contact is required")
	private long patientContact;
	
	@NotEmpty(message = "Patient Message is required")
	private String patientMessage;
	
	
	private List <AppointmentEntity> appointments = new ArrayList <>();
	
	
	private List<PaymentEntity> payments = new ArrayList<>();
	


	public String getPatientuserName() {
		return patientuserName;
	}

	public void setPatientuserName(String patientuserName) {
		this.patientuserName = patientuserName;
	}

	public String getPatientpassword() {
		return patientpassword;
	}

	public void setPatientpassword(String patientpassword) {
		this.patientpassword = patientpassword;
	}

	public List<AppointmentEntity> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}

	public List<PaymentEntity> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentEntity> payments) {
		this.payments = payments;
	}

	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public long getPatientContact() {
		return patientContact;
	}

	public void setPatientContact(long patientContact) {
		this.patientContact = patientContact;
	}

	public String getPatientMessage() {
		return patientMessage;
	}

	public void setPatientMessage(String patientMessage) {
		this.patientMessage = patientMessage;
	}
}
	