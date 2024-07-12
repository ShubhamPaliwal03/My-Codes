<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*, com.shubhampaliwal.Student" %>
<%
	ArrayList<Student> students = new ArrayList<>();

	students.add(new Student("Shubham", "Paliwal", "Advanced Java"));
	students.add(new Student("Mohit", "Bishnoi", "Core Java"));
	students.add(new Student("Vishwajeet", "Negi", "PHP"));
	students.add(new Student("Surender", "Bhati", "Web Development"));
	students.add(new Student("Ujjwal", "Kunwar", "Web Development"));
	
	pageContext.setAttribute("students", students);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./style.css" rel="stylesheet">
<title>Show Students</title>
</head>
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Package Opted</th>
		</tr>
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.firstName}</td> <!-- this implicitly calls the respective getter method (getFirstName in this case) -->
				<td>${student.lastName}</td>
				<td>${student.packageOpted}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>