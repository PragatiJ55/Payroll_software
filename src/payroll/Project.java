/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
        JButton b1;
    Project(){
        setSize(2000,1100);
        getContentPane().setBackground(Color.WHITE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/payroll.jpg"));
        Image i2 = i1.getImage().getScaledInstance(2000,1100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        add(l1);
        
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(3,2,120,120));
        panel.setSize(new Dimension(700,500));
        panel.setLocation(600,250);
        panel.setOpaque(false);
 

      
       
        JButton b1=new JButton("Create Employee");     
          b1.setFont(new Font("Calibri", Font.PLAIN, 18));
        b1.setBackground(new Color(0x002266));
        b1.setForeground(Color.white);
     b1.addActionListener(
  new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(null, "Create employee");
    }
  });
        JButton b2=new JButton("Salary");  
         b2.setFont(new Font("Calibri", Font.PLAIN, 18));
        b2.setBackground(new Color(0x002266));
        b2.setForeground(Color.white);
         JButton b3=new JButton("Update Salary"); 
          b3.setFont(new Font("Calibri", Font.PLAIN, 18));
        b3.setBackground(new Color(0x002266));
        b3.setForeground(Color.white);
          JButton b4=new JButton("View Report");
           b4.setFont(new Font("Calibri", Font.PLAIN, 18));
        b4.setBackground(new Color(0x002266));
        b4.setForeground(Color.white);
          JButton b5=new JButton("Take attendance"); 
           b5.setFont(new Font("Calibri", Font.PLAIN, 18));
        b5.setBackground(new Color(0x002266));
        b5.setForeground(Color.white);
           JButton b6=new JButton("Print Report");  
            b6.setFont(new Font("Calibri", Font.PLAIN, 18));
        b6.setBackground(new Color(0x002266));
        b6.setForeground(Color.white);
           
          
          
       
        panel.add(b1); 
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
       
        
    
        l1.add(panel);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();
      
      /*  if(msg.equals("New Employee"))
            new New_Employee().setVisible(true);
        else if(msg.equals("List Employee"))
            new List_Employee().setVisible(true);
        else if(msg.equals("Update Employee"))
            new Update_employee().setVisible(true);
        else if(msg.equals("Salary"))
            new Salary().setVisible(true);
        else if(msg.equals("Update Salary"))
            new Update_salary().setVisible(true);
        else if(msg.equals("Notepad")){
            try{
               Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }
        else if(msg.equals("Calculator")){
            try{
               Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }
        else if(msg.equals("Web Browser")){
            try{
               Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }catch(Exception e){ }
        }
        else if(msg.equals("Take Attendence")){
            new TakeAttendence().setVisible(true);
        }
        else if(msg.equals("Exit"))
            System.exit(0);
        else if(msg.equals("Generate PaySlip"))
            new pay_slip().setVisible(true);
        else if(msg.equals("List Attendence"))
            new List_Attendence().setVisible(true);*/
    }
    
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}