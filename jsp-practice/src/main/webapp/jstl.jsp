<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>    --%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example of taglib directive</title>
</head>
<body>
<!-- 	taglib directive tag -->
	<h1></h1>
 	<c:set var="name" value="Shruti"></c:set>
	
	<c:out value="${name}"></c:out>
	
	<c:if test="${3>2}"><h2>this is true block 3>2</h2></c:if>
	<c:if test="${3<2}"><h2>this is true block 3>2</h2></c:if>
	
<%-- 	<p:out value="${34+64}"></p:out> --%>
</body>
</html>