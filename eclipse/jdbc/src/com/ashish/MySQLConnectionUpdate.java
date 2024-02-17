package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class MySQLConnectionUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con;
		int r,mk;
		String nm;
		System.out.println("updating record...");
		
		System.out.println("Enter rollno whose record is be updated.");
		r=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
		
			PreparedStatement p=con.prepareStatement("select * from student where rollNo=?");
			p.setInt(1, r);
			ResultSet res=p.executeQuery();
			if(!res.next()){
				System.out.println("Record not found..");
			}
			else{
				String f;
				r=res.getInt(1);
				nm=res.getString(2);
				mk=res.getInt(3);
				System.out.println(nm);
				System.out.println(mk);
				System.out.println("Update name  or marks");
				f=sc.next();
				if(f.equals("name")){
					System.out.println("Enter name");
					nm=sc.next();
				}
				else if(f.equals("marks")){
					System.out.println("Enter marks");
					mk=sc.nextInt();
				}
				p=con.prepareStatement("update student set name=?, mark=? where rollNo=?");
				p.setString(1, nm);
				p.setInt(2, mk);
				p.setInt(3, r);
				p.executeUpdate();
				System.out.println("Record updated successfully");
			}
			res.close();
			con.close();
		}
		catch(SQLException e){
			System.out.println(e);
		}
		}
		catch(ClassNotFoundException ec){
			ec.printStackTrace();
		}
		sc.close();

	}

}
