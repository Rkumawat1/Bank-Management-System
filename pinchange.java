
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class pinchange extends JFrame implements ActionListener {
    
    JPasswordField pint,rpt;
    JButton change,back;
    
    String pinnumber ;
    public pinchange(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.jpg"));
        Image scaledImage = icon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);

        JLabel text = new JLabel("Change Your PIN");
        text.setBounds(300, 350, 500, 25);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        imageLabel.add(text);

        JLabel ptext = new JLabel("NEW PIN");
        ptext.setBounds(230, 423, 280, 25);
        ptext.setFont(new Font("Arial", Font.BOLD, 16));
        ptext.setForeground(Color.WHITE);
        imageLabel.add(ptext);

         pint = new JPasswordField();
        pint.setBounds(370, 423, 140, 25);
        pint.setFont(new Font("Arial", Font.BOLD, 16));
        imageLabel.add(pint);

        JLabel rptext = new JLabel("Re-Enter NEW PIN");
        rptext.setBounds(230, 460, 180, 25);
        rptext.setFont(new Font("Arial", Font.BOLD, 14));
        rptext.setForeground(Color.WHITE);
        imageLabel.add(rptext);

         rpt = new JPasswordField();
        rpt.setBounds(370, 460, 140, 25);
        rpt.setFont(new Font("Arial", Font.BOLD, 16));
        imageLabel.add(rpt);
        
        
         change=new JButton("Change");
        change.setBounds(410,500,100,20);
         change.setFont(new Font("Arial", Font.BOLD, 16));
           change.addActionListener(this);
         imageLabel.add(change);
         
      
         
        
            back=new JButton("Back");
        back.setBounds(410,524,100,20);
         back.setFont(new Font("Arial", Font.BOLD, 16));
           back.addActionListener(this);
         imageLabel.add(back);
         
        
        setUndecorated(true);
        setSize(900,900);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        
        if(ae.getSource()==change)
        {
            
            try
             {
         String pin = new String(pint.getPassword());
          String rpin = new String(rpt.getPassword());
         
         if(!pin.equals(rpin))
         {
             JOptionPane.showMessageDialog(null, "Pin not Matched with the Above pin");
             return;
         }
             
         if(pin.equals(""))
         {
             JOptionPane.showMessageDialog(null, "please enter the  PIN");
             return;
            
         }
         
         if(rpt.equals(""))
         {
             JOptionPane.showMessageDialog(null, "please Re-Enter the  New  PIN");
             return;
            
         }
         
         connection c=new connection();
         String queryone ="update deposit set pin='"+rpin+"' where pin='"+pinnumber+"'";
         String querytwo ="update login set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
         String querythree="update signupthree set pin='"+rpin+"' where pin='"+pinnumber+"'";
         
         c.s.executeUpdate(queryone);
         c.s.executeUpdate(querytwo);
         c.s.executeUpdate(querythree);
         
         JOptionPane.showMessageDialog(null, "Pin Change successfully");
         
         setVisible(false);
         new transaction(rpin).setVisible(true);
           
         
            
        } catch(Exception e)
        {
            System.out.println(e);
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
        new pinchange("");
    }
    
}
