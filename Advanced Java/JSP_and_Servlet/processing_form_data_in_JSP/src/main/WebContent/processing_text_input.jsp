<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Processing Text Input</title>
</head>
<body>
	Welcome! <%= request.getParameter("first_name")+" "+request.getParameter("last_name") %>
</body>
</html>