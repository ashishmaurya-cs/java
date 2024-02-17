package com.ashish;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnectionShow {
	
	public static void main(String [] ashish){
		java.sql.Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish",
						"root", "password");
			java.sql.Statement st=con.createStatement();
			ResultSet res=st.executeQuery("select * from student");
			System.out.println("Your Record is below :-");
			while(res.next()){
				int i=res.getInt("rollNo");
				String name=res.getString("name");
				int m= res.getInt("mark");
				
				System.out.println("Roll No : "+i +"\n"+"Name : "+name +"\n"+"Mark : "+m);
			}
			
			con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			catch (Exception e) {
				e.printStackTrace();
			}

	}

}
