package com.ashish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class MySQLShow {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Connection con=null;
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("select * from student");
		while (r.next()) {
			int rollNo=r.getInt(1);
			String name=r.getString(2);
			int mark=r.getInt(3);
			System.out.println(rollNo +"\t"+name+"\t"+mark);
			
			
		}
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
