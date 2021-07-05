package com.abc.healthcenter.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * This is Entity Class maps with doctor_tbl in the database
 * @author admin
 *
 * date: Jul 5, 2021
 */
@Entity

@Table(name="doctor_tbl")
public class DoctorEntity {

	@Id
	@Column(name="doctor_id")
	private int doctorID;

	@Column(name="doctor_name")
	private String doctorName;
	
	@Column(name="user_name")
	private String doctoruserName;
	
	@Column(name="password")
	private String doctorpassword;

	@Column(name="doctor_email")
	private  String doctorEmail;

	@Column(name="doctor_contact")
	private long doctorContact;

	@Column(name="doctor_gender")
	private String doctorGender;

	@Column(name="doctor_experience")
	private int doctorExperience;

	@Column(name="doctor_department")
	private String doctorDepartment;

	@Column(name="doctor_qualification")
	private String doctorQualification;
	
	@Column(name = "doctor_address")
	private String doctorAddress;
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List <AppointmentEntity> appointments = new ArrayList <>();
	
	
	
	
	/**
	 * 
	 * @return UserName of the Doctor
	 */
	public String getDoctoruserName() {
		return doctoruserName;
	}
	/**
	 * 
	 * @param doctoruserName
	 */
	public void setDoctoruserName(String doctoruserName) {
		this.doctoruserName = doctoruserName;
	}
	/**
	 * 
	 * @return
	 */
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


