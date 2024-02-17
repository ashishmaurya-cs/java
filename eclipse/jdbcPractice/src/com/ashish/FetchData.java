package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FetchData {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
			PreparedStatement ps=con.prepareStatement("select * from ss");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				String name=rs.getString(1);
				int age=rs.getInt(2);
				System.out.println(name+" "+age);
			}
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
