package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLInsert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int mark;
		int rollNo;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=null;
		try {
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter rollNo");
		rollNo=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter mark");
		mark=sc.nextInt();
		try {
			PreparedStatement p=con.prepareStatement("insert into student values(?,?,?)");
			p.setInt(1, rollNo);
			p.setString(2, name);
			p.setInt(3, mark);
			boolean n=p.execute();
			System.out.println(n);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
		
		
	}

}
