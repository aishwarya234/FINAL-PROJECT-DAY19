<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="finalupdatestaff" method="get">
		Staff id:<input type="text" name="staff_Id" value="${stf.staff_Id}" }><br>
		Name:<input type="text" name="staff_Name" value="${stf.staff_Name}"><br> 
		Date of birth:<input type="text" name="date_Of_Birth" value="${stf.date_Of_Birth}"><br> 
		Address:<input type="text" name="address" value="${stf.address}" > <br>
		Country ID:<input type="text" name="country_Id" value="${stf.country_Id}"><br>
		Gender:<input type="text" name="gender" value="${stf.gender}"><br>
		Salary:<input type="text" name="salary" value="${stf.salary}"><br>  
		Highest Qualification:<input type="text" name="highest_Qualification" value="${stf.highest_Qualification}"><br>  
		Email Id:<input type="email" name="emailId" value="${stf.emailId}"><br>  
		Contact no:<input type="text" name="contact_Number" value="${stf.contact_Number}"><br>  
 		Designation:<input type="text" name="designation" value="${stf.designation}"><br>  
 		Year of passing:<input type="text" name="year_Passed_Out" value="${stf.year_Passed_Out}"><br>  
		Experience:<input type="text" name="experience" value="${stf.experience}"><br> 
		Date of joining:<input type="text" name="doj" value="${stf.doj}"><br><br> 
		<input type="submit" value="UPDATE">
		
	</form>
</body>
</html>