<%@page import="com.comp.empwebapp.dto.EmployeeInfo"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page session="true"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.comp.empwebapp.dto.EmployeeInfo" %>
<%
Cookie[] cookies = request.getCookies();
String id = "";
for(Cookie cookie : cookies) {
	
	if(cookie.getName().equals("alwaysRemember")) {
		
		id = cookie.getValue();
	}
}
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>login</title>
    <!-- <link rel="stylesheet" href="./bootstrap-4.3.1-dist/css/bootstrap.min.css"> -->
    <!-- <link rel="stylesheet" href="./fontawesome-free-5.11.2-web/css/all.css"> -->
    <link rel="stylesheet" href="./Bootstrap/bootstrap-4.3.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="./Bootstrap/BootstrapAndFontwesomeFile/fontawesome-free-5.11.2-web/css/all.css">
</head>
<body>
    <div class="card card-body col-md-3 offset-4 mt-5">
        <h3 class="text-center p-2 bg-success text-white">Login Form</h3>
        <form action="./login" class="p-3" method="post">
            <input type="number" name="id" id="id" value=<%=id %> class="form-control" placeholder="User Id">
            <input type="password" name="password" class="form-control mt-2" placeholder="Password">
            <input type="checkbox" name="rememberData" value="check" id="" class="form-check-input ml-1" id="rememberData">
            <label for="rememberData" class="form-check-label ml-4">Remember me</label>
            <input type="submit" value="login"  class="form-control btn btn-success float-right mt-2">
            
        </form>
        <a href="register.html"><input type="submit" value="Register"  class="form-control btn btn-primary float-right mt-2"></a>
        
    </div>
    <script src="./Bootstrap/Jquery/jquery-3.4.1.js"></script>
  <script src="./Bootstrap/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</body>
</html>