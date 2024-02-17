package com.ashish;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Transfer extends JFrame{
	
	
	 private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField mobileNumber;
	    private JTextField amount;
	    private JButton btnNewButton;
	    private JButton btnNewButton1;
	    private String name;
	    private String email;
	    private String data;
	    
	  	    
	
	
	
	
	 public Transfer(String name,String email,String data) {
		 this.name=name;
		 this.email=email;
		 this.data=data;
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	
	    	setBounds(250, 90, 1014, 597);
	        setResizable(true);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5,5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        contentPane.setBackground(Color.white);
		 
	        
	        JLabel lblAmount1 = new JLabel("Transfer");
	        lblAmount1.setFont(new Font("Tahoma", Font.PLAIN, 35));
	        lblAmount1.setBounds(420, 70, 250, 26);
	        contentPane.add(lblAmount1);
	        
	        JLabel lblMobileNumber = new JLabel("Enter Mobile Number");
	        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 30));
	        lblMobileNumber.setBounds(150, 150, 250, 26);
	        contentPane.add(lblMobileNumber);

	        mobileNumber = new JTextField();
	        mobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        mobileNumber.setBounds(490, 130, 228, 50);
	        contentPane.add(mobileNumber);
	        mobileNumber.setColumns(10);
	        
	        
	        
	        JLabel lblAmount = new JLabel("Amount");
	        lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 30));
	        lblAmount.setBounds(250, 250, 250, 26);
	        contentPane.add(lblAmount);

	        amount = new JTextField();
	        amount.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        amount.setBounds(490, 250, 228, 50);
	        contentPane.add(amount);
	        amount.setColumns(10);
	        
	        btnNewButton = new JButton("Send");
	        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
	        btnNewButton.setBounds(300,380,200,60);
	        btnNewButton.setBackground(Color.BLACK);
	        btnNewButton.setForeground(Color.white);
	        contentPane.add(btnNewButton);
	        
	        btnNewButton1 = new JButton("Cancel");
	        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 25));
	        btnNewButton1.setBounds(600,380,200,60);
	        btnNewButton1.setBackground(Color.RED);
	        contentPane.add(btnNewButton1);
	        
	        btnNewButton1.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent ae) {
	        		new Module(name,email).setVisible(true);
	        	}
	        });
	        
	        
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent ae){
	        	 
	        		  String mobile=mobileNumber.getText();
		        	  String amount1=amount.getText();
		        	  if(amount1.matches("^[a-zA-Z]*$")){
			            	JOptionPane.showMessageDialog(btnNewButton, "Invalid Amount");
			            	
			            }
		        	  if(mobile.equals("") && amount1.equals("")) {
		        			
			        			JOptionPane.showMessageDialog(btnNewButton, "Please Enter Mobile and Amount");
			        			  
			        		
		        	  }
		        	  if(!mobile.equals("") && amount1.equals("")) {
		        			
		        			JOptionPane.showMessageDialog(btnNewButton, "Please Enter Amount");
		        			  
		        		
	        	  }
		        	  if(mobile.equals("") && !amount1.equals("")) {
		        			
		        			JOptionPane.showMessageDialog(btnNewButton, "Please Enter Mobile");
		        			  
		        		
	        	  }
		        	  
		        	  int count=0;
		        	  
		        	  Integer enteredAmount=Integer.parseInt(amount1);
	        	  try {
	        		
	        		  
	        		  Class.forName("com.mysql.jdbc.Driver");
         				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish?useSSL=false",
         							"root", "password");
	        		 
	        		 Integer currentBalance=Integer.parseInt(data);
	        		 int netBalance=currentBalance-enteredAmount;
	        		 if(netBalance>=0) {
	        		
	        		  String query="SELECT Balance FROM Account Where Mobile="+"'"+mobile+"'";
	        			 
	        			
	        		 Statement sta = con.createStatement();
	        			ResultSet results=sta.executeQuery(query);
	        			while(results.next()) {
	        			String data1=results.getString(1);
	        			Integer recieverBalance=Integer.parseInt(data1);
	        			count++;
	        			int recieverNewAmount=recieverBalance+enteredAmount;
	        			String query1="UPDATE Account SET Balance="+"'"+recieverNewAmount+"'"+" Where Mobile="+"'"+mobile+"'";
	 	        		Statement sta1 = con.createStatement();
	 	        			int x=sta1.executeUpdate(query1);
	 	        			if(x!=0) {
	 	        			new Module(name,email).setVisible(true);
	 	        	      String msg="Rs."+enteredAmount+" has transferred Successfully";
	 	        	      JOptionPane.showMessageDialog(new Module(name,email).b2, msg);
	 	        	      String query2="UPDATE Account SET Balance="+"'"+netBalance+"'"+" Where Email="+"'"+email+"'";
		 	        		Statement sta2 = con.createStatement();
		 	        		sta2.executeUpdate(query2);
	 	        			}
	 	        		
	        			}
	        			if(count==0) {
	        				JOptionPane.showMessageDialog(btnNewButton,"Mobile Number does not exist");
	        			}
	        			}
	        			if(netBalance<0){
	        				JOptionPane.showMessageDialog(btnNewButton,"Insufficient Balance");
	        			}
	        			
	        			
	        		con.close();
	        			
	        	
	        		  }
	        	   catch(Exception exception) {
	       			exception.printStackTrace();
	        	   }
	        	}
	        	
	        	
	        });
	        
	        
	        
	        
	        
	        
	        
	        
	 }
	 
}