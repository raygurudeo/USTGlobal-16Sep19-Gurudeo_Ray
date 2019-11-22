<%@page import="com.comp.empwebapp.dto.EmployeeInfo"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page session="true"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.comp.empwebapp.dto.EmployeeInfo" %>

<jsp:useBean id="info" class="com.comp.empwebapp.dto.EmployeeInfo" scope="request"></jsp:useBean>

<%
/* EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
int id = info.getId();
String name = info.getName();
String email = info.getEmail(); */

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
						href="./home.jsp">Home <span class="sr-only">(current)</span></a>
					</li>
				</ul>
				
				<div class="form-inline my-2 my-lg-0">
					<a href="#"><button class="btn btn-outline-success my-2 my-sm-0" type="submit">logout</button></a>
				</div>

			</div>
		</nav>
			<div class="container col-md-8 offset-2">
    <table class="text-center mt-5 p-2" style="box-shadow:0 0 10px black; border-collapse: collapse; padding: 3px; width: 70%; margin:auto;">
        <thead class="bg-primary text-white">
            <th>ID</th>
            <th>NAME</th>
            <th>EMAIL</th>
        </thead>
        <tbody>
            <tr>
                <td><%= info.getId() %></td>
                <td><%= info.getName() %></td>
                <td><%= info.getEmail() %></td>
            </tr>
        </tbody>
    </table>
</div>
	</div>
	<script src="./Bootstrap/Jquery/jquery-3.4.1.js"></script>
	<script src="./Bootstrap/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</body>
</html>