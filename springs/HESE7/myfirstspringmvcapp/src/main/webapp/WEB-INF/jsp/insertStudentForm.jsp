<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert student</title>
</head>
<body>
	<h1>Insert Page</h1>
	
	<form action="insertStudent" method="POST">
		<label>Student Id</label>
		<input type="text" name="id">
		<br><br>
		
		<label>Student First Name</label>
		<input type="text" name="firstName">
		<br><br>
		
		<label>Student Last Name</label>
		<input type="text" name="lastName">
		<br><br>
		
		<label>Student marks</label>
		<input type="text" name="marks">
		<br><br>
		
		<label>Student Mail Id</label>
		<input type="text" name="mailId">
		<br><br>
		
		<label>Student Password</label>
		<input type="text" name="password">
		<br><br>
		
		<input type="submit">
	</form>
</body>
</html>