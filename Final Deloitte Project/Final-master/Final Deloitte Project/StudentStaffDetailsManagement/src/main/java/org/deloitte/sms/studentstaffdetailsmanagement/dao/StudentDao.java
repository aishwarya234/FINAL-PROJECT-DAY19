package org.deloitte.sms.studentstaffdetailsmanagement.dao;

import java.util.List;

import org.deloitte.sms.studentstaffdetailsmanagement.beans.StudentInfo;

public interface StudentDao {

	List<StudentInfo> getStudents();

	StudentInfo getStudents(String code);

	void studentUpdate(StudentInfo std);

	//StudentInfo getStudents(int code);

	//void studentUpdate(StudentInfo std);

}
