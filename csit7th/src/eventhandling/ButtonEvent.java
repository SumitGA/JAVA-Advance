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
public class ButtonEvent implements ActionListener {
    JFrame f1;
    JButton b1,b2;
    JTextField t1;
    
    ButtonEvent(){
        f1= new JFrame("Event Handling Button Click Demo");
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        
        t1=new JTextField(10);
        b1= new JButton("ok");
        
        b2=new JButton("Clear");
        
        f1.add(t1);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);
        b1.addActionListener(this);//notifies the ActionListener
        b2.addActionListener(this);
        
        
        
              
        
    }
   
    
    public static void main(String args[]){
        new ButtonEvent();
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
        t1.setText("Hello");
        
               
    }
        else if(e.getSource()==b2){
            t1.setText("");
        }

    }
}
