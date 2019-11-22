<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page session="true"  %>
 <%@page isThreadSafe="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%	// Scriptlet tag (use for execute a java code)
	Date date  = new Date();
		
	
%>
<%!	// declaration tag
	public int i = 10;
public int  m() {
	return i;
}
%>

<body>
	<h1 style="color:green;">Date and time is <%= date %></h1>
	<h1><%=m() %></h1>
</body>
<%@include file="/index.html" %>
<!-- taglib we can give location of userdefined jsp tag -->
<%-- <%@taglib uri="" %> --%>
</html>