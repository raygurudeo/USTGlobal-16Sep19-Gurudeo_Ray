<%@page import="com.comp.empwebapp.dto.EmployeeInfo"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page session="true"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.comp.empwebapp.dto.EmployeeInfo" %>
<%
Integer isEmployee = (Integer)request.getAttribute("isEmployee");
int num = isEmployee.intValue();
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Home</title>
<link rel="stylesheet"
	href="./Bootstrap/bootstrap-4.3.1-dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./Bootstrap/fontawesome-free-5.11.2-web/css/all.css">
</head>
<body>
	<div class="container p-5">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a href="./home.jsp" class="nav-link">Home </a>
					</li>
				</ul>
				<div class="form-inline my-2 my-lg-0">
					<a href="./logout"><button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button></a>
				</div>

			</div>
		</nav>
		<%
		if(num == 0) {
			%>
			<h5 class="text-center alert alert-danger">Employee not found with this id</h5>
			<%
		}
		%>
		<fieldset class="col-md-6 offset-3 mt-5">
			<legend>Search</legend>
			<form action="./search">
			<input type="number" name="id" value="Search by id" class="form-control">
			<input type="submit" value="Search" class="btn btn-success mt-2">
		</form>
		</fieldset>
	</div>
	<script src="./Bootstrap/Jquery/jquery-3.4.1.js"></script>
	<script src="./Bootstrap/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</body>
</html>