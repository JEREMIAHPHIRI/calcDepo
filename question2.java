/*
 *Create a swing Applet or use Dialog boxes or any GUI components (well labeled) to
write a program that 
prompt the user to enter the number of hours worked 
and the hourly rate of pay. 
Display your gross pay,
Net pay which is 15% of your gross pay.
 */
package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.border.*;

/**
 *
 * @author j3r3miah
 */
public class question2 extends JFrame{
   String numberofhours;
   String rateperhour;
    
   public question2(){
     int x=1;//error handling program will be equated to 1;
      do{
   try{
     numberofhours=JOptionPane.showInputDialog(null,"enter number of hours below ","Hours WORKED",JOptionPane.QUESTION_MESSAGE);
      rateperhour=JOptionPane.showInputDialog(null,"enter your Hour rate "," Hourly Rate",JOptionPane.QUESTION_MESSAGE);
       double converthours=Double.parseDouble(numberofhours);
         double convertrateperhour=Double.parseDouble(rateperhour);
            double gross=converthours*convertrateperhour;
               //double percentager=gross/100;
              double percentage=gross*0.15;
            double finale=gross-percentage;
          double finaleprint=gross-finale;
        JOptionPane.showMessageDialog(null,gross,"Gross pay",JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null,finaleprint,"net pay(15% OF GROSS PAY)",JOptionPane.INFORMATION_MESSAGE);
      x=2;//if x=2 then program ran successfull
   }
   catch(Exception e){
       String error=String.format("\t YOU HAVE AN ERROR\t \n either"
           + " \n number of hours  '%s' \n or \n rate per Hour '%s't \n"
           + " is not a number or its empty",numberofhours,rateperhour);
        JOptionPane.showMessageDialog(null,error,"ERROR",JOptionPane.WARNING_MESSAGE);
   
   }
   }while(x==1);//if program still has x equated to 1 then it didnt run Suceesfully
 } 

 
public static void main(String args[]){
 question2 q2=new question2();
 

}


}
