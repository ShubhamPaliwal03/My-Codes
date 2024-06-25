<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Import the class(es using JSP page directive -->
<%@ page import="com.shubhampaliwal.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Create Student object using JSP declaration -->
	<%! Student s1 = new Student("Shubham Paliwal", "B.Tech. CSE", 37); %>
	
	<!-- Access class members -->
	<p>Name of the Student : <%= s1.getName() %></p>
	<p>Course enrolled in : <%= s1.getCourse() %></p>
	<p>Roll Number : <%= s1.getRoll() %></p>
</body>
</html>