/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sumitg
 */
public class MainThreadDemo {
    public static void main(String args[]){
        Thread t =Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setPriority(10);
        t.setName("MY Thread");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        
    }
    
}
