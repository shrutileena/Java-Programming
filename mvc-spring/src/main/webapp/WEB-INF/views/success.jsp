<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<%-- <h1>Welcome, ${username }</h1>
<h1>Your email is ${email }</h1>
<h1>Your password is ${password }</h1> --%>

<h1 class="text-center">${Header }</h1>
<p class="text-center">${desc }</p>

<h1>Welcome, ${user.username }</h1>
<h1>Your email is ${user.email }</h1>
<h1>Your password is ${user.password }</h1>

<h1>${msg }</h1>
</body>
</html>