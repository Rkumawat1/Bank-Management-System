


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
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Date;



public class fastcash extends JFrame implements ActionListener {
    
    JButton deposit,withdrawl,fastcash,ministatement,bi,pin,exit;
    String pinnumber;
     fastcash(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.jpg"));
        
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        
        image.setBounds(0,0,900,900);
        
        add(image);
        
        JLabel text=new JLabel("Select Withdrawl Amount");
        text.setBounds(240,360,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,18));
        
        image.add(text);
        
        deposit=new JButton("Rs 100");
        deposit.setBounds(230,425,100,30);
        deposit.setFont(new Font("system",Font.BOLD,12));
        deposit.setForeground(Color.WHITE);
        deposit.setBackground(Color.BLACK);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        withdrawl=new JButton("Rs 500");
        withdrawl.setBounds(350,425,150,30);
        withdrawl.setFont(new Font("system",Font.BOLD,12));
        withdrawl.setForeground(Color.WHITE);
        withdrawl.setBackground(Color.BLACK);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastcash=new JButton("Rs 1000");
        fastcash.setBounds(230,460,100,30);
        fastcash.setFont(new Font("system",Font.BOLD,12));
        fastcash.setForeground(Color.WHITE);
        fastcash.addActionListener(this);
        fastcash.setBackground(Color.BLACK);
        
        image.add(fastcash);
        
        ministatement=new JButton("Rs 2000");
        ministatement.setBounds(350,460,150,30);
        ministatement.setFont(new Font("system",Font.BOLD,12));
        ministatement.setForeground(Color.WHITE);
        ministatement.addActionListener(this);
        ministatement.setBackground(Color.BLACK);
        
        image.add(ministatement);
        
        bi=new JButton("Rs 5000");
        bi.setBounds(230,495,100,30);
         bi.setFont(new Font("system",Font.BOLD,12));
        bi.setForeground(Color.WHITE);
        bi.addActionListener(this);
        bi.setBackground(Color.BLACK);
        image.add(bi);
        
        pin=new JButton("Rs 10,000");
        pin.setBounds(350,500,150,30);
          pin.setFont(new Font("system",Font.BOLD,12));
        pin.setForeground(Color.WHITE);
        pin.setBackground(Color.BLACK);
        pin.addActionListener(this);
        image.add(pin);
        
        
        exit=new JButton("Back");
        exit.setBounds(230,530,100,20);
         exit.setFont(new Font("system",Font.BOLD,12));
        exit.setForeground(Color.WHITE);
        exit.setBackground(Color.BLACK);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(1000,1000);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
     
     public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == exit) {
        setVisible(false);
        new transaction(pinnumber).setVisible(true);
    } else {
        String amount = ((JButton) ae.getSource()).getText().substring(3).replaceAll(",", "");
        connection c = new connection();
        try {
            ResultSet rs = c.s.executeQuery("select * from  deposit where pin='" + pinnumber + "'");

            int balance = 0;

            while (rs.next()) {
                if (rs.getString("type").equals("deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }

            if (balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                return;
            }

            Date date = new Date();

            String query = "insert into deposit values('" + pinnumber + "','" + date + "','withdrawal','" + amount + "')";

            c.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Rs " + amount + " Debited Successfully");

            setVisible(false);

            new transaction(pinnumber).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

          
          
    
    public static void main(String args[])
    {
        new fastcash(""); 
    }
    
}
