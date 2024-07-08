<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Processing Data of Check Boxes</title>
</head>
<body>
	<%
		String[] courses = request.getParameterValues("course");
		
		if(courses != null)
		{
			%>
				<ins><strong>You have selected the following courses :</strong></ins>
				<ol>
					<%
						for(String course : courses)
						{
							out.print("<li>"+course+"</li>");
						}
					%>
				</ol>
			<%
		}
	%>
	<%	
		if(courses == null)
		{
			%>
				You haven't selected any course yet
				
				<br><a href="passing_data_of_checkboxes.jsp">Select Now</a>
			<%
		}
	%>
</body>
</html>