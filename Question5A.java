/*
 * 5(a) Create a swing Applet or use Dialog boxes or any GUI components (well labeled) to
write a program that

calculates and displays the amount of money from year 1 to year 10,
you would have, 
    if you invested $1500 at 5% compound interest.
Use the formula: [Pt = Po (1+r)t]
     Amount = Principle * math.pow (1.0+rate,year)
 */
package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author j3r3miah
 */
public class Question5A extends JFrame{
   
   JPanel labels=new JPanel();
 
   JPanel fields=new JPanel();
   JPanel container=new JPanel();
                 
    public Question5A(){
         super("compound interest");
          setLayout(new FlowLayout());
           labels.setLayout(new GridLayout(10,1,10,10));  
           labels.setBackground(Color.red);
           fields.setLayout(new GridLayout(3,4,3,3));
        
          
         double principle=1500;
     for(int ynum=1;ynum<=10;ynum++){
         double amount=principle*Math.pow(1.0+0.05,ynum);
           //double amount=1500*powered; 
           
         //  Amount = Principle * math.pow (1.0+rate,year)  
            String strind=String.valueOf(ynum); 
            String strind2=String.valueOf(amount);
            
           String all=String.format("\t year %s \n amount :$%s",strind,strind2);
           
          JTextArea years=new JTextArea(all);
          years.setEditable(false);
          years.setFont(new Font("serif",Font.PLAIN,22));
          labels.add(years);
          container.add(labels);
          container.setBackground(Color.GREEN);
          
          add(container,BorderLayout.CENTER);
           
     }
          
          
}
   
     public static void main(String[] args){
         Question5A q5=new Question5A();
      q5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      q5.pack();
      q5.setVisible(true);
      
     
     }  
     
    
}
