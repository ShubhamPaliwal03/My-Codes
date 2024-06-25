<html>
	<head></head>
	<body>
		<h3>This is a hello world program using JSP</h3>
		<p>The current time is : <%= new java.util.Date()%> &nbsp;(This is the output of an expression)</p>
		<p>The value of i is : <% int i = 0; out.print(i);%> &nbsp;(This is the output of a scriptlet)</p>
		<p><% out.print(new String("Hello World").toUpperCase()); %> &nbsp;(This is the output of a scriptlet)</p>
		<p><%= i = 5 %> &nbsp;(This is the output of an expression)</p>
		<%-- <p>The new value of p is : <% out.print(i)%></p> --%> 
		<!-- This is an invalid JSP expression, as print() function doesn't return anything, hence it is not an expression -->
	</body>
</html>