
package bankmanagementsystem;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupone extends JFrame implements ActionListener{
    
    long random;
    JTextField namet,fnamet,emailt,addresst,cityt,statet,pint;
    JButton next;
    JRadioButton male,female,married,unmarried;
    JDateChooser  dobt;
    
    
    
    signupone()
    {
        setLayout(null);
        
        Random r=new Random();
        
        random=Math.abs((r.nextLong()%9000L)+1000L);
       
        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        
        // for personal details 
        
        JLabel perd=new JLabel("Page 1: Personal Details ");
        perd.setFont(new Font("Raleway",Font.BOLD,22));
        perd.setBounds(290,80,400,40);
         add(perd);
        
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
         add(name);
        
        
        namet=new JTextField();
        namet.setFont(new Font("Raleway",Font.BOLD,14));
        namet.setBounds(300, 140, 400, 30);
        add(namet);
        
        
        JLabel fname=new JLabel("Fathers Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
         add(fname);
        
        fnamet=new JTextField();
        fnamet.setFont(new Font("Raleway",Font.BOLD,14));
        fnamet.setBounds(300, 190, 400, 30);
        add(fnamet);
        
        
        JLabel dob=new JLabel("Date of Birth:");
        
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        
        dob.setBounds(100,240,200,30);
        
        add(dob);
        
         dobt=new JDateChooser();
        dobt.setBounds(300,240,200,30);
        add(dobt);
        
        
        
        
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        add(male);
        male.setBackground(Color.white);
        
        female=new JRadioButton("Female");
        female.setBounds(450,290,70,30);
        female.setBackground(Color.white);
        add(female);
        
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        
        
        
        
        JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailt=new JTextField();
        emailt.setFont(new Font("Raleway",Font.BOLD,14));
        emailt.setBounds(300, 340, 400, 30);
        add(emailt);
        
        
        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married=new JRadioButton("maried");
        married.setBounds(300,390,100,30);
        add(married);
         
         
        unmarried=new JRadioButton("Unmaried");
        unmarried.setBounds(450,390,120,30);
        add(unmarried);
         
         
         ButtonGroup bgi=new ButtonGroup();
         bgi.add(married);
         bgi.add(unmarried);
        
        
        JLabel address=new JLabel("Address :");
        
        address.setFont(new Font("Raleway",Font.BOLD,22));
        
        address.setBounds(100,440,200,30);
        
        add(address);
        
        
         addresst=new JTextField();
        addresst.setFont(new Font("Raleway",Font.BOLD,14));
        addresst.setBounds(300, 440, 400, 30);
        add(addresst);
        
        
        
        JLabel city=new JLabel("City:");
        
        city.setFont(new Font("Raleway",Font.BOLD,22));
        
        city.setBounds(100,490,200,30);
        
        add(city);
        
          cityt=new JTextField();
        cityt.setFont(new Font("Raleway",Font.BOLD,14));
        cityt.setBounds(300, 490, 400, 30);
        add(cityt);
        
        
        JLabel state =new JLabel("State:");
        
        state.setFont(new Font("Raleway",Font.BOLD,22));
        
        state.setBounds(100,540,200,30);
        
        add(state);
        
         statet=new JTextField();
        statet.setFont(new Font("Raleway",Font.BOLD,14));
        statet.setBounds(300, 540, 400, 30);
        add(statet);
        
        
        JLabel pincode =new JLabel("Pin Code:");
        
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        
        pincode.setBounds(100,590,200,30);
        
        add(pincode);
        
         pint=new JTextField();
        pint.setFont(new Font("Raleway",Font.BOLD,14));
        pint.setBounds(300, 590, 400, 30);
        add(pint);
        
        
        
        
        
        
         next=new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);   
        
       
        
        getContentPane().setBackground(Color.WHITE);
       setSize(850,900); 
       setVisible(true);
       setLocation(350,10);
       
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String formno=""+random;// long to string conacatination
        String name=namet.getText();
        String fname=fnamet.getText();
        String dob = ((JTextField) dobt.getDateEditor().getUiComponent()).getText();

         String gender=null;
         if(male.isSelected())
         {
             gender ="male";
         }
         else 
         { 
             gender="female";
         }
         
         String email=emailt.getText();
         
          String marital=null;
          if(married.isSelected())
          {
             marital="married"; 
          }
          
          else
          {
              marital="unmarried";
          }
          
          String address = addresst.getText(); 
          
          String city=cityt.getText();
          
          String state=statet.getText();
          
          String pin=pint.getText();
          
            
          try
          {
              if(name.equals(""))
              {
                 JOptionPane.showMessageDialog(null, "Please enter your name ");
              }
              connection c=new connection();
              String query="INSERT INTO signup values ('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+marital+"','"+state+"','"+city+"','"+pin+"')";
              c.s.executeUpdate(query);
              
              
              setVisible(false);
              
              new signuptwo(formno).setVisible(true);
             
          }
          catch( Exception ae)
          {
              System.out.println(ae);
              
          }
         
                
    }
    
    

    public static void main(String args[])
    {
        new signupone();
    }

    
    
}
