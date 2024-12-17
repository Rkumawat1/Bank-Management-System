
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import cardnumber.cardnumber;



public class deposit extends JFrame implements ActionListener {
    
    JTextField amountt;
    JButton deposit,back;
    
    String pinnumber;
     deposit(String pinnumber)
    {
       this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.jpg"));
        
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        
        image.setBounds(0,0,900,900);
        
        add(image);
        
        JLabel amount= new JLabel("Enter the Amount to Deposit");
        amount.setBounds(270,390,400,20);
        amount.setForeground(Color.WHITE);
        amount.setFont(new Font("system",Font.BOLD,16));
        image.add(amount);
        
        amountt=new JTextField();
        amountt.setBounds(270,430,200,20);
        amountt.setFont(new Font("system",Font.BOLD,18));
        add(amountt);
        
        
        
        deposit=new JButton("Deposit");
        deposit.setBounds(390,500,100,20);
        deposit.setFont(new Font("system",Font.BOLD,12));
        deposit.setBackground(Color.BLACK);
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        back=new JButton("Back");
        back.setBounds(390,530,100,20);
        back.setFont(new Font("system",Font.BOLD,12));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
        
        setVisible(true);
        setSize(900,900);
        
    }
     
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==deposit)
         {
             String amount=amountt.getText();
             Date date=new Date();
             
             if(amount.equals(""))
             {
                 JOptionPane.showMessageDialog(null, "Please Enter Money to Deposit");
             }
             
             else
             {
                 try
                 {
                    connection c=new connection();
                    String query="insert into deposit values('"+pinnumber+"','"+date+"','deposit','"+amount+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+amount+"succesfully Deposited ");
                    
                    setVisible(false);
                    new transaction(pinnumber).setVisible(true);
                  
                 } catch(Exception e)
                 {
                     System.out.println(e);
                 }
                 
                 
             }
         }
         else if(ae.getSource()==back)
         {
             setVisible(false);
             new transaction(pinnumber).setVisible(true);
         }
     }
    
    public static void main(String args[])
           
    {
        
        new deposit("");
        
    }
    
}
