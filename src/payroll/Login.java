/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;
    
    Login(){
        super("Login");
        setLayout(new BorderLayout());
        t2 = new JPasswordField(10);
        t1 = new JTextField(10);
        JLabel l = new JLabel(new ImageIcon(ClassLoader.getSystemResource("icon\\defaultpic.png")));
        
        b1 = new JButton("Login", new ImageIcon(ClassLoader.getSystemResource("icon\\login.jpg")));
        
        b1.addActionListener(this);
       

        JPanel p1,p2,p3,p4;
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();



       
        add(l,BorderLayout.WEST);

        
        p2.add(new JLabel("User Name  "));
        p2.add(t1);
        p2.add(new JLabel("Password "));
        p2.add(t2);
        add(p2,BorderLayout.CENTER);
  p2.add(new JLabel("Select role "));
      
String roles[]={"Admin","Employee"};        
    JComboBox cb=new JComboBox(roles);    
   
    p2.add(cb);

        p2.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
             
  p4.add(b1);

        add(p4,BorderLayout.SOUTH);

      
        setSize(500,350);
        setLocation(600,400);	
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        try
        {
            Conn c1=new Conn();
            String name=t1.getText();
            String passoword=t2.getText();
            
            String q="select * from login where Name='"+name+"' and password='"+passoword+"'";
            
            ResultSet rs=c1.s.executeQuery(q); // query execute
            if(rs.next()){
                new Project().setVisible(true);
             
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args){
        new Login();
    }
}

