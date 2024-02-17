<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ashish.UserDao"%>

<jsp:useBean id="obj" class="com.ashish.User">
</jsp:useBean>
<jsp:setProperty property="*" name="obj"/>
<%
	int i=UserDao.register(obj);
	if(i>0){
		out.print("You are successfully registered");
	}
%>