package org.deloitte.sms.studentstaffdetailsmanagement.dao.impl;

import java.util.List;

import org.deloitte.sms.studentstaffdetailsmanagement.beans.StaffInfo;
import org.deloitte.sms.studentstaffdetailsmanagement.beans.StudentInfo;
import org.deloitte.sms.studentstaffdetailsmanagement.dao.StaffDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository

public class StaffDaoImpl implements StaffDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<StaffInfo> getStaffs() {
		
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StaffInfo> list=session.createQuery("from StaffInfo").list();
		 
		return list;
		
	}

	public StaffInfo getStaff(String code) {

		Session session=sessionFactory.openSession();
		StaffInfo stf= (StaffInfo) session.get(StaffInfo.class, code);
		return stf;
	}

	public void staffUpdate(StaffInfo stf) {
		Session session=sessionFactory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		session.update(stf);
		try{
		tx.commit();}
		
		catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		
	}

}
