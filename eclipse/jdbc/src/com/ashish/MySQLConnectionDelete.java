package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLConnectionDelete {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		System.out.println("Deleting Record");
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
		
		try {
			System.out.println("Enter rollNo ");
			int r=sc.nextInt();
			java.sql.PreparedStatement p=con.prepareStatement("delete from student where rollNo=?");
			p.setInt(1, r);
			p.executeUpdate();
			System.out.println("Record successfully deleted.");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
		
		
		

	}

}
