<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- page directive tag -->
<%@page import="java.util.Random, java.util.ArrayList, java.io.*"%>

<%@page isErrorPage="true"%>

<%@page session="false"%>

<%-- <%@page extends="" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP Page</title>
<style>
* {
	margin: 0px;
	padding: 0px;
}
</style>
</head>
<body>
	<h1>First JSP Page</h1>

	<!-- 	declarative tags -->
	<%!int a = 2;
	int b = 3;
	String name = "Shruti Agarwal";

	public int doSum() {
		return a + b;
	}

	public String reverse() {
		StringBuilder rname = new StringBuilder(name);
		rname = rname.reverse();
		return rname.toString();
	}%>

	<!-- Scriptlet tags -->
	<%
	out.println(a);
	out.println("<br>");
	out.println(b);
	out.println("<br>");
	out.println("Sum is: " + doSum());
	out.println("<br>");
	out.println("reverse is: " + reverse());
	%>

	<!-- expression tags -->
	<h1>
		Sum is:
		<%=doSum()%></h1>
	<h1>
		Reverse is:
		<%=reverse()%></h1>
	<h1><%=name%></h1>

	<br>

	<!-- include directive tag -->
	<%@include file="header.jsp"%>

	<!-- <h1>Random number: </h1> -->
	<%
	Random random = new Random();
	int n = random.nextInt(6);
	/* out.println(n); */
	%>

	<h1><%="Random Number: " + n%></h1>

</body>
</html>