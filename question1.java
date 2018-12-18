package main;
/*
  Create a swing Applet or use Dialog boxes or any GUI components (well labeled) to
write a program as a Simple Scientific Calculator.
package main;

/**
 * @author j3r3miah
 */
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
 
class question1 extends JFrame {
    private final Font BIGGER_FONT = new Font("serif",Font.PLAIN, 20);
    private JTextField textfield;
    private boolean number = true;
    private String equalOp = "=";
    private CalculatorOp op = new CalculatorOp();
    
    public question1() {
        textfield = new JTextField("",15);
        textfield.setHorizontalAlignment(JTextField.RIGHT);
        textfield.setFont(BIGGER_FONT);
        ActionListener numberListener = new NumberListener();
        String buttonOrder = "1234567890 ";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 4, 4));
        for (int i = 0; i < buttonOrder.length(); i++) {
            String key = buttonOrder.substring(i, i+1);
            if (key.equals(" ")) {
                buttonPanel.add(new JLabel(""));
            } else {
                JButton button = new JButton(key);
                button.addActionListener(numberListener);
                button.setFont(BIGGER_FONT);
                button.setBackground(Color.LIGHT_GRAY);
                buttonPanel.add(button);
            }
        }
        ActionListener operatorListener = new OperatorListener();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 4, 4));
        String[] opOrder = {"+", "-", "*", "/","Clear","sin","cos","log","<html>pow<sup>2</sup></html>","<html>pow<sup>3</sup></html>","="};
        for (int i = 0; i < opOrder.length; i++) {
            JButton button = new JButton(opOrder[i]);
            button.addActionListener(operatorListener);
            button.setFont(BIGGER_FONT);
            button.setBackground(Color.GRAY);
            panel.add(button);
        }
        JPanel pan = new JPanel();
        pan.setLayout(new BorderLayout(4, 4));
        pan.add(textfield, BorderLayout.NORTH );
        pan.add(buttonPanel , BorderLayout.CENTER);
        pan.add(panel , BorderLayout.EAST);
        this.setContentPane(pan);
        this.pack();
        this.setTitle("Calculator");
       
    }
    private void action() {
        number = true;
        textfield.setText("");
        equalOp = "=";
        op.setTotal("");
    }
    class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String displayText = textfield.getText();
            if (ae.getActionCommand().equals("sin"))
            {
                textfield.setText("" + Math.sin(Double.valueOf(displayText).doubleValue()));
                
            }else
            if (ae.getActionCommand().equals("cos"))
            {
                textfield.setText("" + Math.cos(Double.valueOf(displayText).doubleValue()));
                
            }
            else
            if (ae.getActionCommand().equals("log"))
            {
                textfield.setText("" + Math.log(Double.valueOf(displayText).doubleValue()));
                
            }
            
            else
            if (ae.getActionCommand().equals("<html>pow<sup>2</sup></html>"))
            {
                textfield.setText("" + Math.pow(Double.valueOf(displayText).doubleValue(),2));
                
            }
            
            else
            if (ae.getActionCommand().equals("<html>pow<sup>3</sup></html>"))
            {
                textfield.setText("" + Math.pow(Double.valueOf(displayText).doubleValue(),3));
                
            }
            
            
            
            
            
            else if (ae.getActionCommand().equals("Clear"))
            {
                textfield.setText("");
            }
 
            else
            {
                if (number)
                {
                    
                    action();
                    textfield.setText("");
                    
                }
                else
                {
                    number = true;
                    if (equalOp.equals("="))
                    {
                        op.setTotal(displayText);
                    }else
                    if (equalOp.equals("+"))
                    {
                        op.add(displayText);
                    }
                    else if (equalOp.equals("-"))
                    {
                        op.subtract(displayText);
                    }
                    else if (equalOp.equals("*"))
                    {
                        op.multiply(displayText);
                    }
                    else if (equalOp.equals("/"))
                    {
                        op.divide(displayText);
                    }
                    
                    textfield.setText("" + op.getTotalString());
                    equalOp = ae.getActionCommand();
                }
            }
        }
    }
    class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String digit = event.getActionCommand();
            if (number) {
                textfield.setText(digit);
                number = false;
            } else {
                textfield.setText(textfield.getText() + digit);
            }
        }
    }
    public class CalculatorOp {
        private int total;
        public CalculatorOp() {
            total = 0;
        }
        public String getTotalString() {
            return ""+total;
        }
        public void setTotal(String n) {
            total = convertToNumber(n);
        }
        public void add(String n) {
            total += convertToNumber(n);
        }
        public void subtract(String n) {
            total -= convertToNumber(n);
        }
        public void multiply(String n) {
            total *= convertToNumber(n);
        }
        public void divide(String n) {
            total /= convertToNumber(n);
        }
        private int convertToNumber(String n) {
            return Integer.parseInt(n);
        }
    }
}
class question1frame {
    public static void main(String[] args) {
        JFrame frame = new question1();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}