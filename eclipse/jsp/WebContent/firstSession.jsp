<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First session</title>
</head>
<body>
<%
String name=request.getParameter("uname");
out.print(name);
session.setAttribute("uname", name);
%>
<a href="secondSession.jsp">Second jsp page.</a>
</body>
</html>