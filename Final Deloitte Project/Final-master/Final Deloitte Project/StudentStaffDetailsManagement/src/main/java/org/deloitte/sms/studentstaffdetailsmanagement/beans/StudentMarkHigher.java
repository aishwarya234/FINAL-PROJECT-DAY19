package org.deloitte.sms.studentstaffdetailsmanagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Mark_Higher")
public class StudentMarkHigher {
	@Id
	 private String student_Id;
	@Column
    private int english_Mark;
	@Column
    private int tamil_Mark;
	@Column
    private int physics_Mark;
	@Column
    private int chemistry_Mark;
	@Column
    private int computer_Mark;
	@Column
    private int maths_Mark;
	@Column
    private int total_Mark;
	@Column
    private double average_Mark;
	@Column
    private String grade;
	
	public String getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(String student_Id) {
		this.student_Id = student_Id;
	}
	public int getEnglish_Mark() {
		return english_Mark;
	}
	public void setEnglish_Mark(int english_Mark) {
		this.english_Mark = english_Mark;
	}
	public int getTamil_Mark() {
		return tamil_Mark;
	}
	public void setTamil_Mark(int tamil_Mark) {
		this.tamil_Mark = tamil_Mark;
	}
	public int getPhysics_Mark() {
		return physics_Mark;
	}
	public void setPhysics_Mark(int physics_Mark) {
		this.physics_Mark = physics_Mark;
	}
	public int getChemistry_Mark() {
		return chemistry_Mark;
	}
	public void setChemistry_Mark(int chemistry_Mark) {
		this.chemistry_Mark = chemistry_Mark;
	}
	public int getComputer_Mark() {
		return computer_Mark;
	}
	public void setComputer_Mark(int computer_Mark) {
		this.computer_Mark = computer_Mark;
	}
	public int getMaths_Mark() {
		return maths_Mark;
	}
	public void setMaths_Mark(int maths_Mark) {
		this.maths_Mark = maths_Mark;
	}
	public void setAverage_Mark(double average_Mark) {
		this.average_Mark = average_Mark;
	}
	public int getTotal_Mark() {
		return total_Mark;
	}
	public void setTotal_Mark(int total_Mark) {
		this.total_Mark = total_Mark;
	}
	public double getAverage_Mark() {
		return average_Mark;
	}
	public void setAverage_Mark(int average_Mark) {
		this.average_Mark = average_Mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
    
    

}
