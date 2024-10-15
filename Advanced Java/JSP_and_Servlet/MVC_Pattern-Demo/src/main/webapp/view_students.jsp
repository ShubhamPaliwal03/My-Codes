<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - View of MVC Pattern</title>
</head>
<body>
<ins><h1><%= "Student Data :-"%></h1></ins>
<br/>
<c:forEach var="student" items="${student_list}">
  ${student}<br>
</c:forEach>
</body>
</html>