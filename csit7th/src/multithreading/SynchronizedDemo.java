/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author sumitg
 */
class BankAccount {

    double amount;
    
    //Implementation of the SYNCHRONIZATION in JAVA
    public void deposit(double amt) {
        amount += amt;
        System.out.println("New Amount:" + amount);
    }
}

class BA extends Thread {

    BankAccount ob;

    BA(BankAccount b) {
        ob = b;

    }

    public void run() {
       synchronized (ob){
        ob.deposit(5000);
        }
    }

}

class BK extends Thread {

    BankAccount ob;

    BK(BankAccount b) {
        ob = b;

    }

    public void run() {
        synchronized (ob){
        ob.deposit(1000);
        }
    }

}

public class SynchronizedDemo {

    public static void main(String args[]) {
        BankAccount ba = new BankAccount();
        BA ob1 = new BA(ba);
        BK ob2 = new BK(ba);
        ob1.start();
        ob2.start();
    }

}
