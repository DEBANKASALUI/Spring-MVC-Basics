<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
	<p class="text-center">${Header}</p>
	<p class="text-center">${Desc}</p>
	<hr>
	<!-- Using Request Param: -->
	<%-- <h1>Signed Up Successfully!</h1>
	<h2>Welcome, ${name}</h2>
	<h2>Registered email ID: ${email}</h2>
	<h3>Password is: **** ${password}</h3>
	<h3>Try to secure your password</h3> --%>

	<!--Using Model Class & Request Param and also ModelAttribute Annotation -->
	<h1>Signed Up Successfully!</h1>
	<h2>Welcome, ${user.name}</h2>
	<h2>Registered email ID: ${user.email}</h2>
	<h3>Password is: **** ${user.password}</h3>
	<h3>Try to secure your password</h3>
	<h2 style="color:green">${msg}</h2>

</body>
</html>