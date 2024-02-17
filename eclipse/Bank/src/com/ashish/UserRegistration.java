package com.ashish;

import java.awt.*;

//import java.awt.Font;
//import java.awt.Toolkit;
//import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class UserRegistration extends JFrame {
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField name;
  private JTextField email;
  private JTextField mob;
  private JTextField AccountNumber;
  private JPasswordField passwordField;
  private JButton btnRegister;

  /**
   * Launch the application.
   */
 public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  UserRegistration frame = new UserRegistration();
                  frame.setVisible(true);
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      });
  }
 

  /**
   * Create the jframe.
   */

  public UserRegistration() {
      
    
  	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(180, 90, 1014, 497);
      setResizable(false);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
     // Color lightBlue=new Color(0,0,182,100);
      
      contentPane.setBackground(Color.blue);

      JLabel lblNewUserRegister = new JLabel("New User Register");
      lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
      lblNewUserRegister.setBounds(362,50,390,50);
      lblNewUserRegister.setForeground(Color.WHITE);
      contentPane.add(lblNewUserRegister);

      JLabel lblName = new JLabel("Name");
      lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
      lblName.setBounds(58, 152, 110, 43);
      lblName.setForeground(Color.WHITE);
      contentPane.add(lblName);
      name = new JTextField();
      name.setFont(new Font("Tahoma", Font.PLAIN, 32));
      name.setBounds(214, 151, 228, 50);
      contentPane.add(name);
      name.setColumns(10);



      JLabel lblEmailAddress = new JLabel("Email\r\n address");
      lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
      lblEmailAddress.setBounds(58, 250, 148, 36);
      lblEmailAddress.setForeground(Color.WHITE);
      contentPane.add(lblEmailAddress);
      email = new JTextField();
      email.setFont(new Font("Tahoma", Font.PLAIN, 32));
      email.setBounds(214, 250, 228, 50);
      contentPane.add(email);
      email.setColumns(10);

      
    JLabel Account =new JLabel("Account Number");
    Account.setFont(new Font("Tahoma",Font.PLAIN,20));
    Account.setBounds(58,340,150,45);
    Account.setForeground(Color.WHITE);
    contentPane.add(Account);
    AccountNumber =new JTextField();
    AccountNumber.setFont(new Font("Tahoma",Font.PLAIN,32));
    AccountNumber.setBounds(214,340,228,50);
    contentPane.add(AccountNumber);
    AccountNumber.setColumns(10);
     

      JLabel lblPassword = new JLabel("Password");
      lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
      lblPassword.setBounds(542, 152, 110, 43); 
      lblPassword.setForeground(Color.WHITE);
      contentPane.add(lblPassword);
      passwordField = new JPasswordField();
      passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
      passwordField.setBounds(707, 152, 228, 43);
      contentPane.add(passwordField);

      JLabel lblMobileNumber = new JLabel("Mobile number");
      lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
      lblMobileNumber.setBounds(542, 250, 139, 26);
      lblMobileNumber.setForeground(Color.WHITE);
      contentPane.add(lblMobileNumber);
      mob = new JTextField();
      mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
      mob.setBounds(707, 250, 228, 50);
      contentPane.add(mob);
      mob.setColumns(10);

      

      
      btnRegister = new JButton("Register");
      btnRegister.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              String Name = name.getText();
              String emailId = email.getText();
              String mobileNumber = mob.getText();
              int len = mobileNumber.length();
              String password = passwordField.getText();
              String Acc_num= AccountNumber.getText();
              int balance=0;

              String msg = "" + Name;
              msg += " \n";
              if (Name.isEmpty()||emailId.isEmpty()||mobileNumber.isEmpty()||
            		  password.isEmpty()||Acc_num.isEmpty()) {
                  JOptionPane.showMessageDialog(btnRegister, "All Field is Mandatory");
              }

              else{
            	  try {
                	  Class.forName("com.mysql.jdbc.Driver");
                      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish?useSSL=false",
    						"root", "password");

                      String query = "INSERT INTO account values('" + Name + "','" + password + "','" + mobileNumber + "','" +
                              emailId + "','" + Acc_num + "','" + balance + "')";   

                      Statement sta = connection.createStatement();
                      int x = sta.executeUpdate(query);
                      if (x == 0) {
                          JOptionPane.showMessageDialog(btnRegister, "This is alredy exist");
                      } else {
                          JOptionPane.showMessageDialog(btnRegister,
                              "Welcome, " + msg + "Your account is sucessfully created");
                      }
                      connection.close();
                  } catch (Exception exception) {
                      exception.printStackTrace();
                  }
              }
          }
      });
      btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 22));
      btnRegister.setBounds(710,340,228,50);
      btnRegister.setForeground(Color.WHITE);
      btnRegister.setBackground(Color.BLACK);
      contentPane.add(btnRegister);
  }
}
