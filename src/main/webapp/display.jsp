<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body style="background-color: lightgreen">
	<div align="center">
		<h1 style="color: blue;">Result is : </h1>
	
		<h2 style="color: fuchsia;"><%= request.getAttribute("result") %></h2>
	</div>
</body>
</html>