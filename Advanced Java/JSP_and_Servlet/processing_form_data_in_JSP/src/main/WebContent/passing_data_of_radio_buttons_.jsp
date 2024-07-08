<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Passing Data Of Radio Buttons</title>
</head>
<body>
	<form action="processing_radio_buttons_data.jsp" method="post">
		Select your preferred batch timing : 
		<label>
			<input type="radio" name="timing" value="Morning"/>Morning
		</label>
		<label>
			<input type="radio" name="timing" value="Evening"/>Evening
		</label>
		<br>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>