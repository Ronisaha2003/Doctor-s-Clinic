package doctor_clinic;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Payment {
		
	
	  public static void main(String[]args) {
			JFrame f= new JFrame();
			
			JLabel l1,l2,l3;
			 JTextField tf1,tf2,tf3;
			l1=new JLabel("Doctor's name");
			l1.setBounds(80,100, 200,30);
			tf1=new JTextField();  
	        tf1.setBounds(200,110,200,20);  
			l2=new JLabel("Fees");
			l2.setBounds(80,150,200,30);
			tf2=new JTextField();  
	        tf2.setBounds(200,160,200,20);  
			l3=new JLabel("Payment");
			l3.setBounds(80,200, 200,30);
			tf3=new JTextField();  
		    tf3.setBounds(200,210,200,20); 
		    JButton b1=new JButton("Submit");
	        b1.setBounds(110,300,120,30);
			f.add(l1);f.add(l2);f.add(l3);
			f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);
			f.setLayout(null);
	        f.setSize(400,400);
	        f.setVisible(true);
	        b1.addActionListener(new ActionListener() { 
	            public void actionPerformed(ActionEvent e) {
	            	String Doctorname =tf1.getText();
	            	String Fees=tf2.getText();
	            	String Payment=tf3.getText();
	            	Connection con;
	            	PreparedStatement pstm;
	            	try
	            	{
	            	Class.forName("com.mysql.cj.jdbc.Driver");
	            	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","123456");
	            	pstm=con.prepareStatement("insert into info values(?,?,?)");
	            	pstm.setString(1,Doctorname );
	            	pstm.setString(2,Fees);
	            	pstm.setString(3,Payment);
	            	
	            	pstm.executeUpdate();
	            	JOptionPane.showMessageDialog(f,"Payment Sucessfully Done !"); 
	            	con.close();
	            	pstm.close();
	            	}catch(Exception e1) {}
	            }});
}

	
}
