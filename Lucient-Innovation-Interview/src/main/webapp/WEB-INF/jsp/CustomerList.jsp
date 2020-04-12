<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Customer</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 90%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

a {
font-size: 25px
}

.button {
  background-color: cornflowerblue;  
  border-radius: 5px;
  color: white;
  font-size: 18px;
  text-align: center;
  padding: 1em;
  transition-duration: 0.4s;
  text-decoration: none;
}
</style>
</head>
<body style="background-color: #FFFFE0;">
 
	<div align="center" class="topnav" style="margin-top: 50px; margin-left: 50px; height: 100px;">
		<a class="button" href="/list" role="button">All Customer</a>
        <a class="button" href="/registration"  role="button">Registration</a>
	</div>
	<table style="margin-top: 0px; margin-left: 50px;">												
		<tr>
			<th>Name</th>
			<th>Gender</th>
			<th>Email Address</th>
			<th>Mobile No</th>
			<th>Address1</th>
			<th>Address2</th>
			<th>State</th>
			<th>City</th>
			<th>ZipCode</th>
		    <th>Country</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${customerList}" var="cus">
			<tr>
				<td>${cus.name}</td>
				<td>${cus.gender}</td>
				<td>${cus.emailAddress}</td>
				<td>${cus.mobileNo}</td>
				<td>${cus.address1}</td>
				<td>${cus.address2}</td>
				<td>${cus.city}</td>
				<td>${cus.state}</td>
				<td>${cus.zipcode}</td>
				<td>${cus.country}</td>

				<td><a href="/edit?customerId=${cus.id}">Edit</a></td>
				<td>
					<form action="/delete?customerId=${cus.id}" method="post">
						<input type="submit" value="Delete"
							 />
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>