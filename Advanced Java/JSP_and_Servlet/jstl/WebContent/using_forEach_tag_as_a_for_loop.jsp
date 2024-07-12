<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Using forEach tag as a for loop</title>
</head>
<body>
	<c:forEach var="i" begin="1" end="6" step="1">
		Value <c:out value="${i}"/><br>
	</c:forEach>
</body>
</html>