
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class signupthree extends JFrame  implements ActionListener{
    JRadioButton saving,current,fda,rda ;
    ButtonGroup b1;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    
    String formno;
    public signupthree(String formno)
    {
        this.formno=formno;
        
        setLayout(null);
        JLabel l1=new JLabel("PAGE 3: Account details");
        
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type :");
        
        type.setFont(new Font("Raleway",Font.BOLD,16));
        type.setBounds(100,140,200,30);
        add(type);
        
        saving=new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway",Font.BOLD,16));
        saving.setBackground(Color.WHITE);
        saving.setBounds(100,180,150,20);
        add(saving);
        
        
         fda=new JRadioButton("Fixed Deposit Account:");
        fda.setFont(new Font("Raleway",Font.BOLD,16));
        fda.setBackground(Color.WHITE);
        fda.setBounds(350,180,250,20);
        add(fda);
        
        
        rda=new JRadioButton("Recurring Deposit Account:");
        rda.setFont(new Font("Raleway",Font.BOLD,16));
        rda.setBackground(Color.WHITE);
        rda.setBounds(100,220,250,20);
        add(rda);
        
        current=new JRadioButton("Current Account:");
        current.setFont(new Font("Raleway",Font.BOLD,16));
        current.setBackground(Color.WHITE);
        current.setBounds(370,220,250,20);
        add(current);
        
        b1=new ButtonGroup();
        b1.add(saving);
        b1.add(fda);
        b1.add(rda);
        b1.add(current);
        
        
        JLabel card=new JLabel("Card Number:");
        card.setBounds(100,300,200,30);
        card.setFont(new Font("Raleway",Font.BOLD,16));
        add(card);
        
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-5242");
        number.setBounds(330,300,300,30);
        number.setFont(new Font("Raleway",Font.BOLD,16));
        add(number);
        
        
        
        JLabel carddetail=new JLabel("Your 16 Digit Card Number");
        carddetail.setBounds(100,330,300,30);
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        add(carddetail);
        
        
        JLabel pin=new JLabel("PIN Number:");
        pin.setBounds(100,370,200,30);
        pin.setFont(new Font("Raleway",Font.BOLD,16));
        add(pin);
        
        JLabel pindetail=new JLabel("Your 4 Digit Pin Number");
        pindetail.setBounds(100,400,200,30);
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        add(pindetail);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setBounds(330,370,300,30);
        pnumber.setFont(new Font("Raleway",Font.BOLD,16));
        add(pnumber);
        
        
        JLabel services =new JLabel("Services Required:");
        services.setBounds(100,450,200,30);
        services.setFont(new Font("Raleway",Font.BOLD,16));
        add(services);
        
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setBounds(350,500,200,30);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        add(c2);
        
        
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        
        
        c4=new JCheckBox("Cheque Book");
        c4.setBackground(Color.WHITE);
        c4.setBounds(100,600,200,30);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        add(c4);
        
        
        
        c5=new JCheckBox("E-Statement");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(350,600,200,30);
        add(c5);
        
        
        c6=new JCheckBox("Email and SMS Alerts ");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,550,200,30);
        add(c6);
        
        
        
        c7=new JCheckBox("I agree that above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,670,600,30);
        add(c7);
        
        
        submit=new JButton("Submit");
        submit.setBounds(250,710,100,30);
         submit.setFont(new Font("Raleway",Font.BOLD,14));
         submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel=new JButton("Cancel");
        cancel.setBounds(500,710,100,30);
         cancel.setFont(new Font("Raleway",Font.BOLD,14));
         cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.addActionListener(this);
        add(cancel);
          
        
        getContentPane().setBackground(Color.WHITE);
        
        
        
        setSize(800,800);
        setLocation(350,0);
        setVisible(true);
        
        
        }
        public void actionPerformed( ActionEvent ae)
        {
  
            if(ae.getSource()==submit)
            {
                String accounttype=null;
                if(saving.isSelected())
                {
                    accounttype="Saving Account";
                }
                else if(rda.isSelected())
                {
                    accounttype="Recurring Deposit Account";
                }
                else if(fda.isSelected())
                {
                    accounttype="Fixed Deposit Account";
                }
                
                else if(current.isSelected())
                {
                    accounttype="Current Account";
                }
                
                Random random=new Random();
                String cardnumber= ""+Math.abs((random.nextLong() %90000000L)+ 5040936000000000L);
                
                String pinnumber=""+Math.abs((random.nextLong() % 9000L+ 1000L));
                
                String facility="";
                if(c1.isSelected())
                {
                    facility=facility+"Atm Card";
                }
                
                else if(c2.isSelected())
                {
                    facility=facility+"Internet Banking";
                }
                
                else if(c3.isSelected())
                {
                    facility=facility+"Mobile Banking";
                }
                
                else if(c4.isSelected())
                {
                    facility=facility+"Cheque Book";
                }
                
                else if(c5.isSelected())
                {
                    facility=facility+"E-Statement";
                }
                else if(c6.isSelected())
                {
                    facility=facility+"Email and SMS Alerts";
                }
                
                try
                {
                  if(accounttype.equals(""))
                  {
                      JOptionPane.showMessageDialog(null, "Account Type is Required ");
                  }
                  else 
                  {
                      connection c=new connection();
                      
                      String query1= "insert into signupthree values ('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                      String query2= "insert into login values ('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                     
                      c.s.executeUpdate(query1);
                      c.s.executeUpdate(query2);
                     
                      
                      JOptionPane.showMessageDialog(null, "card Number:"+cardnumber +"\n pin: "+pinnumber );
                      JOptionPane.showMessageDialog(null, "Your Account has been created Successfully ");
                      
                      setVisible(false);
                      new deposit(pinnumber).setVisible(false);
                      
                  }
                    
                } catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else if(ae.getSource()==cancel)
            {
                setVisible(false);
                new Login().setVisible(true);
            }
  
       }


    
    
    public static void main(String argrs[])
    {
        new signupthree("");
    }
    
}
