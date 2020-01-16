package org.deloitte.sms.studentstaffdetailsmanagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FEES_INFO")
public class FeesInfo {
	@Id
	private String standard;
	@Column
	private int age;
	@Column
	private double stdFees;
	@Column
	private double transport_Fee;
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getStdFees() {
		return stdFees;
	}
	public void setStdFees(double stdFees) {
		this.stdFees = stdFees;
	}
	public double getTransport_Fee() {
		return transport_Fee;
	}
	public void setTransport_Fee(double transport_Fee) {
		this.transport_Fee = transport_Fee;
	}
}
