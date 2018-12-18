/*
  a program that calculates the amount of money earned on an investment, the
amount should include 12% interest. 
Prompt the user to enter investment amount and the number of years for the investment
Using the formula [Pt = Po (1+r)t]

Amount = principle * math.pow (1.0 + rate, year)
 */
package main;

/**
 *
 * @author j3r3miah
 */
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class question5B extends JFrame{
    JTextField principle=new JTextField();
    JTextField year=new JTextField();
      JTextArea ouput=new JTextArea();
      JButton compute=new JButton();
   
    
    JPanel labels=new JPanel();
 
    JPanel fields=new JPanel();
    JPanel container=new JPanel();
  
   public question5B(){ 
         labels.setLayout(new GridLayout(2,1,2,2));
         fields.setLayout(new GridLayout(2,1,2,2));
      JLabel plabel=new JLabel("enter amount ypu invested");
      JLabel ylabel=new JLabel("enter the number of years");  
      compute.setForeground(Color.red);
      compute=new JButton("compute");
      compute.setBackground(Color.green);
      
       principle=new JTextField(" ",15);
       year=new JTextField(" ",15);
       
           labels.add(plabel);
             fields.add(principle);
           labels.add(ylabel);
              fields.add(year);
           container.add(labels);
           container.add(fields);
           container.add(compute);
           container.add(ouput);
           labels.setBackground(Color.WHITE);
           container.setBackground(Color.white);
            add(container);
            
   processor process=new processor();
   principle.addActionListener(process);
    year.addActionListener(process);
    compute.addActionListener(process);
    //ouput.addActionListener(process);
              
   
   }
   
   public class processor implements ActionListener{
 @Override
        public void actionPerformed(ActionEvent ae) {
     if(ae.getSource()==compute){
       try{     
            String pstring=principle.getText();
            String ystring=year.getText();
             double pnum=Double.parseDouble(pstring);
                 double ynum=Double.parseDouble(ystring);
                     for(int i=1;i<=ynum;i++){
                         double amount=pnum*Math.pow(1.0+0.12,i);
                     String ys=String.valueOf(amount),year=String.valueOf(i);
                 String print=String.format("year:%s \n amount\n %s",year,ys);
       //Amount = principle * math.pow (1.0 + rate, year)
        JOptionPane.showMessageDialog(null,print,"YEARLY AMOUNT",JOptionPane.INFORMATION_MESSAGE);
                 
            
          }
          
               }catch(Exception E){JOptionPane.showMessageDialog(null,"YOU ERROR","ERROR",JOptionPane.WARNING_MESSAGE);}
        }




}
   }
 
public static void main(String args[]){
 question5B q5b=new question5B();
  q5b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  q5b.setTitle("investment calculator");
 q5b.setLocation(420,280);
  q5b.setVisible(true);
  q5b.setSize(430,400);

}   
   


    
}
