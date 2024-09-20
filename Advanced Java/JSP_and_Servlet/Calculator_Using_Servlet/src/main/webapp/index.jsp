<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <style>
    #result {

      color: green;
    }
  </style>
</head>
<body>
<h1><%= "Welcome To Calculator Running on Servlet" %></h1>
<br/>
<form action="hello-servlet" method="post">
  <div>
    <label>Number 1
      <input type="number" name="num1">
    </label>
  </div>
  <br>
  <div>
    <label>Number 2
      <input type="number" name="num2">
    </label>
  </div>
  <br>
  <div>
    Operation
    <label>
      <input type="radio" value="add" name="operation">
      +
    </label>
    <label>
      <input type="radio" value="sub" name="operation">
      -
    </label>
    <label>
      <input type="radio" value="mul" name="operation">
      *
    </label>
    <label>
      <input type="radio" value="div" name="operation">
      /
    </label>
  </div>
  <br>
  <input type="submit" value="Get Result">
</form>
</body>
</html>