package myjdbc;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Loginframe extends JFrame  {

private String userName;
private String passWord;
private JLabel unameLabel;
private JTextField unameText;
private JLabel passwordLabel;
private JPasswordField passwordText;
private JButton checkButton;

Loginframe()
{
//Create components
unameLabel=new JLabel("User Name");
unameText=new JTextField(30);
passwordLabel=new JLabel("Password");
passwordText=new JPasswordField(10);
checkButton=new JButton("Check in database");

//set bounds-limitations for space specification on GUI
setBounds(10,20,60,40);
unameLabel.setBounds(10,10,50,40);
unameLabel.setBounds(25,75,10,50);
passwordLabel.setBounds(10,20,50,40);
passwordText.setBounds(10,20,10,10);
checkButton.setBounds(10,30,10,10);



//add components to frame 
this.add(unameLabel);
this.add(unameText);
add(passwordLabel);
add(passwordText);
add(checkButton);

//set the frame visible
setVisible(true);


setTitle("Use Login Form");
setLayout(new FlowLayout());

}

}