<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 90%;
}
.demo {
		border:1px solid #000000;
		border-collapse:collapse;
		padding:5px;
	}
.demo th {
		border:1px solid #000000;
		padding:5px;
		background:#5AF388;
}
.demo td {
		border:1px solid #000000;
		padding:5px;
	}
</style>
</head>
<body style="background-color: #FFFFE0;">

	<div align="center" style="margin-top: 50px; margin-left: 50px; height: 50px;">
		<h2>Product List</h2>
	</div>
	<table class="demo" style="margin-top: 0px; margin-left: 50px;">												
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Vendor</th>
			<th>Product Type</th>
			<th>Created At</th>
			<th>Tags</th>
			<th>Handle</th>
			<th>Updated At</th>
			<th>published At</th>
			<th>Admin Graphql api Id</th>
			
		</tr>
		<c:forEach items="${productList}" var="pro">
			<tr>
				<td>${pro.id}</td>
				<td>${pro.title}</td>
				<td>${pro.vendor}</td>
				<td>${pro.productType}</td>
				<td>${pro.createdAt}</td>
				<td>${pro.tags}</td>
				<td>${pro.handle}</td>
				<td>${pro.updatedAt}</td>
				<td>${pro.publishedAt}</td>
				<td>${pro.adminGraphqlApiId}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>