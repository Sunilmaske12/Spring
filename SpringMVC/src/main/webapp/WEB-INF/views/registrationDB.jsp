<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RegistrationDB</title>
</head>
<body>
	<div style="margin: 40px 40px;">
		<h3>Registration Form</h3>
		<hr>
		<form action="registrationDB" method="post">
			<label>Name</label>
			<input type="text" name="Name"><br>
			<label>Age</label>
			<input type="number" name="Age"><br>
			<label>Email</label>
			<input type="email" name="Email"><br>
			<button type="submit">Submit</button>
			<hr>
		</form>
	</div>
</body>
</html>