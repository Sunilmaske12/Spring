<html>
	<head>
		<title>About page</title>
	</head>
	<body>
	<%String name= (String)request.getAttribute("name"); %>
		<h1>Welcome Mr.<%=name %></h1>
		<h2>You are in a homecontrol view: about page</h2>
	</body>

</html>