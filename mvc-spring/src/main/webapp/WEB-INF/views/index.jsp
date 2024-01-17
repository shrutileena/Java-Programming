<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Home Page</title>
</head>
<body>
	<h2>This is Home Page</h2>
	<br>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	<h2>
		My name is
		<%=name%></h2>
	<h2>
		My Id is
		<%=id%>
	</h2>
	<h2>My friends are 
		<%
			for(String s:friends){
				out.println(s+", ");
			}
		%>
	</h2>
</body>
</html>
