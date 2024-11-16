<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>This is Help page</h1>
	<h2>Help in Spring MVC..</h2>
	<h3>Called by Help Controller - url: /help</h3>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	%>
	<h2>Name is: <%=name%></h2>
	<h2>ID is: <%=id%></h2>
	<h2>Time is: <%=time%></h2>
</body>
</html>