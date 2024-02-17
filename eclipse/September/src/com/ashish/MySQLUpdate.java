package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno to update record:-");
		int r=sc.nextInt();
		Connection con=null;
		String f;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
			PreparedStatement p =con.prepareStatement("select * from student where rollNo=?");
			p.setInt(1, r);
			ResultSet rs=p.executeQuery();
			if(!rs.next()){
				System.out.println("Record not found :-");
			}
			else{
				int rn=rs.getInt(1);
				String nm=rs.getString(2);
				int  mk=rs.getInt(3);
				System.out.println("Update name or mark ");
				f=sc.next();
				if(f.equals("name")){
					System.out.println("Enter name");
					nm=sc.next();
				}
				else if(f.equals("mark")){
					System.out.println("Enter mark :-");
					mk=sc.nextInt();
				}
				 p=con.prepareStatement("update student set name=?,mark=? where rollNo=?");
				 p.setString(1, nm);
				 p.setInt(2, mk);
				 p.setInt(3, rn);
				boolean b= p.execute();
				 
				 if(!b){
					 System.out.println("Successfully updated");
				 }
				 con.close();
				 sc.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
