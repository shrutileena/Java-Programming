<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDateTime"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
<h1>Help Page</h1>
<% String name = (String) request.getAttribute("name");
Integer id = (Integer) request.getAttribute("id");
LocalDateTime date = (LocalDateTime) request.getAttribute("time");
@SuppressWarnings("unchecked")
List<Integer> marks = (List<Integer>) request.getAttribute("marks");
//
%>
<h1><%= name+" - "+id+" " %><br><%= date %></h1>

<h1>${name }</h1>
<h1>${id }</h1>
<h1>${time }</h1>

<c:forEach var="item" items="${marks }"> <c:out value="${item }"></c:out> </c:forEach>
<%-- <h1>${item}</h1> --%>
</body>
</html>