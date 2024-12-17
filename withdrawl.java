


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



public class withdrawl extends JFrame implements ActionListener {
    
    JTextField amountt;
    JButton withdraw,back;
    
    String pinnumber;
     withdrawl(String pinnumber)
    {
       this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.jpg"));
        
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        
        image.setBounds(0,0,900,900);
        
        add(image);
        
        JLabel amount= new JLabel("Enter the Amount to Withdraw");
        amount.setBounds(270,390,400,20);
        amount.setForeground(Color.WHITE);
        amount.setFont(new Font("system",Font.BOLD,16));
        image.add(amount);
        
        amountt=new JTextField();
        amountt.setBounds(270,430,200,20);
        amountt.setFont(new Font("system",Font.BOLD,18));
        add(amountt);
        
        
        
        withdraw=new JButton("Withdrawl");
        withdraw.setBounds(390,500,100,20);
        withdraw.setFont(new Font("system",Font.BOLD,12));
        withdraw.setBackground(Color.BLACK);
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        
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
         if(ae.getSource()==withdraw)
         {
             String amount=amountt.getText();
             Date date=new Date();
             
             if(amount.equals(""))
             {
                 JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to Withdraw");
             }
             
             else
             {
                 try
                 {
                    connection c=new connection();
                    String query="insert into deposit values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+amount+" Withdrawl succesfully  ");
                    
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
        new withdrawl("");
        
    }
    
}
