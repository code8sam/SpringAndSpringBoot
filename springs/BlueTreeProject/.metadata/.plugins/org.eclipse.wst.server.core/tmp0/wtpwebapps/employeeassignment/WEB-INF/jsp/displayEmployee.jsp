<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>all employees</title>
</head>
<body>
	<h1>EMPLOYEE CURD OPERATIONS</h1>
	
	<a href="./insertPage">Add Employee</a>
	
	<table border="1" align="center">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>DOB</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Status</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
	
	
	<c:forEach items="${ allEmployees }"  var="emp">
		<tr>  
   			<td>${ emp.id }</td>
   			<td>${ emp.name }</td>
   			<td>${ emp.email }</td>
   			<td>${ emp.dob }</td>
   			<td>${ emp.age }</td>
   			<td>${ emp.salary }</td>
   			<td>${ emp.status }</td>
   			<td><a href="edit?id=${ emp.id }">Edit</a></td>
   			<td><a href="delete?id=${ emp.id }">Delete</a></td>
   		</tr>
	</c:forEach>  
	</table>
	
	
	
</body>
</html>