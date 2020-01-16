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
<form action="finalupdatestudent" method="post">
Address:<input type="text"  name="address" value="${std.address}" ><br>
Contact no:<input type="text" name="contact_No"  value="${std.contact_No}" ><br>
Email:<input type="email" name="mail_Id" value="${std.mail_Id}"><br>
Transport<input type="text" name="transport" value="${std.transport}"><br>
<input type="submit" value="Update">
</form>
</body>
</html>

