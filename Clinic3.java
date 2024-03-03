package doctor_clinic;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Clinic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame cf= new JFrame("Patient Form");
		
        JLabel l1,l2,l3,l4,l5,l6;  
        JTextField tf1,tf2,tf3,tf4,tf5;
        l1=new JLabel("***Registration Screen***");
        
	       l1.setBounds(150,10,150,50);
	        l2=new JLabel("Patient Name:");  
	        l2.setBounds(10,50, 100,30);  
	        tf1=new JTextField();  
	        tf1.setBounds(110,54,150,20);  
	        l3=new JLabel("Father Name:");  
	        l3.setBounds(10,100,100,30);  
	        tf2=new JTextField();  
	        tf2.setBounds(110,104,150,20); 
	        l4=new JLabel(" Address:");  
	        l4.setBounds(10,150,100,30);  
	        tf3=new JTextField();  
	        tf3.setBounds(110,154,150,20); 
	        l5=new JLabel("Phonenumber");  
	        l5.setBounds(10,200,100,30);
	        tf4=new JTextField();  
	        tf4.setBounds(110,204,150,20);
	        l6= new JLabel("Patient illness");
	        l6.setBounds(10,250,100,30);
	        tf5= new JTextField();
	        tf5.setBounds(110,254,150,20);
	        JButton b1=new JButton("Submit");
	        b1.setBounds(110,300,120,30);
	             
	        cf.add(l1);cf.add(l2);cf.add(tf1);cf.add(l3);cf.add(tf2);
	        cf.add(l4);cf.add(tf3);cf.add(l5);cf.add(tf4);cf.add(l6);cf.add(tf5);cf.add(b1);
	       cf.setLayout(null);
	        cf.setSize(400,400);
	        cf.setVisible(true);
	        b1.addActionListener(new ActionListener() { 
	            public void actionPerformed(ActionEvent e) {
	            	String Patientname=tf1.getText();
	            	String Fathername=tf2.getText();
	            	String Address=tf3.getText();
	            	String PhoneNumber=tf4.getText();
	            	String Illness=tf5.getText();
	            	Connection con;
	            	PreparedStatement pstm;
	            	try
	            	{
	            	Class.forName("com.mysql.cj.jdbc.Driver");
	            	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic","root","123456");
	            	pstm=con.prepareStatement("insert into cli values(?,?,?,?,?)");
	            	pstm.setString(1,Patientname );
	            	pstm.setString(2,Fathername );
	            	pstm.setString(3,Address );
	            	pstm.setString(4,PhoneNumber );
	            	pstm.setString(5,Illness );
	            	pstm.executeUpdate();
	            	JOptionPane.showMessageDialog(cf,"You have Been Sucessfully Registered!"); 
	            	con.close();
	            	pstm.close();
	            	}catch(Exception e1) {}
	            }});
	}

	//public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	//}


	
	}


