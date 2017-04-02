/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author sumitg
 */
public class KeyEventDemo extends KeyAdapter {
    JFrame f1;
    JTextField t1;
    JTextField t2;
    
    
    KeyEventDemo(){
        f1 = new JFrame("Focus Event Demo");
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        
         t1.addKeyListener(this);
         t2.addKeyListener(this);
        f1.add(t1);f1.add(t2);
        
        f1.setVisible(true);
    }
    
    public static void main(String args[]){
        new KeyEventDemo();
    }
    
    public void keyTyped(KeyEvent e){
        char ch = e.getKeyChar();
     if(e.getSource() == t1){
         if(ch >= '0' && ch <='9'){
             e.consume();
         }
     }else if(e.getSource() == t2){
          if(!(ch >='0' && ch <='9')){
              e.consume();
          }
         }
     
    }
}
