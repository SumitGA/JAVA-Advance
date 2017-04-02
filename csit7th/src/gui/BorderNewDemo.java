/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author sumitg
 */
import java.awt.*;
import javax.swing.*;
public class BorderNewDemo {
    JFrame f1;
    JPanel p1;
    JButton b1,b2,b3,b4;
    
    BorderNewDemo(){
        f1 = new JFrame("Using Border layout");
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);
        
        f1.setLayout(new BorderLayout());
        b1 = new JButton("one");
        b2 = new JButton("two");
        b3 = new JButton("three");
        b4 = new JButton("four");
        p1 = new JPanel();
        p1.add(b1); p1.add(b2);p1.add(b3);//panel default layout is flow layout 
     
        
        f1.add(p1,BorderLayout.SOUTH);
        f1.add(b4,BorderLayout.CENTER);
        
        
        f1.setVisible(true);
        
        
        
    }
    
    public static void main(String args[]){
        new BorderNewDemo();
        
    }
}
