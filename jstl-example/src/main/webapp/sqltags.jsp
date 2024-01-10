<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL Tags</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
</head>
<body>
	<h1>All users are -</h1>

	<s:setDataSource driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/servletjsp" user="root"
		password="Q!w2e3r4" var="ds" />

	<s:query dataSource="${ds}" var="rs">select * from user;</s:query>

	<div class="container">
		<table class="table">
			<tr>
				<td>User ID</td>
				<td>User Name</td>
				<td>User ID</td>
			</tr>

			<c:forEach items="${rs.rows}" var="row">
				<tr>
					<td><c:out value="${row.id}"></c:out></td>
					<td><c:out value="${row.name}"></c:out></td>
					<td><c:out value="${row.email}"></c:out></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>