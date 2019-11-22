<%@page import="com.comp.empwebapp.dto.EmployeeInfo"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page session="true"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.comp.empwebapp.dto.EmployeeInfo" %>
<%
Integer isPasswordMatch = (Integer)request.getAttribute("isPasswordMatch");
int num = isPasswordMatch.intValue();
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
					<li class="nav-item active"><a href="./home.jsp" class="nav-link"
					>Home <span class="sr-only">(current)</span></a>
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
			<h5 class="text-center alert alert-danger">Password does not match</h5>
			<%
		}
		%>
		
		<fieldset class="col-md-6 offset-3">
			<legend>Search</legend>
			<form action="./changepassword" method="post" >
			<input type="password" name="password" value="Password" class="form-control">
			<input type="password" name="confirmpassword" value="Confirm password" class="form-control">
			<input type="reset" value="Reset" class="btn btn-success">
			<input type="submit" value="Search" class="btn btn-primary">
		</form>
		</fieldset>
	</div>
	<script src="./Bootstrap/Jquery/jquery-3.4.1.js"></script>
	<script src="./Bootstrap/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</body>
</html>