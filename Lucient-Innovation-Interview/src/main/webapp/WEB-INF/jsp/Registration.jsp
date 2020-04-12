<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
<style>
td, th {
  font-family: arial, sans-serif;
}
input[type=text] {
  width: 100%;
  padding: 6px 10px;
  margin: 5px 0;
  box-sizing: border-box;
}
input[type=submit] {
  background-color: #6495ED;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: left;
}

input[type=submit]:hover {
  background-color: #2059BF;
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
<script type="text/javascript">
	function validate() {
		if (document.forms["customer"]["name"].value == "") {
			alert("Please enter name");
			document.forms["customer"]["name"].focus();
			return false;
		}
		if (document.forms["customer"]["gender"].value == "") {
			alert("Please enter gender");
			document.forms["customer"]["gender"].focus();
			return false;
		}
		if (document.forms["customer"]["emailAddress"].value == "") {
			alert("Please enter email address");
			document.forms["customer"]["emailAddress"].focus();
			return false;
		}
		if (document.forms["customer"]["mobileNo"].value == "") {
			alert("Please enter mobile no");
			document.forms["customer"]["mobileNo"].focus();
			return false;
		}
		if (document.forms["customer"]["address1"].value == "") {
			alert("Please enter address 1");
			document.forms["customer"]["address1"].focus();
			return false;
		}
		if (document.forms["customer"]["address2"].value == "") {
			alert("Please enter address 2");
			document.forms["customer"]["address2"].focus();
			return false;
		}
		if (document.forms["customer"]["city"].value == "") {
			alert("Please enter city");
			document.forms["customer"]["city"].focus();
			return false;
		}
		if (document.forms["customer"]["state"].value == "") {
			alert("Please enter state");
			document.forms["customer"]["state"].focus();
			return false;
		}
		if (document.forms["customer"]["zipcode"].value == "") {
			alert("Please enter zipcode");
			document.forms["customer"]["zipcode"].focus();
			return false;
		}if (document.forms["customer"]["country"].value == "") {
			alert("Please enter country");
			document.forms["customer"]["country"].focus();
			return false;
		}
	}
</script>
</head>
<body style="background-color: #FFFFE0;">
<div align="center" class="topnav" style="margin-top: 50px; margin-left: 50px; height: 100px;">
<a class="button" href="/registration" role="button">Customer <c:out value="${customer.id != null ? 'Update' : 'Registration' }" /></a>
<a class="button" href="/list"  role="button">All Customer</a>
</div>
<form:form method="POST" modelAttribute="customer" action="/home" name="customer">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
    <tr>
        <td>Name :</td>
        <td><form:input path="name" id="name" /></td>
    </tr>
    <tr>
        <td>Gender :</td>
        <td><form:input path="gender" id="gender"/></td>
    </tr>
    <tr>
        <td>Email Address :</td>
        <td><form:input path="emailAddress" id="emailAddress"/></td>
    </tr>
    <tr>
        <td>Mobile No :</td>
        <td><form:input path="mobileNo" id="mobileNo"/></td>
    </tr>
    <tr>
        <td>Address1 :</td>
        <td><form:input path="address1" id="address1"/></td>
    </tr>
    <tr>
        <td>Address2 :</td>
        <td><form:input path="address2" id="address2" /></td>
    </tr>
    <tr>
        <td>State :</td>
        <td><form:input path="city" id="city" /></td>
    </tr>
    <tr>
        <td>City :</td>
        <td><form:input path="state" id="state"/></td>
    </tr>
    <tr>
        <td>ZipCode :</td>
        <td><form:input path="zipcode" id="zipcode"/></td>
    </tr>
     <tr>
        <td>Country :</td>
        <td><form:input path="country" id="country"/></td>
    </tr>
     <tr>
             <td ><input type="submit" value="<c:out value="${customer.id != null ? 'Update' : 'Register' }" />"
             onclick="return validate();">&nbsp;&nbsp;<c:if test="${customer.id ne null}"><b>|</b>&nbsp;<a  role="button" href="/registration">Registration</a></c:if>
         </td>
    </tr>
</table>
</form:form>

</body>
</html>