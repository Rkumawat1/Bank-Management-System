
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.EventListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


   public  class balanceinquiry extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber ;
    balanceinquiry(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        
        image.setBounds(0,0,900,900);
        
        add(image);
      
        back=new JButton("Back");
        back.setBounds(390,530,100,20);
        back.setFont(new Font("system",Font.BOLD,12));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
        
        
        connection c = new connection();
        int balance = 0;
        try {
            ResultSet rs = c.s.executeQuery("select * from  deposit where pin='" + pinnumber + "'");

            

            while (rs.next()) {
                if (rs.getString("type").equals("deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        JLabel l1=new JLabel("Your Current Account Balance is Rs"+ balance );
       l1.setForeground(Color.WHITE);
       l1.setFont(new Font("system",Font.BOLD,12));
       l1.setBounds(240,380,400,30);
       image.add(l1);
        
        
        
        setLocation(300,0);
        setVisible(true);
        setSize(900,900);
        
    }
    
    public void actionPerformed(EventListener ae)
    {
        setVisible(false);
        new transaction(pinnumber).setVisible(true);
        
        
    }
    public static void main(String args[])
    {
        new balanceinquiry("");
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
    
}
