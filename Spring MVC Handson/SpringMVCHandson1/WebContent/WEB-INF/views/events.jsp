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
	<a href="${pageContext.request.contextPath}/events/">Today's Events</a>
</nav>
<br>
<br>
<div id="events">
	<table id="eventTable" border="1">
		<tr>
			<th>Event Name</th>
			<th>Organised By</th>
			<th>Time</th>
		</tr>
		<tr>
			<td>Puppet Show</td>
			<td>Murugan</td>
			<td>17:00</td>
		</tr>
		<tr>
			<td>Magic Show</td>
			<td>James</td>
			<td>16:00</td>
		</tr>
		<tr>
			<td>Music Show</td>
			<td>Kamal</td>
			<td>17:00</td>
		</tr>
	</table>
</div>
		
</body>
</html>