<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>
</head>
<body>
	<c:set var="currentDate" value="<%= new java.util.Date()%>"/>
	The current time on the server is  ${currentDate}
	<%
		String[] cities = {"Bikaner", "Jaipur", "Udaipur", "Delhi"};
		pageContext.setAttribute("cities", cities);
	%>
	<c:forEach var="city" items="${cities}">
		${city}<hr>
	</c:forEach>
</body>
</html>