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
			<li class="nav-item"><a class="nav-link active"
				aria-current="page" href="./display">All Employees</a></li>
			<li class="nav-item"><a class="nav-link" href="./insert">Add
					Employee</a></li>
		</ul>

		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Date Of Birth</th>
					<th scope="col">Age</th>
					<th scope="col">Salary</th>
					<th scope="col">Status</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ allEmps }" var="emp">
				<tr>
					<td>${ emp.id }</td>
					<td>${ emp.name }</td>
					<td>${ emp.email }</td>
					<td>${ emp.dob }</td>
					<td>${ emp.age }</td>
					<td>${ emp.salary }</td>
					<c:choose>
						<c:when test="${ emp.status }">
							<td>Active</td>
						</c:when>
						<c:otherwise>
							<td>Inactive</td>
						</c:otherwise>
					</c:choose>
					<td><a href="">edit</a></td>
					<td><a href="">delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>