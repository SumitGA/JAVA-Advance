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

public class MenuBasedApplication implements ActionListener {

    JFrame f1;
    JMenuBar m;
    JMenu m1, m2;
    JMenuItem i1, i2, i3;

    MenuBasedApplication() {
        f1 = new JFrame("Menu Based Application");
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());

        m = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Window");

        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Exit");
        i3 = new JMenuItem("Close");

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);

        m.add(m1);
        m.add(m2);

        m1.add(i1);
        m1.addSeparator();
        m1.add(i2);
        m1.setMnemonic('F');
        m2.add(i3);
        i3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
        i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        m2.setMnemonic('W');
        m.setBackground(Color.BLUE);
        f1.setJMenuBar(m);

        f1.setVisible(true);
    }

    public static void main(String args[]) {
        new MenuBasedApplication();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == i2 || e.getSource() == i3) {
            f1.dispose();

        } else if (e.getSource() == i1) {
            JFrame f3 = new JFrame("This is a new Frame");
            f3.setSize(300, 300);
            f3.setDefaultCloseOperation(f3.EXIT_ON_CLOSE);
            f3.setVisible(true);
        }
        if (e.getSource() == i2) {
            f1.dispose();
        } else if (e.getSource() == i1) {
            JFrame f3 = new JFrame("This is a new Frame");
            f3.setSize(300, 300);
            f3.setDefaultCloseOperation(f3.EXIT_ON_CLOSE);
            f3.setVisible(true);
        }

    }

}
