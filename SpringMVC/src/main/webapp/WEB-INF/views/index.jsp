<%@page import="java.util.List"%>
<html>
	<head>
		<title>Index page</title>
	</head>
	<body>
	<%String name= (String)request.getAttribute("name");
	  int age = (int)request.getAttribute("age");
	  List<String> friend = (List<String>)request.getAttribute("friends");
	%>
		<h1>Welcome Mr.<%=name %></h1>
		<h2>Your age is <%=age %></h2>
		<h2>You are in a homecontrol view: index page</h2>
		<h3>Your friend list is: </h3>
		<% for(String st:friend){%><h4>
		<%=st %></h4>
		<%}
			%>
		
	</body>

</html>