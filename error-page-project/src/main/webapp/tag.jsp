<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="/WEB-INF/mylib" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<t:mytag></t:mytag>
	
	<t:printtabletag number="20" color="blue"></t:printtabletag>
	
	<t:printtabletag color="red" number="468"></t:printtabletag>
	
	<%
		out.print("This is implicit object");
		//request.getParameter("");
		//response.sendRedirect("");
		//config(ServletConfig)
		//Application(ServletContext)
		//session
		out.println(session.isNew());
		session.setAttribute("mame", 23);
		//page: current jsp page
		//exception: Throwable
		//pageContext: PageContext
	%>
</body>
</html>