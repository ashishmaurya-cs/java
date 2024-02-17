package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
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
			System.out.println("Enter name :-");
			String name=sc.nextLine();
			System.out.println("Enter age  :-");
			int age=sc.nextInt();
			PreparedStatement ps=con.prepareStatement("insert into ss values(?,?)");
			ps.setString(1, name);
			ps.setInt(2, age);
			boolean b=ps.execute();
			if(b==false){
				System.out.println("Successfully inserted");
			}
			else{
				System.out.println("something wrong");
			}
			con.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
