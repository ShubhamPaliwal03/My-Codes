<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>MVC Data</title>
    <style>
        caption 
        {
        	caption-side: top;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container-fluid">
        <table class="table">
        <caption class="text-left"><mark>Students Data</mark></caption>
        	<tr>
	        	<th>First Name</th>
	        	<th>Last Name</th>
	        	<th>Age</th>        	
        	</tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.firstname}</td>
                    <td>${student.lastname}</td>
                    <td>${student.age}</td>
<%--                    <td><% student.getAge() %></td>--%>
                </tr>
            </c:forEach>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>