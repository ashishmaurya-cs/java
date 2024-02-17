package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		Connection  con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Insewrting data...");
			System.out.println("Enter roll number");
			int roll=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter mark..");
			int mark=sc.nextInt();
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, mark);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
			System.out.println("Record Successfully added");
			}
		sc.close();
		con.close();
	}

}
