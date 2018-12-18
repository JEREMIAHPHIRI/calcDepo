/*
 * Create a swing Applet or use Dialog boxes or any GUI components (well labeled) to
write a program that 
  calculates the
income tax assessed at 8% of taxable income for income less than or equal to K6000 
and 
income greater than K6000,taxes are 12% of the income plus a fixed amount of K600
 */
  ///////////////////////////////////////////IMPORTATIONS//////////////////////////////////////////////////////////////////////////////////
package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author j3r3miah
 */  ////////////////////////////////////////////////////FRAMING///////////////////////////////////////////////////////////////////////////////////
public class question7 extends JFrame{
   JTextField income=new JTextField();
    JLabel lable=new JLabel();

    ///////////////////////////////////////////////////////CONSTRUCTOR/////////////////////////////////////////////////////////////////////////////
    public question7(){
        super("INCOME TAX DEDUCTOR");
       setLayout(new FlowLayout());
         lable=new JLabel("enter your income below");
             add(lable);
       
        income=new JTextField(14);
            add(income); 
        
        handle handler=new handle();
              income.addActionListener(handler);
  
    
    }
      //////////////////////////////////////////////////////EVENT HANDLING //////////////////////////////////////////////////////////////////////
    public  class  handle implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
          if(ae.getSource()==income){
              try{
                String string;
                  string=String.format(ae.getActionCommand());
                   double checkincome=Double.parseDouble(string);
                     if(checkincome<=6000){
                      double value=checkincome;
                        double percentage=value/100*8;
                        double finale=value-percentage;
                       double finaleprint=value-finale;
                      JOptionPane.showMessageDialog(null,finaleprint,"taxed at 8% ,zero fixed",JOptionPane.INFORMATION_MESSAGE);}
                     else if(checkincome>=6000){
                   double value=checkincome;
                 double percentage=value/100*12;
               double finale=value-percentage, finaleprint=value-finale+600;
            JOptionPane.showMessageDialog(null,finaleprint,"taxed at 12% + K600 FIXED CHARGE",JOptionPane.INFORMATION_MESSAGE);}
                   }catch(Exception e){String
                                        erno=String.format("%s doesnt seem to be a numeric value",income);
                       
                                        JOptionPane.showMessageDialog(null,"you seem to have an error in your input","ERROR",JOptionPane.WARNING_MESSAGE);}
          }
        }
    }
   public static void main(String[] args) {
   question7 m=new question7();
   m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   m.setSize(400,270); 
   m.setLocation(420,280);
   m.setVisible(true);
   
     
        
    }
    
    
    
    
}
  ////////////////////////////////////////////////////////////////CLOSE///////////////////////////////////////////////////////////////////////