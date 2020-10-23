<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" type="text/css"/>
<link href="https://fonts.googleapis.com/css2?family=Krona+One&family=Source+Sans+Pro&display=swap" rel="stylesheet">
</head>
<body>
<header>
	<img src="${pageContext.request.contextPath}/resources/images/company.png"/>
	<a>Enriching Entertainment</a>
</header>
<nav>
	<a href="${pageContext.request.contextPath}/contactUs/">Contact Us</a>
	<a href="${pageContext.request.contextPath}/login/">Login</a>
	<a href="${pageContext.request.contextPath}/events/">Today's Events</a>
</nav>
<br>
<form class="loginForm" action="${pageContext.request.contextPath}/validate/" method="post">
	<h2>LOGIN</h2>
	<div class="error"><%
	if(request.getAttribute("error")!=null){
		out.print(request.getAttribute("error"));
	}	
	%></div><br>
	UserName:<input type="text" class="name" name="userName"/><br><br>
	Password:<input type="password" class="pass" name="password"/><br><br>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>