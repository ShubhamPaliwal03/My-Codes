<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Survey Page</title>
<style>
	body
	{
		display: flex;
		justify-content: center;
		align-items: center;
		height: 100vh;
		width: 100vw;
	}
	tr
	{
		margin-bottom: 2rem;
	}
	table
	{
		border-spacing: 2rem;
		border: 1px solid black;
		padding: 2rem;
	}
	input[type="submit"]
	{
		margin-top: 1rem;
	}
	#app-container
	{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		height: 100vh;
		width: 100vw;
	}
</style>
</head>
<body>
	<form action="result.jsp" method="post">
		<div id="app-container">
			<h2>Enter Your Details :-</h2>
			<table>
				<tr>
					<td>
						<label for="firstname"><strong>First Name :</strong></label>
					</td>
					<td>					
						<input id="firstname" type="text" name="firstname" required>
					</td>
				</tr>
				<tr>
					<td>
						<label for="lastname"><strong>Last Name :</strong></label>
					</td>
					<td>					
						<input id="lastname" type="text" name="lastname" required>
					</td>
				</tr>
				<tr>
					<td>
						<label for="email"><strong>Email :</strong></label>
					</td>
					<td>					
						<input id="email" type="email" name="email" required>
					</td>
				</tr>
				<tr>
					<td>
						<label for="age"><strong>Age :</strong></label>
					</td>
					<td>					
						<input id="age" type="number" name="age" required>
					</td>
				</tr>
				<tr>
					<td>
						<label for="gender"><strong>Gender :</strong></label>
					</td>
					<td>					
						<input id="gender" type="radio" name="gender" value="Male"> Male
						<input id="gender" type="radio" name="gender" value="Female">Female
						<input id="gender" type="radio" name="gender" value="Other">Other
					</td>
				</tr>
				<tr>
					<td>
						<label for="hobbies"><strong>Hobbies :</strong></label>
					</td>
					<td>
						<input id="hobbies" type="checkbox" name="hobbies" value="Reading">Reading
						<input id="hobbies" type="checkbox" name="hobbies" value="Traveling">Traveling
						<input id="hobbies" type="checkbox" name="hobbies" value="Cooking">Cooking
						<input id="hobbies" type="checkbox" name="hobbies" value="Sports">Sports
					</td>
				</tr>
			</table>
			<input type="submit" name="submit" value="Submit Response">
		</div>
	</form>
</body>
</html>