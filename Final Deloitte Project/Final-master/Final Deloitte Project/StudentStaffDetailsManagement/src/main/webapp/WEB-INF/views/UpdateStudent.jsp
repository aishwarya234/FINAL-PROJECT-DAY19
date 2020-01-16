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
<form action="studentupdate" method="post">
Student id:<input type="text" name="student_Id"  value="${std.student_Id}" readonly="readonly" ><br>
Student name:<input type="text" name="student_Name"  value="${std.student_Name}"readonly="readonly" ><br>
Date of birth:<input type="date" name="date_Of_Birth" value="${std.date_Of_Birth}"readonly="readonly"><br>
Guardian type=<input type="text" name= "guardian_type" value="${std.guardian_Type}" readonly="readonly" ><br>
Guardian name=<input type="text" name= "guardian_name" value="${std.guardian_Name}" readonly="readonly"><br>
<u>Address:</u><input type="text"  name="address" value="${std.address}" ><br>
Country ID=<input type="text" name= "country_Id" value="${std.country_Id}" readonly="readonly" ><br>
<u>Contact no</u>:<input type="text" name="contact_No"  value="${std.contact_No}" ><br>
<u>Email</u>:<input type="email" name="mail_Id" value="${std.mail_Id}"  ><br>
Gender:<input type="text" name="gender" value="${std.gender}" readonly="readonly"><br>
Standard:<input type="text" name="standard"  value="${std.standard}" readonly="readonly"><br>
Standard category:<input type="text" name="standard_category"  value="${std.standard_Category}" readonly="readonly" ><br>
<u>Transport</u><input type="text" name="transport" value="${std.transport}">
NetFees:<input type="text" name="net_Fees" value="${std.net_Fees} " readonly="readonly"><br>
<input type="submit" value="Update">
</form>
</body>
</html>

