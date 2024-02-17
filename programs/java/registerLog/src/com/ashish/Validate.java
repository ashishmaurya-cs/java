package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {

	public static boolean checkUser(String userEmail,String userPassword ){
		boolean st=false;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
		PreparedStatement ps=con.prepareStatement("select * from registeration where userEmail=? and userPass=?");
		ps.setString(1, userEmail);
		ps.setString(2, userPassword);
		ResultSet rs=ps.executeQuery();
		st=rs.next();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return st;
	}
}
