package org.deloitte.sms.studentstaffdetailsmanagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Mark_Primary")
public class StudentMarkPrimary {
	@Id
    private String student_Id;
	@Column
    private int english_Mark;
	@Column
    private int hindi_Mark;
	@Column
    private int science_Mark;
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
	public int getHindi_Mark() {
		return hindi_Mark;
	}
	public void setHindi_Mark(int hindi_Mark) {
		this.hindi_Mark = hindi_Mark;
	}
	public int getScience_Mark() {
		return science_Mark;
	}
	public void setScience_Mark(int science_Mark) {
		this.science_Mark = science_Mark;
	}
	public int getMaths_Mark() {
		return maths_Mark;
	}
	public void setMaths_Mark(int maths_Mark) {
		this.maths_Mark = maths_Mark;
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
