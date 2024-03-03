package doctor_clinic;

import java.awt.event.*;
import javax.swing.*;
public class Admin3 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Admin Login");
		JLabel l1=new JLabel("Enter email:");
		JTextField tf1=new JTextField();
		JLabel l2=new JLabel("Enter Password:");
		JTextField tf2=new JTextField();
		JButton b1=new JButton("Login");
		l1.setBounds(10, 20, 100, 30);
		tf1.setBounds(130, 20, 140, 30);
		l2.setBounds(10, 60, 100, 30);
		tf2.setBounds(130, 60, 140, 30);
		b1.setBounds(130, 100, 80, 30);
		frame.add(l1);
		frame.add(tf1);
		frame.add(l2);
		frame.add(tf2);
		frame.add(b1);
		frame.setSize(320,200);
		frame.setLayout(null);
		frame.setVisible(true);
		b1.addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	String Email=tf1.getText();
	        	String Pass=tf2.getText();
	        	if(Email.equals("Ritwiksaha@gmail.com") && Pass.equals("ritwik"))
	        	{
	        		Doctor4.main(new String[] {});
		        	frame.dispose();
	        	}
	        	else
	        		JOptionPane.showMessageDialog(frame,"Email or Password not Matched!"); 
	        }});
		
		

	}

}
