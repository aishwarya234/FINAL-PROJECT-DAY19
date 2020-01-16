package org.deloitte.sms.studentstaffdetailsmanagement.dao;

import java.util.List;

import org.deloitte.sms.studentstaffdetailsmanagement.beans.StaffInfo;

public interface StaffDao {

	List<StaffInfo> getStaffs();

	StaffInfo getStaff(String code);



	void staffUpdate(StaffInfo stf);

	//void studentUpdate(org.deloitte.sms.studentstaffdetailsmanagement.beans.StaffInfo stf);

	//List<StaffInfo> getStaffs();

}
