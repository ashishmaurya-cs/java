package com.ashish;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String userName=request.getParameter("userName");
	String userPassword=request.getParameter("userPass");
	String userEmail=request.getParameter("userEmail");
	String userCountry=request.getParameter("userCountry");
	
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
	PreparedStatement ps=con.prepareStatement("insert into registeration values(?,?,?,?)");
	ps.setString(1, userName);
	ps.setString(2, userPassword);
	ps.setString(3, userEmail);
	ps.setString(4, userCountry);
	
	int i=ps.executeUpdate();
	if(i>0){
		out.print("You are successfully registered.");
	}
	else{
		out.println("Not Registered");
	}
	}catch(Exception e){
		e.printStackTrace();
	}
	out.close();
	}
	
}
