package org.deloitte.sms.studentstaffdetailsmanagement.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_INFO")
public class StaffInfo {

	@Id
	@Column(length=5)
	private String staff_Id;
	@Column(length=25)
	private String staff_Name;
	@Column(length=30)
	private Date date_Of_Birth;
	
	@Column(length=50)
	private String address;
	@Column(length=5)
	private String country_Id;
	
	@Column
	private char gender;
	@Column
	private double salary;
	@Column(length=20)
	private String highest_Qualification;
	@Column(length=20)
	private String emailId;
	@Column
	private long contact_Number;
	@Column(length=20)
	private String designation;
	@Column
	private int year_Passed_Out;
	@Column
	private int experience;
	@Column(length=30)
	private Date doj;
	public String getStaff_Id() {
		return staff_Id;
	}
	public void setStaff_Id(String staff_Id) {
		this.staff_Id = staff_Id;
	}
	public String getStaff_Name() {
		return staff_Name;
	}
	public void setStaff_Name(String staff_Name) {
		this.staff_Name = staff_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHighest_Qualification() {
		return highest_Qualification;
	}
	public void setHighest_Qualification(String highest_Qualification) {
		this.highest_Qualification = highest_Qualification;
	}
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getYear_Passed_Out() {
		return year_Passed_Out;
	}
	public void setYear_Passed_Out(int year_Passed_Out) {
		this.year_Passed_Out = year_Passed_Out;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getDate_Of_Birth() {
		return date_Of_Birth;
	}
	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}
	public long getContact_Number() {
		return contact_Number;
	}
	public void setContact_Number(long contact_Number) {
		this.contact_Number = contact_Number;
	}
	public String getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(String country_Id) {
		this.country_Id = country_Id;
	}
}
