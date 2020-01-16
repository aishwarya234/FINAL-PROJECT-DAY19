package org.deloitte.sms.studentstaffdetailsmanagement.controller;

import java.util.List;

import org.deloitte.sms.studentstaffdetailsmanagement.beans.StaffInfo;

//import java.util.List;

//import org.deloitte.sms.studentstaffdetailsmanagement.beans.StaffInfo;
import org.deloitte.sms.studentstaffdetailsmanagement.beans.StudentInfo;
import org.deloitte.sms.studentstaffdetailsmanagement.dao.StaffDao;
//import org.deloitte.sms.studentstaffdetailsmanagement.dao.StaffDao;
import org.deloitte.sms.studentstaffdetailsmanagement.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentStaffController {
	@Autowired
	StudentDao dao;
	@Autowired
	StaffDao dao1;
	
	
	
	@RequestMapping(value="/viewscreen",method=RequestMethod.GET)
	public String  showViewScreen(){
		return "ViewScreen";
		}
	
	
	//for displaying studentinfo table
	@RequestMapping(value="/viewstudent")
	public ModelAndView getStudent(){
		
		ModelAndView mav=new ModelAndView();
		List<StudentInfo> list=dao.getStudents();
		mav.addObject("student",list);
		mav.setViewName("ViewStudent");
		return mav;	
		
	}
	//for updating studnet details
	@RequestMapping(value="/studentupdate",method=RequestMethod.GET)
	public ModelAndView showUpdateStudentForm(@RequestParam("code")String code){
		StudentInfo std=dao.getStudents(code); 
		ModelAndView mav=new ModelAndView();
		mav.addObject("std",std);
		mav.setViewName("UpdateStudent");
		return mav;
	}
	@RequestMapping(value="/studentupdate",method=RequestMethod.POST)
	public ModelAndView UpdateStudent(@ModelAttribute("StudentInfo")StudentInfo std){
		ModelAndView mav=new ModelAndView();
		dao.studentUpdate(std);   
	
		mav.setViewName("redirect:viewstudent");
		return mav;
	}
	
//	@RequestMapping(value="/finalupdatestudent",method=RequestMethod.GET)
//	public String  showFinalUpdateStudentForm(){
//		
//		return "FinalUpdateStudent";
//		}
//	
//	
//	@RequestMapping(value="/finalupdatestudent",method=RequestMethod.POST)
//	public ModelAndView updateStudent(@ModelAttribute("student")StudentInfo std){
//		
//		ModelAndView mav=new ModelAndView();
//		dao.studentUpdate(std);
//	
//		mav.setViewName("redirect:studentupdate");
//		return mav;
//	}
//	
	
	//--------------------staff-------------------------------------------------------------

	
	

	
	//for displaying staffinfo table
	@RequestMapping(value="/viewstaff")
	public ModelAndView getStaff(){
		
		ModelAndView mav=new ModelAndView();
		List<StaffInfo> list1=dao1.getStaffs();
		mav.addObject("staff",list1);
		mav.setViewName("ViewStaff");
		return mav;	
		
	}
	


	@RequestMapping(value="/staffupdate",method=RequestMethod.GET)
	public ModelAndView showUpdateStaffForm(String code){
		
		StaffInfo std=dao1.getStaff(code);
		ModelAndView mav=new ModelAndView();
		mav.addObject("stf",std);
		mav.setViewName("UpdateStaff");
		return mav;
	}
	
	@RequestMapping(value="/finalupdatestaff",method=RequestMethod.GET)
		public ModelAndView showFinalUpdateStaffForm(@RequestParam("staff_Id")String staff_Id){
		
		
		StaffInfo stf=dao1.getStaff(staff_Id);
		ModelAndView mav=new ModelAndView();
		mav.addObject("stf",stf);
		mav.setViewName("FinalUpadteStaff");
		return mav;
	}
		
	
	
	@RequestMapping(value="/finalupdatestaff",method=RequestMethod.POST)
	public ModelAndView updateStaff(@ModelAttribute("staff")StaffInfo stf){
		
		ModelAndView mav=new ModelAndView();
		dao1.staffUpdate(stf);
	
		mav.setViewName("redirect:staffupdate");
		return mav;
	}
	
	
	//---------------------------------------
	/*@RequestMapping(value="/updatecustomer",method=RequestMethod.GET)
	public ModelAndView showUpdateCustomerForm(int code){
		
		Customer cust=dao.getCustomers(code);
		ModelAndView mav=new ModelAndView();
		mav.addObject("cust",cust);
		mav.setViewName("UpdateCustomer");
		return mav;
	}
	@RequestMapping(value="/updatecustomers",method=RequestMethod.POST)
	public ModelAndView updateCustomers(@ModelAttribute("customer")Customer cust){
		
		ModelAndView mav=new ModelAndView();
		dao.updateCustomers(cust);
	
		mav.setViewName("redirect:viewcustomers");
		return mav;
	}*/
	
	
	
	
}
