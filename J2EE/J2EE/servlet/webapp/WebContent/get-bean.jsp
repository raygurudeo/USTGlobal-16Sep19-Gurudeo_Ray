<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%-- <jsp:useBean id="obj" class="java.lang.Object" scope="request"></jsp:useBean> --%>
<jsp:useBean id="obj" class="com.ustglobal.webapp.servlets.Employee" scope="request" />
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h1><%=obj %></h1> --%>

<%=obj.getId() %>
<%=obj.getName() %>

</body>
</html>