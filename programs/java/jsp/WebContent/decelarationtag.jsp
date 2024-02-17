<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>declaration tag </title>
</head>
<body>
<%!int a=10; %>
<%out.print(a); %><br>

<%! int square( int b){
	int area=b*b;
	return area;
}
%>

<%= "square of 2 is :"+square(2) %>

</body>
</html>