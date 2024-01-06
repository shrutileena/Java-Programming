<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example of taglib directive</title>
</head>
<body>
	<p:out value="${34+56}"></p:out>
	
	<%! int n1 = 20;
		int n2 = 0;
	%>
	
	<% 
		int division = n1/n2;
	%>
	
	<h1>Division = <%= division %></h1>
</body>
</html>