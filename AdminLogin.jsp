<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css" href="Login.css">
</head>
<body>
	<form action="welcome.jsp" method="post">
		<header>
		<h1>
			Event Management
			</h2>
		</header>
		<table>
			<tr>
				<td>ADMIN ID</td>
				<td><input type="text" name="adminid"></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type="password" name="adminpass"></td>
			</tr>
			<tr>
				<td><input type="submit" value=CANCEL name="cancel"></td>
				<td><input type="submit" value="LOGIN" name="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>