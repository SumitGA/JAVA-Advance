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
public class FousEventDemo implements FocusListener {
    JFrame f1;
    JTextField t1;
    JTextField t2;
    
    
    FousEventDemo(){
        f1 = new JFrame("Focus Event Demo");
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        
        f1.add(t1);f1.add(t2);
        
        f1.setVisible(true);
    }
    
    public static void main(String[] args){
        new FousEventDemo();
        
    }
    
    public void focusGained(FocusEvent e){
        if(e.getSource() == t1){
            t1.setBackground(Color.GRAY);
        }else if(e.getSource() == t2){
            t2.setBackground(Color.GRAY);
        }
        
      
        
    }
    
    public void focusLost(FocusEvent e){
          if(e.getSource() == t1){
            t1.setBackground(Color.YELLOW);
        }else if(e.getSource() == t2){
            t2.setBackground(Color.YELLOW);
        }
    }
    
}
