<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert page</title>
</head>
<body>
	<h1>Insert page</h1>
	
	<form action="insert" method="POST">
		<label>Name</label>
		<input type="text" name="name" required="required">
		<br><br>
		
		<label>Email</label>
		<input type="email" name="email" required="required">
		<br><br>
		
		<label>Date Of Birth</label>
		<input type="date" name="dob" required="required">
		<br><br>
		
		<label>Salary</label>
		<input type="text" name="salary" required="required">
		<br><br>
		
		<label>Status</label>
			<input type="radio" name="status" value="true" checked="checked"><label>Active</label>
			<input type="radio" name="status" value="false" ><label>Inactive</label>
		<br><br>
		
		<input type="submit" value="INSERT EMPLOYEE">
	</form>
	
</body>
</html>