<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service Page</title>
</head>
<body>
	<h1>This is Service page</h1>
	<h2>Service in Spring MVC..</h2>
	<h3>Called by Service Controller - url: /service</h3>

	<h2>Name is: ${name}</h2>
	<h2>ID is: ${id}</h2>
	<h2>Time is: ${time}</h2>
	<hr>
	<h2>Friends List: ${friendList}</h2>
	<hr>
	<c:forEach var="item" items="${friendList}">
		<h2>${item}</h2>
	</c:forEach>
</body>
</html>