<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is our Home page</h1>
	<h2>Welcome to Spring MVC..</h2>
	<h3>Called by Home Controller - url: /home</h3>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> list = (List<String>) request.getAttribute("friend");
	%>
	<h2>
		Name is:
		<%=name%></h2>
	<h2>
		ID is:
		<%=id%></h2>

	<%
	for (String s : list) {
	%>
	<h3><%=s%></h3>
	<%
	}
	%>
</body>
</html>