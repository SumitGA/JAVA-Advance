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
public class ItemEventDemo implements ItemListener {
    JFrame f1;
    JTextField t1;
    JComboBox c1;
    
    ItemEventDemo(){
        f1=new JFrame("Item Event Demo");
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        
        t1 = new JTextField(10);
        f1.add(t1);
        
        String fac[]={"Select Course","BSW","B.Sc. CSIT","BIM"};
        c1 = new JComboBox(fac);
        c1.addItemListener(this);
        f1.add(c1);
        
        f1.setVisible(true);
    }
    public static void main(String args[]){
        new ItemEventDemo();
        
    }
  
    public void itemStateChanged(ItemEvent e) {
        String item = c1.getSelectedItem().toString();
        if(!item.equalsIgnoreCase("select course"))
        t1.setText(item);
    }
    
}
