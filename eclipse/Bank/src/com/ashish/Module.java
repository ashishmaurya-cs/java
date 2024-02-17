package com.ashish;


import java.awt.*;

//import java.awt.Font;
//import java.awt.Toolkit;
//import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.INTERNAL;

public class Module extends JFrame{
	 private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JButton b1; 
	    JButton b2;
	    private JButton b3;
	    private JButton b4;
	    private JButton b5;
	  /*  public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                   // Module frame = new Module();
	                   // frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }*/
	    
	    public Module(String name,String email){
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	setBounds(230, 80, 1014, 597);
	        setResizable(false);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5,5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        //Color lightBlue=new Color(0,0,182,100);
	        contentPane.setBackground(Color.WHITE);
	       
	        
	        JLabel labelName=new JLabel("Welcome, "+name);
	        labelName.setFont(new Font("Tahoma",Font.PLAIN,35));
	        labelName.setBounds(700,30,400,60);
	        labelName.setForeground(Color.black);
	        contentPane.add(labelName);
	
	        b1 =new JButton("Deposit");
            b1.setFont(new Font("Tahoma",Font.PLAIN,25));
            b1.setBounds(200,130, 200, 74);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            contentPane.add(b1);
            b1.addActionListener(new ActionListener() {
				
       				@Override
       				public void actionPerformed(ActionEvent e) {
       					java.sql.Connection con;
               			try {
               				Class.forName("com.mysql.jdbc.Driver");
               				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish?useSSL=false",
               							"root", "password");
               				java.sql.Statement st=con.createStatement();
               				ResultSet res=st.executeQuery("select * from account where Email='"+email+"'");
               					
               					if(res.next()){
               						Long balance=Long.parseLong(res.getString("Balance"));
               						new Deposit(name,email,balance).setVisible(true);
       	        				}
               					con.close();
               			}
               					
               				catch (SQLException ee) {
               					ee.printStackTrace();
               				}
               			
               				catch (Exception er) {
               					er.printStackTrace();
               				}
       					
       					
       				}
       			});
            
            b2 =new JButton("Withdraw");
            b2.setFont(new Font("Tahoma",Font.PLAIN,25));
            b2.setBounds(650,130, 200, 74);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            contentPane.add(b2);
            b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					java.sql.Connection con;
        			try {
        				Class.forName("com.mysql.jdbc.Driver");
        				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish?useSSL=false",
        							"root", "password");
        				java.sql.Statement st=con.createStatement();
        				ResultSet res=st.executeQuery("select * from account where Email='"+email+"'");
        					
        					if(res.next()){
        						Long balance=Long.parseLong(res.getString("Balance"));
        						new WithDrawAmount(name,email,balance).setVisible(true);
	        				}
        					con.close();
        			}
        					
        				catch (SQLException ee) {
        					ee.printStackTrace();
        				}
        			
        				catch (Exception er) {
        					er.printStackTrace();
        				}
					
					
				}
			});
            
            
            b3 =new JButton("Transfer");
            b3.setFont(new Font("Tahoma",Font.PLAIN,25));
            b3.setBounds(200,300, 200, 74);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            contentPane.add(b3);
            b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					java.sql.Connection con;
        			try {
        				Class.forName("com.mysql.jdbc.Driver");
        				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish?useSSL=false",
        							"root", "password");
        				java.sql.Statement st=con.createStatement();
        				ResultSet res=st.executeQuery("select * from account where Email='"+email+"'");
        					
        					if(res.next()){
        						String balance=res.getString("Balance");
        						new Transfer(name,email,balance).setVisible(true);
	        				}
        					con.close();
        			}
        					
        				catch (SQLException ee) {
        					ee.printStackTrace();
        				}
        			
        				catch (Exception er) {
        					er.printStackTrace();
        				}
					
					
				}
			});
            
            
            b4 =new JButton("Check_balance");
            b4.setFont(new Font("Tahoma",Font.PLAIN,25));
            b4.setBounds(650,300, 200, 74);
            b4.setBackground(Color.BLACK);
            b4.setForeground(Color.WHITE);
            contentPane.add(b4);
            b4.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent ae) {
	        	  
	        	    try {
	        	    	Class.forName("com.mysql.jdbc.Driver");
	        	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
	        			 
	        		String query="SELECT Balance FROM Account Where Email="+"'"+email+"'";
	        		Statement sta = con.createStatement();
	        			ResultSet results=sta.executeQuery(query);
	        	while(results.next()) {
	        		String data=results.getString(1);
	        	    
	        		 String msg="Hello "+name+"\nyour Balance is Rs."+data;
	        		 //new Transfer(name,email,data);
	        		JOptionPane.showMessageDialog(b4, msg);
	        	}
	        	
	        			
	        			
	        			 con.close();	 
	        		}
	        		catch(Exception exception) {
	        			exception.printStackTrace();
	        		}
	        	   
	        		
	        		}
	        	});
            
          
            
            b5 =new JButton("Log out");
            b5.setFont(new Font("Tahoma",Font.PLAIN,25));
            b5.setBounds(420,450, 200, 74);
            b5.setBackground(Color.BLACK);
            b5.setForeground(Color.WHITE);
            contentPane.add(b5);
            
            
	        b5.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent ae) {
	        		new UserLogin().setVisible(true);
	        	}
	        		
	        });
	        
	        
	   }
}
