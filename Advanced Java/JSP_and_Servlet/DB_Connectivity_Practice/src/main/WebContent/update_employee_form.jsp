<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee </title>
</head>
<body>
	<div class="wrapper">
		<div class="heading">
			<h2>Bikaner Technical University</h2>
		</div>
	</div>
	<div class="container">
		<h3>Update Employee</h3>
		<form action="EmployeeControllerServlet" method="get">
			<input type="hidden" name="command" value="UPDATE">
			<input type="hidden" name="employeeId" value="${EMPLOYEE.id}">
			<table>
				<tbody>
					<tr>
						<td>
							<label>First Name : </label>
						</td>
						<td>
							<input type="text" name="firstname" value="${EMPLOYEE.firstname}">
						</td>
					</tr>
					<tr>
						<td>
							<label>Last Name : </label>
						</td>
						<td>
							<input type="text" name="lastname" value="${EMPLOYEE.lastname}">
						</td>
					</tr>
					<tr>
						<td>
							<label>Designation : </label>
						</td>
						<td>
							<input type="text" name="designation" value="${EMPLOYEE.designation}">
						</td>
					</tr>
					<tr>
						<td>
							<label>Salary : </label>
						</td>
						<td>
							<input type="text" name="salary" value="${EMPLOYEE.salary}">
						</td>
					</tr>
					<tr>
						<td>
							<label>Email : </label>
						</td>
						<td>
							<input type="text" name="email" value="${EMPLOYEE.email}">
						</td>
					</tr>
					<tr>
						<td>
							<label></label>
						</td>
						<td>
							<input type="submit" value="Update Record">
						</td>
					</tr>
				</tbody>
			</table>
		</form>
		<div style="clear: both;"></div>
		<p>
			<a href="EmployeeControllerServlet">Back To List</a>
		</p>
	</div>
</body>
</html>