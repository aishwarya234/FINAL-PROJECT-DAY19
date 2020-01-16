package org.deloitte.sms.studentstaffdetailsmanagement.dao.impl;

import java.util.List;

import org.deloitte.sms.studentstaffdetailsmanagement.beans.StudentInfo;
import org.deloitte.sms.studentstaffdetailsmanagement.dao.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository

public class StudentDaoImpl implements StudentDao {
@Autowired
SessionFactory sessionfactory;
public List<StudentInfo> getStudents() {
	
	
Session session=sessionfactory.openSession();
@SuppressWarnings("unchecked")
List<StudentInfo> list=session.createQuery("from StudentInfo").list();
for(StudentInfo std : list)
	System.out.println(std.getContact_No()+std.getStudent_Name()); 
return list;
}
public StudentInfo getStudents(String code) {

		Session session=sessionfactory.openSession();
		StudentInfo stud= (StudentInfo) session.get(StudentInfo.class, code);
		return stud;
		
	}
public void studentUpdate(StudentInfo std) {

	Session session=sessionfactory.openSession();
	org.hibernate.Transaction tx=session.beginTransaction();
	session.update(std);
	try{
	tx.commit();}
	
	catch(Exception e){
		e.printStackTrace();
	}
	session.close();
	
	
}



}
