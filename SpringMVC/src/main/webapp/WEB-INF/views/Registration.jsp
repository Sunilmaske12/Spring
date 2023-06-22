<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link href="<c:url value="/resources/css/style.css"/>">
<script type="text/javascript" src="<c:url value="/resources/js/script.js" />  " ></script>


</head>
<body>
	<div >
<img style="width: 100px; height:100px;" alt="My Image" src='<c:url value="/resources/images/Penguins.jpg"/>'>
	</div>
	<div style="margin: 40px 40px;">
		<h3>Registration Form</h3>
		<form action="registration" method="post">
			<label>Name</label>
			<input type="text" name="Name">
			<label>Age</label>
			<input type="number" name="Age">
			<label>Email</label>
			<input type="email" name="Email">
			<button type="submit">Traditional Submit</button>
			
		</form>
		<br><br><br>
		<form action="newRegistration" method="post">
			<label>Name</label>
			<input type="text" name="Name">
			<label>Age</label>
			<input type="number" name="Age">
			<label>Email</label>
			<input type="email" name="Email">
			<button type="submit">New Submit</button>
		</form>
	</div>
</body>
</html>