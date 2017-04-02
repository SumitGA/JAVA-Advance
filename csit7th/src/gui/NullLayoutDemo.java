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
import javax.swing.*;
import java.awt.*;

public class NullLayoutDemo {

    JFrame f1;
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2;
    JComboBox c1;
    JRadioButton rb1, rb2;
    JCheckBox cb1, cb2, cb3, cb4;

    NullLayoutDemo() {
        f1 = new JFrame("Null Layout Demo");
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);

        l1 = new JLabel("Name");
        l1.setBounds(10, 10, 80, 25);

        t1 = new JTextField();
        t1.setBounds(100, 10, 150, 25);

        l2 = new JLabel("Age");
        l2.setBounds(10, 45, 80, 25);

        t2 = new JTextField();
        t2.setBounds(100, 45, 100, 25);

        l3 = new JLabel("Faculty");
        l3.setBounds(10, 80, 80, 25);

        String fac[] = {"BIM", "BSW", "CSIT"};
        c1 = new JComboBox(fac);
        c1.setBounds(100, 80, 150, 25);
        
        l4=new JLabel("Gender");
        l4.setBounds(10,120,80,25);
        
        rb1=new JRadioButton("Male");
        rb1.setBounds(100,120,90,25);
        
        rb2=new JRadioButton("Female");
        rb2.setBounds(200,120,90,25);
        
        
        l5=new JLabel("Hobbies");
        l5.setBounds(10,150,80,25);
        
        cb1=new JCheckBox("Music");
        cb1.setBounds(100,150,100,20);
        
        cb2=new JCheckBox("Dance");
        cb2.setBounds(200,150,100,20);
        
        cb3=new JCheckBox("Travelling");
        cb3.setBounds(100,180,100,20);
        
        cb4=new JCheckBox("Reading");
        cb4.setBounds(200,180,100,20);
        
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);       
        

        b1 = new JButton("Ok");
        b1.setBounds(50, 220, 60, 50);

        b2 = new JButton("Cancel");
        b2.setBounds(150, 220, 80, 50);

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(c1);
        f1.add(l4);
        f1.add(rb1);
        f1.add(rb2);
        f1.add(l5);
        f1.add(cb1);f1.add(cb2);f1.add(cb2);f1.add(cb3);f1.add(cb4);
        f1.add(b1);
        f1.add(b2);

        f1.setVisible(true);

    }

    public static void main(String args[]) {
        new NullLayoutDemo();

    }

}
