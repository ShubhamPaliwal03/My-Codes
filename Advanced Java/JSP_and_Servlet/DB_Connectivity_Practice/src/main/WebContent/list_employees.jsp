<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
	<div class="wrapper">
		<div class="heading">
			<h2>Bikaner Technical University</h2>
		</div>
	</div>
	<div class="container">
		<table>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Designation</th>
				<th>Salary</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
			<c:forEach var="employee" items="${EMPLOYEES}">
				<!-- create update and delete links for each student -->
				<c:url var="updateLink" value="EmployeeControllerServlet">
					<c:param name="command" value="LOAD"/>
					<c:param name="employeeId" value="${employee.id}"/>
				</c:url>
				<c:url var="deleteLink" value="EmployeeControllerServlet">
					<c:param name="command" value="DELETE"/>
					<c:param name="employeeId" value="${employee.id}"/>
				</c:url>
				<tr>
					<td>${employee.id}</td>
					<td>${employee.firstname}</td>
					<td>${employee.lastname}</td>
					<td>${employee.designation}</td>
					<td>${employee.salary}</td>
					<td>${employee.email}</td>
					<td>
						<a href="${updateLink}">Update</a>
						|
						<a href="${deleteLink}" onclick="if(!confirm('Are you sure you want to delete this record?')) return false;">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<input type="button" value="Add New Record" onclick="window.location.href='add_employee_form.jsp'; return false;" />
	</div>
</body>
</html>