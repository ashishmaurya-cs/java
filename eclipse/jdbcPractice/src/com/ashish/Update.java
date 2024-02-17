package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
			System.out.println("Enter id for update record :-");
			int  id = sc.nextInt(); 
			PreparedStatement ps=con.prepareStatement("select * from ss where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
