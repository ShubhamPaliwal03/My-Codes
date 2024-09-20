<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Declaration Example</title>
</head>
<body>
	<h1>JSP Declaration Example</h1>
	<!-- Method Declaration -->
	<%!
		static String getLowerCaseString(String s)
		{
			return s.toLowerCase();
		}
	%>
	<p>SHUBHAM PALIWAL in small case is : <%= getLowerCaseString("SHUBHAM PALIWAL") %></p>
	<!-- Variable Declaration -->
	<%!
		int i = 5;
	%>
</body>
</html>