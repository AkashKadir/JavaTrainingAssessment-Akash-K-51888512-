<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loggedin.css" type="text/css"/>
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
<br>
<%session.invalidate(); %>
<h2>Hello ${user.userName}!</h2>
<div class="loggedinDiv">
	<p>9875234567</p>
	<p>adhi@gmail.com</p>
	<p>Kattor Road</p>
	<p>PN Palayam</p>
	<p>Coimbatore</p>
</div>
</body>
</html>