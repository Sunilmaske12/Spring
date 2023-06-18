<%@page import="java.util.List"%>
<html>
	<head>
		<title>Help page</title>
	</head>
	<body>
	<%String name= (String)request.getAttribute("name");
	  int age = (int)request.getAttribute("Age");
	%>
		<h1>Welcome Mr.<%=name %></h1>
		<h2>Your age is <%=age %></h2>
		<h2>You are in a homecontrol view: Help page</h2>
		
	
		
	</body>

</html>