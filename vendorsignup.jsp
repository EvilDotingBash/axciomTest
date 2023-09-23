<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
		<h2>Event Management</h2>
		<table>
			<tr>
				<td>NAME</td>
				<td><input type="text" name="adminname"></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="adminemail"></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>CATEGORY</td>
				<td><select>
						<option>CATERING</option>
						<option>FLORIST</option>
						<option>DECORATION</option>
						<option>LIGHTING</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="SIGN UP" name="adminsignup"></td>
			</tr>
		</table>
	</form>
</body>
</html>