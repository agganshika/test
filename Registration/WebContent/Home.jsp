<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
keep the page running for 30 seconds...
<br>try reloading the page
<br>you will get redirection to home page...
<br>
<%
if(session!=null){
	if(session.getAttribute("user")!=null){
		String name=(String) session.getAttribute("user");
		out.print("Hello," +name+"Welcome to your profile page... ");
	}
	else{
		response.sendRedirect("Login.html");
	}
}
%>
<br>
<br>
<form action="LogoutController" method="post">
<input type="submit" value="Logout">
</form>


</body>
</html>