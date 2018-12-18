/*
 *Create a swing Applet or use Dialog boxes or any GUI components (well labeled) to
write a program that calculates and displays the weekly salary for employee who earns
$25 an hour on 49 regular working hours, and earns time and half (wages * 1.5) for over
time worked:
Prompt number of hours.
 */
package main;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author j3r3miah
 */

public class question3 extends JFrame {
       String numberofhours;
       
       private JLabel label=new JLabel();
       
       public question3(){
       super("wages calculator");
        setLayout(new FlowLayout());
        int x=1;
        do{
       try{
      numberofhours= JOptionPane.showInputDialog(null,"number of hours you worked this month","WAGE CALCULATOR",JOptionPane.QUESTION_MESSAGE);
     double check=Double.parseDouble(numberofhours);
      if(check<=49)
      {
           double hourmultiply = check*25;
                 JOptionPane.showMessageDialog(null,hourmultiply,"WEEKLY PAY",JOptionPane.INFORMATION_MESSAGE);
                   x=2; 
      }  
      else if(check>49){
        double overtimehours=check-49;
           double normalvalue=49*25;
            double overtime=overtimehours*1.5*25;
              double pay=normalvalue+overtime;
              double overtimeactual=check-49;
              JOptionPane.showMessageDialog(null,overtimeactual,"HOURS OF OVERTIME",JOptionPane.INFORMATION_MESSAGE); 
                
           JOptionPane.showMessageDialog(null,pay,"YOUR WEEKLY PAY WITH OVERTIME",JOptionPane.INFORMATION_MESSAGE);  
        x=2;   
      }
      
       } catch(Exception e){
         String errorprint=String.format("\t YOU HAVE AN ERROR\t \n either"
           + " \n numberofhours: %s \n"
           + " is not a number please Enter a number",numberofhours);
         
            
        
     JOptionPane.showMessageDialog(null,errorprint,"ERROR",JOptionPane.WARNING_MESSAGE);  
       
       }
       }
          while(x==1);
       
       }
  
public static void main(String args[]){
 question3 q3=new question3();


}   
    
}
