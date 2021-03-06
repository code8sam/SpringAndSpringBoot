<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Employees</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container-fluid">
		<h1 class="display-1">CURD Operations</h1>

		<ul class="nav nav-tabs">
			<li class="nav-item"><a class="nav-link" aria-current="page" href="./display">All Employees</a></li>
			<li class="nav-item"><a class="nav-link active" href="./insert">Add Employee</a></li>
		</ul>
	<div class="container-sm container-fluid">
		<form action="insertEmp">
		<div class="row mb-3">
		    <label for="inputEmail3" class="col-sm-2 col-form-label">Name</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail3" name="name">
		    </div>
		  </div>
		  <div class="row mb-3">
		    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
		    <div class="col-sm-10">
		      <input type="email" class="form-control" id="inputEmail3" name="email">
		    </div>
		  </div>
		  <div class="row mb-3">
		    <label for="inputPassword3" class="col-sm-2 col-form-label">Date Of Birth</label>
		    <div class="col-sm-10">
		      <input type="date" class="form-control" id="inputPassword3" name="dob">
		    </div>
		  </div>
		   <div class="row mb-3">
		    <label for="inputPassword3" class="col-sm-2 col-form-label">Salary</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputPassword3" name="salary">
		    </div>
		  </div>
		  
		  <fieldset class="row mb-3">
		    <legend class="col-form-label col-sm-2 pt-0">Status</legend>
		    <div class="col-sm-10">
		      <div class="form-check">
		        <input class="form-check-input" type="radio" name="status" id="gridRadios1" value="true" checked>
		        <label class="form-check-label" for="gridRadios1">
		          Active
		        </label>
		      </div>
		      <div class="form-check">
		        <input class="form-check-input" type="radio" name="status" id="gridRadios2" value="false">
		        <label class="form-check-label" for="gridRadios2">
		          Inactive
		        </label>
		      </div>
		    </div>
		  </fieldset>
		 
		  <button type="submit" class="btn btn-primary">Add Employee</button>
		</form>
		</div>

	</div>
</body>
</html>