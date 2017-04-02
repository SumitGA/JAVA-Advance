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

public class FrameDemo {
    JFrame f1;
    FrameDemo(){
        f1=new JFrame("Title");
        f1.setSize(400,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//HIDE_ON_CLOSE/DISPOSE_ON_CLOSE/DO_NOTHING_ON_CLOSE
        f1.setVisible(true);
    }
    
    public static void main(String args[]){
        new FrameDemo();
        
    }
    
}
