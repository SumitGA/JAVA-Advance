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

public class MouseEventDemo implements MouseListener {

    JFrame f1;
    JLabel l1;
    JPanel p;

    MouseEventDemo() {
        f1 = new JFrame("Mouse Event Handling Demo");
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f1.setLayout(new BorderLayout());

        p = new JPanel();

        f1.add(p, BorderLayout.CENTER);
        p.addMouseListener(this);
        l1 = new JLabel("Status");
        f1.add(l1, BorderLayout.SOUTH);

        f1.setVisible(true);

    }

    public static void main(String args[]) {
        new MouseEventDemo();

    }

    public void mouseEntered(MouseEvent e) {
        p.setBackground(Color.red);
    }

    public void mouseExited(MouseEvent e) {
        p.setBackground(Color.WHITE);
    }

    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed at (" + e.getX() + "," + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
    }

}
