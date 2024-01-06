<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Something went wrong</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	
	<div class="container p-3 text-center">
	<img alt="error" src="img/error.jpg" class="img-fluid">
		<h1 class="display-3">Sorry! Something went wrong</h1>
		<p class="display-4"><%= exception %></p>
		<a class="btn btn-outline-primary" href="index.html">Home Page</a>
	</div>
</body>
</html>