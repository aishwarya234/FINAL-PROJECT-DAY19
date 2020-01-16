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
<H2>ENTER VALUES TO UPDATE THE FIELDS</H2><BR>
<BR>
<form action="finalupdatestaff" method="post">
Address:<input type="text"  name="address" value="${stf.address}" ><br>
Country Id:<input type="text"  name="country_Id" value="${stf.country_Id}" ><br>
State:<input type="text"  name="state" value="${stf.state}" ><br>
Designation:<input type="text"  name="designation" value="${stf.designation}" ><br>
Contact no:<input type="text" name="contact_No"  value="${stf.contact_No}" ><br>
Email:<input type="email" name="emailId" value="${stf.emailId}"><br>
Experience:<input type="text" name="experience"  value="${stf.experience}" ><br>
<input type="submit" value="UPDATE">
</form>
</body>
</html>

