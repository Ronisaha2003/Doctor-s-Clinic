package doctor_clinic;
import javax.swing.*;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JFrame f= new JFrame("Doctors Clinic");
		 JLabel l1,l2,l3;
		 JTextField tf1;
		 JPasswordField p1;
		  l3=new JLabel("Hospital Management");
		    l3.setBounds(190,50, 200,30); 
		 l1=new JLabel("Email:");  
	        l1.setBounds(80,100, 100,30);  
	        tf1=new JTextField();  
	        tf1.setBounds(150,110,150,20);  
	        l2=new JLabel("Password:"); 
	        l2.setBounds(80,200,150,30); 
	        p1= new JPasswordField();
	        p1.setBounds(150,210,150,20); 
	        JButton b1=new JButton("Submit");
	        b1.setBounds(150,300,120,30);
	        f.add(l1);f.add(l2);f.add(tf1);f.add(p1);f.add(b1);f.add(l3);
	        f.setLayout(null);
	        f.setSize(500,370);
	        f.setVisible(true);
	       
	        b1.addActionListener(new ActionListener() { 
	            public void actionPerformed(ActionEvent e) {
	            	
	        	        	String Email=tf1.getText();
	        	        	String Pass=p1.getText();
	        	        	if(Email.equals("Ritwiksaha@2003") && Pass.equals("ritwik"))
	        	        	{
	        	        		Management2.main(new String[] {});
	        		        	f.dispose();
	        	        	}
	        	        	else
	        	        		JOptionPane.showMessageDialog(f,"Email or Password not Matched!"); 
	        	        }});
	        		
	            
	            }
	}


