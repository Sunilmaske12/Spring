<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Details</title>
</head>
<body>
	<div style="margin: 40px 40px;">
		<h3>Registration Detail</h3>
		<%String name = (String)request.getAttribute("name");
		int age = (int)request.getAttribute("age");
		String email = (String)request.getAttribute("email");
		%>
		<h4>Your name is : <%=name%></h4>
		<h4>Your age is : <%=age%></h4>
		<h4>Your email is : <%=email%></h4>
	</div>
</body>
</html>