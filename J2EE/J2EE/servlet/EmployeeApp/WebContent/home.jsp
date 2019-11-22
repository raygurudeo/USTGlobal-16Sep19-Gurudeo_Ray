<%@page import="com.comp.empwebapp.dto.EmployeeInfo"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page session="true"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.comp.empwebapp.dto.EmployeeInfo" %>
<jsp:useBean id="info" class="com.comp.empwebapp.dto.EmployeeInfo" scope="session"></jsp:useBean>
<%
/* EmployeeInfo info1 = (EmployeeInfo)session.getAttribute("info");
String name = info1.getName(); */

/* Integer isPasswordMatch = (Integer)session.getAttribute("isPasswordMatch");
int num = isPasswordMatch.intValue(); */

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
					<li class="nav-item active"><a class="nav-link"
						href="#">Home <span class="sr-only">(current)</span></a>
					</li>
				</ul>
				<div style="color:grey; text-align:center; margin-right:300px">
			<h1>Welcome <%=info.getName() %></h1>
		</div>
				<div class="form-inline my-2 my-lg-0">
					<a href="./logout"><button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button></a>
				</div>

			</div>
		</nav>
		<%-- <%
		if(isPasswordMatch.equals("1")) {
			%>
			<h5 class="text-center alert alert-danger">Password changed</h5>
			<%
		}
		%> --%>
			<div class="mt-3 p-3" style="text-align:center; margin-top:10px">
				<a href="./search.html"><input type="button" value="Search" class="btn btn-success"></a>
			<a href="./changepassword.html"><input type="button" value="Change password" class="btn btn-primary"></a>
			<a href="./logout"><input type="button" value="logout" class="btn btn-warning"></a>
			</div>
	</div>
	<script src="./Bootstrap/Jquery/jquery-3.4.1.js"></script>
	<script src="./Bootstrap/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</body>
</html>