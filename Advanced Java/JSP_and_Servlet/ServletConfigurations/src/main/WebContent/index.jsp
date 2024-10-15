<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Trying out servlet configurations!" %></h1>
<br/>
<form method="get" action="helloServlet">
  <input type="submit" value="Make Request">
</form>
</body>
</html>