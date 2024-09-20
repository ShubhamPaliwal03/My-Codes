<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accessing Text Input</title>
</head>
<body>
	<form action="processing_text_input.jsp" method="post">
		<label for="first_name">Enter your first name: </label>
		<input id="first_name" type="text" name="first_name"/>
		<br>
		<label for="last_name">Enter your last name: </label>
		<input id="name" type="text" name="last_name"/>
		<br>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>