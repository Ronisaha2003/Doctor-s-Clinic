package doctor_clinic;
import java.awt.Color;

import javax.swing.JOptionPane;
import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Doctor4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Doctor's Panel");
	    JTable table = new JTable(); 
	    
	    // create a table model and set a Column Identifiers to this model 
	    Object[] columns = {"Name","Specifiation","Qualifiaction","Room","Email","Password"};
	    DefaultTableModel model = new DefaultTableModel();
	    model.setColumnIdentifiers(columns);
	    
	    // set the model to the table
	    table.setModel(model);
	    table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,10);
        table.setFont(font);
        table.setRowHeight(30);
        JTextField textName = new JTextField();
        JTextField textSpecifiaction = new JTextField();
        JTextField textQualification = new JTextField();
        JTextField textRoom = new JTextField();
        JTextField textEmail = new JTextField();
        JTextField textpassword = new JTextField();
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        JButton btnView = new JButton("View");
        JButton btnok=new JButton("OK");
        textName.setBounds(20, 220, 200, 25);
        textSpecifiaction.setBounds(20, 250, 200, 25);
        textQualification.setBounds(20, 280, 200, 25);
        textRoom.setBounds(20, 310, 200, 25);
        textEmail .setBounds(20, 340, 200, 25);
        textpassword.setBounds(20, 370, 200, 25);
        
        btnAdd.setBounds(100, 410, 100, 25);
        btnUpdate.setBounds(220, 410, 100, 25);
        btnDelete.setBounds(350, 410, 100, 25);
        btnView.setBounds(430, 410, 100, 25);
        btnok.setBounds(540, 410, 100, 25);
        
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        frame.add(textName);
        frame.add(textSpecifiaction);
        frame.add(textQualification);
        frame.add(textRoom);
        frame.add(textEmail);
        frame.add(textpassword);
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
       // frame.add(btnView);
        frame.add(btnok);
        Object[] row = new Object[6];
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = textName.getText();
                row[1] = textSpecifiaction.getText();
                row[2] = textQualification.getText();
                row[3] = textRoom.getText();
                row[4] = textEmail.getText();
                 row[5] = textpassword.getText();
                
                // add row to the model
                model.addRow(row);
            }
        });
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        table.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent e){
                
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                textName.setText(model.getValueAt(i, 0).toString());
                textSpecifiaction.setText(model.getValueAt(i, 1).toString());
                textQualification.setText(model.getValueAt(i, 2).toString());
                textRoom.setText(model.getValueAt(i, 3).toString());
                textEmail.setText(model.getValueAt(i, 4).toString());
                textpassword.setText(model.getValueAt(i, 5).toString());
            }
            });
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textName.getText(), i, 0);
                   model.setValueAt(textSpecifiaction.getText(), i, 1);
                   model.setValueAt( textQualification.getText(), i, 2);
                   model.setValueAt(textRoom.getText(), i, 3);
                   model.setValueAt(textEmail.getText(), i, 4);
                   model.setValueAt(textpassword.getText(), i, 5);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        btnok.addActionListener(new ActionListener(){         
            public void actionPerformed(ActionEvent e) {
            	String name=textName.getText();
            	String specification=textSpecifiaction.getText();
            	String qualification=textQualification.getText();
            	String room=textRoom.getText();
            	String email=textEmail.getText();
            	String password=textpassword.getText();
            	Connection con;
            	PreparedStatement pstm;
            	try
            	{
            	Class.forName("com.mysql.cj.jdbc.Driver");
            	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","123456");
            	pstm=con.prepareStatement("insert into doct values(?,?,?,?,?,?)");
            	pstm.setString(1,name);
            	pstm.setString(2,specification);
            	pstm.setString(3,qualification);
            	pstm.setString(4,room);
            	pstm.setString(5,email);
            	pstm.setString(6,password);
            	pstm.executeUpdate();
                        
                  JOptionPane.showMessageDialog(frame,"Succesfully register");                 
            	 pstm.close();
            	con.close();
            	
            	}catch(Exception e1) {}
            }});
        
         
        frame.setSize(900,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
      
	}

}