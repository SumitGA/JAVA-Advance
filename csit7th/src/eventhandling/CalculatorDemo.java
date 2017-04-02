/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;

/**
 *
 * @author sumitg
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorDemo implements ActionListener {
    JFrame f1;
    JTextField t1,t2,t3;
    JButton b1,b2;
    JLabel l1,l2,l3;
    
    CalculatorDemo(){
        f1 = new JFrame("Calculator");
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1.setLayout(new GridLayout(4,2,2,2));
        
        l1=new JLabel("Num 1");
        f1.add(l1);
        
        t1=new JTextField();
        f1.add(t1);
        
        l2=new JLabel("Num 2");
        f1.add(l2);
        
        t2=new JTextField();
        f1.add(t2);
        
        l3=new JLabel("Result");
        f1.add(l3);
        
        t3=new JTextField();
        f1.add(t3);
        
        b1=new JButton("Add");
        
        b2 = new JButton("Subtract");
        f1.add(b1);f1.add(b2);
        
        b1.addActionListener(this); //notifying the action listener
        b2.addActionListener(this);
        
        f1.setVisible(true);
        
        
    }
    
    public static void main(String args[]){
        new CalculatorDemo();
        
    }
    
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=0;
        if(e.getSource()==b1){            
             c=a+b;            
        }
        
        if(e.getSource()==b2){           
             c = a-b;        
            
        }
        
       t3.setText(c+"");
        
    }
    
}
