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
public class BorderDemo {
    JFrame f1;
    JButton b1,b2,b3,b4,b5;
    
    BorderDemo(){
   
        f1 = new JFrame("Using Border layout");
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);

        f1.setLayout(new BorderLayout(5,5));

        //or FlowLayout l=new FlowLayout();
        //f1.setLayout(l);
        b1 = new JButton("North");
        b2 = new JButton("south");
        b3 = new JButton("west");
        b4 = new JButton("center");
        b5 = new JButton("east");

        f1.add(b1,BorderLayout.NORTH);
        f1.add(b2,BorderLayout.SOUTH);
        f1.add(b3,BorderLayout.WEST);
        f1.add(b4,BorderLayout.CENTER);
        f1.add(b5,BorderLayout.EAST);
        f1.setVisible(true);
    }

    public static void main(String args[]){
        new BorderDemo();
    }
    

    
}
