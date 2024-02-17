package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLDelete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=null;
		Scanner sc=new Scanner(System.in);
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
			System.out.println("Enter rollno to delete data :-");
			int r=sc.nextInt();
			PreparedStatement p=con.prepareStatement("delete from student where rollNo=?");
			p.setInt(1, r);
			boolean b=p.execute();
			if(!b){
				System.out.println("record deleted successfuly");
			}
			con.close();
			sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
