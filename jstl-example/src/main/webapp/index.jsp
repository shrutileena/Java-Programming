<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Example</title>
</head>
<body>
	<h1>This is JSTL Example</h1>
	
	<!-- out tag -->
	<p:out value="Hello"></p:out>
	
	<!-- set -->
	<p:set var="i" value="-23" scope="application"></p:set>
	<p:out value="${i}"></p:out>
	
	<!-- remove -->
	<%-- <p:remove var="i"></p:remove>
	<p:out value="${i}"></p:out> --%>
	
	<!-- if: tests condition -->
	<p:if test="${i==23}">
		<p:out value="Yes! i is 23 and condition is true"></p:out>
	</p:if>
	
	<!-- switch -->
	<p:choose>
		<p:when test="${ i>0 }">
			<h1>this is my case first</h1>
			<h2>number is positive</h2>
		</p:when>
		<p:when test="${ i<00 }">
			<h1>this is my case second</h1>
			<h2>number is negative</h2>
		</p:when>
		<p:otherwise>
			<h1>Degault case - otherwise</h1>
			<h1>the number is zero</h1>
		</p:otherwise>
	</p:choose>
	
	<!-- for each -->
	<p:forEach var="j" begin="1" end="10">
		<h1>Value of j is <p:out value="${ j }"></p:out></h1>
	</p:forEach>
	
	<!-- redirect -->
	<%-- <p:redirect url="https://www.google.com"></p:redirect> --%>
	
	<!-- url -->
	<p:url var="myurl" value="https://www.google.com/search">
		<p:param name="q" value="learn code with durgesh servlet"></p:param>
	</p:url>
	
	<h1><p:out value="${ myurl }"></p:out></h1>	
	
	<%-- <p:redirect url="${ myurl }"></p:redirect> --%>
	
	
</body>
</html>