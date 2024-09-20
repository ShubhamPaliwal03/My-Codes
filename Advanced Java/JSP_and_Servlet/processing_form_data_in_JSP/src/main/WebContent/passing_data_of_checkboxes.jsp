<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Passing Data Of Check Boxes</title>
</head>
<body>
	<form action="processing_data_of_checkboxes.jsp" method="post">
		Select the courses you would like to study :
		<br>
		<label>
			Core Java<input type="checkbox" name="course" value="Core Java"/>
		</label>
		<label>
			PHP<input type="checkbox" name="course" value="PHP"/>
		</label>
		<label>	
			React<input type="checkbox" name="course" value="React"/>
		</label>
		<label>	
			SpringBoot<input type="checkbox" name="course" value="Springboot">
		</label>
		<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>