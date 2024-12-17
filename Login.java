
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    
    
    JButton clear,signup,login;
    JTextField cardt;
    JPasswordField pint;      
    
    Login()
    {
        setTitle(" Automatic Teller machine");
        
        setLayout(null);
        
        // setting an images in the page 
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/images.jpeg"));
    
         Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
         
         ImageIcon i3=new ImageIcon(i2);
         
          JLabel label =new JLabel(i3);
          
          label.setBounds(70, 10, 100, 100);
        
            add(label);
            
            // setting the text 
            
            JLabel text= new JLabel("Welcome to ATM");
            text.setFont(new Font("osward",Font.BOLD,38));
            
            text.setBounds(200, 40, 400, 40);
            
            add(text);
            
            //  for the card no 
            JLabel cardno= new JLabel("Card no:");
            cardno.setFont(new Font("Raleway",Font.BOLD,38));
            
            cardno.setBounds(120, 150, 400, 40);
            
            add(cardno);
            
             cardt=new JTextField();
            
            cardt.setBounds(300, 150, 230, 30);
            
            add(cardt);
            
            // for the pin 
            
            JLabel pin= new JLabel("Pin:");
            pin.setFont(new Font("Raleway",Font.BOLD,38));
            
            pin.setBounds(120, 220, 250, 40);
            
            add(pin);
            
              pint=new JPasswordField();
            
              pint.setBounds(300, 220, 230, 30);
            
               add(pint);
            
            
        //for buttons
        login = new JButton("Login");
            
            login.setBounds(300,300,100,30);
            login.setBackground(Color.BLACK);
            login.setForeground(Color.WHITE);
            add(login);
            login.addActionListener(this);
            
            
            clear = new JButton("CLEAR ");
            
            clear.setBounds(430,300,100,30);
            clear.setBackground(Color.BLACK);
            clear.setForeground(Color.WHITE);
            add(clear);
            clear.addActionListener(this);
            
        
           signup = new JButton("SIGN UP");
            
            signup.setBounds(300,350,230,30);
            signup.setBackground(Color.BLACK);
            signup.setForeground(Color.WHITE);
            add(signup);
            signup.addActionListener(this);
            
            getContentPane().setBackground(Color.WHITE);
        
            setSize(800,450);
            setVisible (true);
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==clear)
        {
            pint.setText("");
            cardt.setText("");
        }
        else if(e.getSource()==login)
        {
            connection c=new connection();
            
            String cardnumber=cardt.getText();
            
            String pinnumber=pint.getText();
            
            String query="select * from login where cardnumber='"+cardnumber+"' and pinnumber='"+pinnumber+"'";
            
            
            try
            {
                ResultSet rs=c.s.executeQuery(query);
                
                if(rs.next())
                {
                    setVisible(false);
                    new transaction(pinnumber).setVisible(true);
                }
                
                else 
                {
                    JOptionPane.showMessageDialog(null, "Incorrect card number or Pin Number");
                }
                
            }catch(Exception ae)
            {
                System.out.println(ae);
            }
            
        }
        else if(e.getSource()==signup)
        {
            setVisible(false);
            
            new signupone().setVisible(true);
        }
        
    }
    
    public static void main(String args[])
    {
        new Login();
        
    }

    
    
    
}
