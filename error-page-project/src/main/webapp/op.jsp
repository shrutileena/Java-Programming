<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="error_ex.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Operation</title>
</head>
<body>
	
	<%
		// fetch two numbers
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		int div = n1/n2;
		
	%>
	
	<h1>Result is: <%= div %></h1>
	
</body>
</html>