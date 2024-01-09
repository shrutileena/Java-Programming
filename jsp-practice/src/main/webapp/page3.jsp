<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 1</title>
</head>
<body>
	<h1>This is page 3</h1>
	
	<% 
	out.println("<h1>Oops! redirected to Page 3...</h1>");
	/* 
	response.wait(3000); */
	
	response.sendRedirect("https://www.google.com");
	%>
</body>
</html>