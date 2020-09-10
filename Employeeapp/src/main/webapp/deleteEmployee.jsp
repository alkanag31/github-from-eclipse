<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br><a href="home.jsp">Home Page</a><br>
	<form action="deleteEmployee" method="post">
		<h2>Delete Employee</h2>
		<br>Employee id<input type="text" name="eid"><br>
	<input type="submit" value="delete"><br>
	</form>
</body>
</html>