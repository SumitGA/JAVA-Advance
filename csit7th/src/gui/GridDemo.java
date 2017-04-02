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
public class GridDemo {
    JFrame f1;
    JButton b1,b2;
    JLabel l1,l2;
    JTextField t1,t2;
    
    GridDemo(){
        f1=new JFrame("Using Grid Layout");
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f1.setResizable(false);
        f1.setLayout(new GridLayout(3,2,5,5));
        
        l1=new JLabel("Name");
        l2=new JLabel("Address");
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("ok");
        b2=new JButton("cancel");
        
        f1.add(l1);f1.add(t1);
        f1.add(l2);f1.add(t2);
        f1.add(b1);f1.add(b2);
        f1.setVisible(true);
        
        
    }
    
    public static void main(String args[]){
        new GridDemo();
    }
    
        
    
}
