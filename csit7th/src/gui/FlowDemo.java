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

public class FlowDemo {

    JFrame f1;
    JButton b1, b2, b3, b4, b5;

    FlowDemo() {
        f1 = new JFrame("Using Flow layout");
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);

        f1.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));

        //or FlowLayout l=new FlowLayout();
        //f1.setLayout(l);
        b1 = new JButton("one");
        b2 = new JButton("two");
        b3 = new JButton("three");
        b4 = new JButton("four");
        b5 = new JButton("five");

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.setVisible(true);

    }

    public static void main(String args[]) {
        new FlowDemo();

    }

}