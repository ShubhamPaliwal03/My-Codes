<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example of a Scriptlet</title>
</head>
<body>
	<h1>This is an example of a Scriptlet</h1>
	<%
		int i;
	
		for(i = 1; i <= 5; i++)
		{
			out.println("<br><p>We love C Institute "+i+"</p>");
		}
	%>
</body>
</html>