package doctor_clinic;
import java.awt.event.*;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Management2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame();
		
		JButton b1 ,b2,b3,b4;
		
		b1 = new JButton("Go to the patient Form");
		b1.setBounds(80,100, 200,30);
		b2= new JButton("LOGOUT");
		b2.setBounds(280,20, 100,30);
		b3 =new JButton("Payment");
		b3.setBounds(80,150,200,30);
		b4=new JButton("Admin Panel");
		b4.setBounds(80,200, 200,30);
		
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);
		f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        b1.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		
    			Clinic3.main(new String [] {});
    			
    		}});
        b3.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		
    		     Payment.main(new String [] {});
    			
    		}});
        
        
        b4.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	Admin3.main(new String [] {});
            }});
        
        
    	
    	
    	
    	
    	b2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			Main1.main(new String [] {});
    		}
    	});
	
	}



public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}


}


