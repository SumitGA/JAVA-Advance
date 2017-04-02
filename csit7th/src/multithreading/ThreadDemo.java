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
class A extends Thread
{
    public void run()
    {
        for(int i=1; i<=10;i++){
            System.out.println("i="+i);
            
        }
    }
}

class B extends Thread
{
    public void run(){
        for(int j=101;j<=500;j+=2){
             System.out.println("j="+j);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

class C implements Runnable
{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
        }
    }
}

class D implements Runnable
{
    public void run(){
        for(int j=1;j<=10;j++){
            System.out.println("j="+j);
        }
    }
}



public class ThreadDemo {
    
    public static void main(String args[]){
        A obj1=new A();
        B obj2 = new B();
       // obj1.start();
//        obj2.setPriority(10);
//        obj2.start();
        C ob1=new C();
        D ob2=new D();
//        
//        
//        obj1.setPriority(1);
//        obj1.start();
        
       
        Thread t1=new Thread(ob1);
        t1.start();
        Thread t2=new Thread(ob2);
        t2.start();
        System.out.println(t1.isAlive());

        try{
            t1.join();
            t2.join();
            
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
         System.out.println(t1.isAlive());
         System.out.println("Main Thread Exiting");

         
        
        
    }
    
}
