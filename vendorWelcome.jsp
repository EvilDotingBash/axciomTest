<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav>
	<ul>
		<li>Welcome Vendor</li>
		<li><a href="productStatus.jsp">Product Status</a></li>
		<li><a href="requestItem.jsp">Request Item</a></li>
		<li><a href="viewProduct.jsp">View Product</a></li>
		<li><a href="Welcome.jsp">Log Out</a></li>
	</ul>
	</nav>
	<main>
	<table>
		<tr>
			<td><input type="text" value="Product Name" name="productname"></td>
		</tr>
		<tr>
			<td><input type="text" value="Product Price" name="productprice"></td>
		</tr>
		<tr>
			<td><input type="image" value="Product Image"
				name="productimage"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add The Product"
				name="productsubmit"></td>
		</tr>
	</table>
	<table>
		<tr>
			<td>Product Image</td>
		</tr>
		<tr>
			<td>Product Name</td>
		</tr>
		<tr>
			<td>Product Price</td>
		</tr>
		<tr>
			<td>Action</td>
		</tr>
	</table>
	</main>
</body>
</html>