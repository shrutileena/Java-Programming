<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isErrorPage="true" %>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<style>
	*{
	margin: 0px;
	padding: 0px;
	}
</style>
</head>
<body>
	<div style="padding: 20px; color: blue; background: #e2e2e2">
		<h1>Sorry! Something went wrong...</h1>
		
		<br>
<!-- 		<p>Note...</p> -->
		<p> <%= exception %></p>
	</div>
</body>
</html>