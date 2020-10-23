<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Today's Events</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/events.css" type="text/css"/>
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
<br><br>
<div class="eventsDiv">
	<div>
		<p>Name: Puppet Show</p>
		<p>Organised by: Murugan</p>
		<p>Time: 17:00</p>
	</div><br>
	<div>
		<p>Name: Magic Show</p>
		<p>Organised by: James</p>
		<p>Time: 16:00</p>
	</div><br>
	<div>
		<p>Name: Music Show</p>
		<p>Organised by: Kamal</p>
		<p>Time: 17:00</p>
	</div>
</div>
		
</body>
</html>