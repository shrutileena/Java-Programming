<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tags</title>
</head>
<body>
	<h1>Function tags</h1>
	<p>This page is about using function tags</p>
	
	<p:set var="name" value="shruti"></p:set>
	<p:out value="${ name }"></p:out>
	
	<!-- length -->
	<h1>Length of above name is: <p:out value="${f:length(name)}"></p:out> </h1>
	
	<!-- lowercase -->
	<h1>Lowercase: <p:out value="${f:toLowerCase(name)}"></p:out> </h1>
	
	<!-- uppercase -->
	<h1>Uppercase: <p:out value="${f:toUpperCase(name)}"></p:out> </h1>
	
	<!-- contains -->
	<h1>Contains: <p:out value="${f:contains(name, 'shrut agarwal')}"></p:out> </h1>
</body>
</html>