<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Responses - Copy</title>
<style>
	.app-container
	{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		height: 100vh;
		width: 100vw;
	}
	#main-heading
	{
		margin-bottom: 2rem;
	}
	.info-value
	{
		font-weight: 400;
		font-size: 1.5rem;
	}
	#main-heading
	{
		text-decoration: underline;
	}
</style>
</head>
<body>
	<%
		if(request.getParameter("submit") != null)
		{
			String[] hobbies = request.getParameterValues("hobbies");
			
			request.setAttribute("hobbiesList", hobbies);
			
			%>
				<div class="app-container">
					<h1 id="main-heading">Here's a copy of your responses :-</h1>
					<div class="response-container">
						<h3 class="info-name">First Name : <span class="info-value">${param.firstname}</span></h3>
						<h3 class="info-name">Last Name : <span class="info-value">${param.lastname}</span></h3>
						<h3 class="info-name">Email : <span class="info-value">${param.email}</span></h3>
						<h3 class="info-name">Age : <span class="info-value">${param.age}</span></h3>
						<h3 class="info-name">Gender : <span class="info-value">${param.gender}</span></h3>
						<h3 class="info-name">Hobbies :</h3>
						<ul>
							<c:forEach var="hobbyName" items="${hobbiesList}">
								<li class="info-value">${hobbyName}</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			<%
		}
		else
		{
			%><h1>Request from unknown source...Submit Your Form to View Your Responses!</h1>><%
		}
	%>
</body>
</html>