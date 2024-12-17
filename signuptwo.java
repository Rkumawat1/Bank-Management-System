

package bankmanagementsystem;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signuptwo extends JFrame implements ActionListener{
    
    long random;
    JTextField pant,aadhart;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JDateChooser  dobt;
    String formno;
    
    JComboBox r,valc,valI,valQualification,valOccupation;
    
    signuptwo(String formno)
    {
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
//        Random r=new Random();
//        
//        random=Math.abs((r.nextLong()%9000L)+1000L);
       
        
        
        
        // for personal details 
        
        JLabel addd=new JLabel("Page 2: Additional  Details ");
        addd.setFont(new Font("Raleway",Font.BOLD,22));
        addd.setBounds(290,80,400,40);
         add(addd);
        
        
        JLabel Religion=new JLabel("Religion:");
        Religion.setFont(new Font("Raleway",Font.BOLD,22));
        Religion.setBounds(100,140,100,30);
        add(Religion);
        
        String valreligion[]={"Hindu","Muslim","Sikh","Christion","Other"};
        
        r=new JComboBox(valreligion);
        
         r.setFont(new Font("Raleway",Font.BOLD,14));
         r.setBounds(300, 140, 400, 30);
         r.setBackground(Color.WHITE);
         add(r);
        
        
        JLabel Category=new JLabel("Category");
        Category.setFont(new Font("Raleway",Font.BOLD,22));
        Category.setBounds(100,190,200,30);
         add(Category);
        
         String valCatagroy[]={"General","OBC","SC","ST","Other"};
         
         valc=new JComboBox(valCatagroy);
        
        valc.setFont(new Font("Raleway",Font.BOLD,14));
        valc.setBackground(Color.WHITE);
        valc.setBounds(300, 190, 400, 30);
        add(valc);
        
        
        JLabel Income=new JLabel("Income");
        
        Income.setFont(new Font("Raleway",Font.BOLD,22));
        
        Income.setBounds(100,240,200,30);
        
        add(Income);
        
        
        String valIncome[]={"null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
         
          valI=new JComboBox(valIncome);
         
        valI.setBounds(300,240,400,30);
        
        valI.setBackground(Color.WHITE);
        
        add(valI);
        
        
        JLabel Education=new JLabel("Education");
        Education.setFont(new Font("Raleway",Font.BOLD,22));
        Education.setBounds(100,290,200,30);
        add(Education);
        
        
        
        JLabel Qualification=new JLabel("Qualification :");
        Qualification.setFont(new Font("Raleway",Font.BOLD,22));
        Qualification.setBounds(100,315,200,30);
        add(Qualification);
        
        String valQ[]={"Non Graduation ","Graduate","Post Graduation","Other"};
         
         valQualification=new JComboBox(valQ);
      
//        valQualification=new JComboBox();
        valQualification.setFont(new Font("Raleway",Font.BOLD,14));
        valQualification.setBounds(300, 315, 400, 30);
        valQualification.setBackground(Color.WHITE);
        add(valQualification);
        
        
        JLabel Occupation=new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway",Font.BOLD,22));
        Occupation.setBounds(100,390,200,30);
        add(Occupation);
        
        
        String valO[]={"Salaried ","Self-Employed","Business","Student","Other"};
         
          valOccupation=new JComboBox(valO);
        
        valOccupation.setBounds(300, 390, 400, 30);
        
        add(valOccupation);
        
        
        
        JLabel PANNO=new JLabel("PAN NO :");
        
        PANNO.setFont(new Font("Raleway",Font.BOLD,22));
        
        PANNO.setBounds(100,440,200,30);
        
        add(PANNO);
        
        
         pant=new JTextField();
        pant.setFont(new Font("Raleway",Font.BOLD,14));
        pant.setBounds(300, 440, 400, 30);
        add(pant);
        
        
        
        JLabel AdharNumber=new JLabel("Adhar Number :");
        
        AdharNumber.setFont(new Font("Raleway",Font.BOLD,22));
        
        AdharNumber.setBounds(100,490,200,30);
        
        add(AdharNumber);
        
          aadhart=new JTextField();
        aadhart.setFont(new Font("Raleway",Font.BOLD,14));
        aadhart.setBounds(300, 490, 400, 30);
        add(aadhart);
        
        
        JLabel SeniorCitizen = new JLabel("Senior Citizen:");
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 22));
        SeniorCitizen.setBounds(100, 540, 200, 30);
        add(SeniorCitizen);

            syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

         sno = new JRadioButton("No");
         sno.setBounds(400, 540, 100, 30);
       sno.setBackground(Color.WHITE);
       add(sno);

       ButtonGroup bgSeniorCitizen = new ButtonGroup();
       bgSeniorCitizen.add(syes);
       bgSeniorCitizen.add(sno);

// Existing Account
      JLabel ExistingAccount = new JLabel("Existing Account:");
      ExistingAccount.setFont(new Font("Raleway", Font.BOLD, 22));
      ExistingAccount.setBounds(100, 590, 200, 30);
       add(ExistingAccount);

      eyes = new JRadioButton("Yes");
      eyes.setBounds(300, 590, 100, 30);
      eyes.setBackground(Color.WHITE);
       add(eyes);

         eno = new JRadioButton("No");
       eno.setBounds(400, 590, 100, 30);
          eno.setBackground(Color.WHITE);
        add(eno);

       ButtonGroup bgExistingAccount = new ButtonGroup();
       bgExistingAccount.add(eyes);
        bgExistingAccount.add(eno);
        
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
        String religion=(String)r.getSelectedItem();
        String category=(String)valc.getSelectedItem();
        
        String income=(String)valI.getSelectedItem();
        
        String qualification=(String)valQualification.getSelectedItem();
        
        String occupation=(String)valOccupation.getSelectedItem();
        
        String pan=pant.getText();
        
        String aadhar=aadhart.getText();
        
         String seniorcitizen=null;
         if(eyes.isSelected())
         {
             seniorcitizen ="Yes";
         }
         else 
         { 
             seniorcitizen="No";
         }
         

         
          String existing=null;
          if(eyes.isSelected())
          {
             existing="Yes"; 
          }
          
          else
          {
              existing="No";
          }
          

          
            
          try
          {
              
              connection c=new connection();
              String query="INSERT INTO signuptwo values ('"+formno+"', '"+religion+"','"+category+"','"+income+"','"+qualification+"','"+occupation+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+existing+"')";
              c.s.executeUpdate(query);
              setVisible(false);
              new signupthree(formno).setVisible(true);
             
          }
          catch( Exception ae)
          {
              System.out.println(ae);
              
          }
         
                
    }
    
    

    public static void main(String args[])
    {
        new signuptwo("");
    }

    
    
}
