package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLConnectionInsert {
	public static void main(String[] ashish) throws SQLException{
		Scanner sc= new Scanner(System.in);
		int rollNo,mark;
		String name;
		Connection con=null;
		System.out.println("Inserting Record:-");
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter number of record :-");
		int record_count = sc.nextInt();
			for(int i=0;i<record_count;i++){
			System.out.println("Enter roll number :-");
			rollNo=sc.nextInt();
			System.out.println("Enter Name :-");
			name=sc.next();
			System.out.println("Enter mark :-");
			mark=sc.nextInt();
			java.sql.PreparedStatement p=con.prepareStatement("insert into student values(?,?,?)");
			p.setInt(1, rollNo);
			p.setString(2, name);
			p.setInt(3, mark);
			p.execute();
			
		}
		System.out.println("Record successfully added ");
		con.close();
		sc.close();
	}

}
