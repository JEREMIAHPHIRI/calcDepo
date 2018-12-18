/*
 write a program that calculates and displays the price before commission and after
commission of 6%: The program prompt the user to enter
i.
Quality of products purchased
ii.
Unit price.
 */
package main;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

/**
 *
 * @author j3r3miah
 */
public class question4 extends JFrame{
JTextField quantity=new JTextField();
 JTextField price=new JTextField();
 JTextArea ta=new JTextArea();
    
      public question4(){
          super("quantiser");
          JPanel labels=new JPanel();
          labels.setLayout(new GridLayout(2,2));
          labels.setBackground(Color.WHITE);
                  JLabel quantitylabel=new JLabel();
                     quantitylabel=new JLabel("enter the quantity of the goods");
                       JLabel pricelabel=new JLabel();
                            pricelabel=new JLabel("enter the unit price");
           
                            
          JPanel field=new JPanel();
             field.setLayout(new GridLayout(2,2));
             field.setBackground(Color.WHITE);
                 quantity=new JTextField(" ",30);
                   price=new JTextField(" ",30);
                   
                   
                   
                   
                  field.add(quantitylabel,BorderLayout.WEST);               
           labels.add(pricelabel,BorderLayout.WEST);              
           labels.add(quantity,BorderLayout.EAST);
                    field.add(price,BorderLayout.EAST);
                    
           JPanel tar=new JPanel();
           tar.setLayout(new GridLayout(2,2));
           tar.add(ta);
          
                    JPanel container=new JPanel();
                    container.setBorder(new TitledBorder("PRICES AT 6 % CURRENT COMMISSION"));
                      container.add(labels,BorderLayout.WEST);
                        container.add(field,BorderLayout.EAST);
                         container.add(tar,BorderLayout.SOUTH);
                          container.setBackground(Color.WHITE);
                          
                        
                        
          add(container);
          
          
          
          handle handler = new handle();
           quantity.addActionListener(handler);
           price.addActionListener(handler);
             // ta.addActionListener(handler);
          
      
      }
   
      public  class handle implements ActionListener{
         
           public void actionPerformed(ActionEvent ae){
               try{
               String qstring=quantity.getText();
                 double qnum=Double.parseDouble(qstring) ;
               String pstring=price.getText();
                 double pnum=Double.parseDouble(pstring);
                  
                  double pricebc=pnum*qnum;
                     double percentager=0.06;
                        double percentaged=pricebc-percentager;
                         
                        
                         String print1=String.valueOf(pricebc);
                          String print=String.valueOf(percentaged);
                            String go=String.format("\n price before COMISSION: %s \n price after commission %s",print1,print);
                          ta.setText(go);
               }catch(Exception e){JOptionPane.showMessageDialog(null,"you have an error in your input or u have null input");
               ta.setText(" ");
               
               }

           
           }
  
      
      }
      
      
      
    public static void main(String[] args) {
   question4 m=new question4();
   m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   m.setSize(400,270);
   m.setLocation(300,146);
   m.setVisible(true);
   
     
        
    }
    
}
