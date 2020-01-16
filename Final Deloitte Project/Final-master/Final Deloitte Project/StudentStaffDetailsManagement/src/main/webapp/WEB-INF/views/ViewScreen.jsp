<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%--     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script >
function student(){
location.replace("http://localhost:8080/StudentStaffDetailsManagement/viewstudent");
}

function staff(){
location.replace("http://localhost:8080/StudentStaffDetailsManagement/viewstaff");
}


</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>STUDENT STAFF DETAILS MANAGEMENT SYSTEM</h2>
<BR>
<BR>
<BR>
<button onclick="student()">STUDENT</button>
<button onclick="staff()">STAFF</button>

</body>
</html>
