package com.ashish;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class WithDrawAmount extends JFrame{
	  private static final long serialVersionUID = 1L;
	    private JPanel jPanel;
	    private JTextField amount;
	    private JButton btn;
	   
	    
	  /*  public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    WithDrawAmount wt = new WithDrawAmount();
	                    wt.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }*/
	    
	    public WithDrawAmount(String name,String email,Long balance) {
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	setBounds(500, 200, 400, 300);
	        setResizable(false);
	        jPanel = new JPanel();
	        jPanel.setBorder(new EmptyBorder(5, 5, 5,5));
	        setContentPane(jPanel);
	        jPanel.setLayout(null);
	        jPanel.setBackground(Color.BLUE);
	        
	       
	        
	        
	        JLabel jLabel = new JLabel("Enter Amount");
	        jLabel.setFont(new Font("Serif",Font.BOLD,25));
	        jLabel.setBounds(30,50,160,50);
	        jLabel.setForeground(Color.WHITE);
	        jPanel.add(jLabel);
	        

	        JLabel jLabel2 = new JLabel("");
	        //jLabel2.setFont(new Font("Serif",Font.BOLD,25));
	        jLabel2.setBounds(100, 200, 200, 40);
	        jLabel2.setForeground(Color.white);
	        jPanel.add(jLabel2);
	        

	        amount = new JTextField();
	        amount.setFont(new Font("Serif",Font.BOLD,25));
	        amount.setBounds(220,55,150,40);
	        amount.setForeground(Color.blue);
	        jPanel.add(amount);
	        amount.setColumns(20);

	        btn =new JButton("OK");
	        btn.setFont(new Font("Serif",Font.BOLD,25));
	        btn.setBounds(150,140,90,40);
	        btn.setBackground(Color.WHITE);
	        btn.setForeground(Color.blue);
	        jPanel.add(btn);
	        
	        btn.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	    	        	    
	        	    String a=amount.getText();
					 if(!a.isEmpty()){
						 long enteredAmount=0;
						 try {
							 enteredAmount= Integer.parseInt(a);
						} catch (Exception e2) {
							
						}
						
						 
						 if(enteredAmount>0){ 
							if(enteredAmount>balance){
								JOptionPane.showMessageDialog(btn, "Insufficient balance..");
							}
							else{
								 int newBalance=(int)(balance-enteredAmount);
								 Connection con ;
									try {
										Class.forName("com.mysql.jdbc.Driver");
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									
										try {
											con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish","root","password");
											PreparedStatement p=con.prepareStatement("update Account set  Balance=? where Email=?");
											p.setInt(1, newBalance);
											p.setString(2, email);
											int i=p.executeUpdate();
											if(i>0){
												JOptionPane.showMessageDialog(btn, enteredAmount+" withdraw successfully.");
												new Module(name, email).setVisible(true);;
											}
										} catch (SQLException e1) {
											
											e1.printStackTrace();
										}
							}
							}
						 else{
							 JOptionPane.showMessageDialog(btn, "Invalid amount..");
						 }
					 }
					 else{
						 JOptionPane.showMessageDialog(btn, "Please enter amount..");
					 }
	        	}
	        		
	    });

	  }
}

