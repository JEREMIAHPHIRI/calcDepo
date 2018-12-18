/*
Create a swing Applet or use Dialog boxes or any GUI components (well labeled) to
write a program that 



calculate temperature from degree Celsius to Fahrenheit, by using
the formula Fahrenheit = ((9.0/5.0)* Celsius + 32.0) prompting the user to enter the
temperature in degrees Celsius.
 */  ////////////////////////////////////////////////////////////IMPORTATIONS///////////////////////////////////////////////////////////////////
package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author j3r3miah
 */
public class question6 extends JFrame{
    
    JTextField cels=new JTextField(12);
    JTextArea faren=new JTextArea();
    JButton convert=new JButton();
    
    public  question6 (){
     
     JPanel labels=new JPanel();
     labels.setLayout(new GridLayout(2,1));
     labels.setBackground(Color.WHITE);
     JPanel field=new JPanel();
       field.setLayout(new GridLayout(2,1,25,25));
       field.setBackground(Color.WHITE);
     JPanel container1=new JPanel();
     JPanel container2=new JPanel();
          JPanel allcontainer=new JPanel();
    
     
       JLabel clabel=new JLabel("enter Dgress here");
       clabel.setFont(new Font("serif",Font.BOLD,25));
       labels.add(clabel);
       JLabel flabel=new JLabel("Farenheight here");
       flabel.setFont(new Font("serif",Font.BOLD,25));
       labels.add(flabel);
     
       
       field.add(cels);
        field.add(faren);
      container1.add(labels,BorderLayout.WEST);
      container2.add(field,BorderLayout.EAST);
      allcontainer.setBackground(Color.WHITE);
       allcontainer.add(container1,BorderLayout.EAST);
       allcontainer.add(container2,BorderLayout.WEST);
      convert=new JButton("convert");
      allcontainer.add(convert);
     
      add(allcontainer,BorderLayout.CENTER);
    
      
      Handler handle=new Handler();
     cels.addActionListener(handle);
     convert.addActionListener(handle);
     //faren.addActionListener(handle);
    }  
     public class Handler implements ActionListener{
        @Override
        public void  actionPerformed(ActionEvent ae){
            if(ae.getSource()==convert){
            try{
          
              String cstring=cels.getText();
                 
                 double cnum=Double.parseDouble(cstring);
                 double adder=cnum*2;
                  double  conveter1=9.0/5.0;
                     double convert2=conveter1*cnum+32.0;
                     // JOptionPane.showMessageDialog(null,convert2);
                      String screen=String.valueOf(convert2);
                      faren.setText(screen);
                   
                   
              
          
        }catch(Exception e){
             String errorstring=String.format("you entered %s \n and it dowsnt look like a number",cels);
              String printable=cels.getText();
            JOptionPane.showMessageDialog(null,printable,"ERROR",JOptionPane.WARNING_MESSAGE); }
        }
        }
     }
    public static void main(String args[]){
     question6 frame=new question6();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setTitle("celsius converter time");
     frame.setSize(450,450); 
     frame.setLocation(420,280);
     frame.setBackground(Color.white);
     frame.setVisible(true);
    }

}


