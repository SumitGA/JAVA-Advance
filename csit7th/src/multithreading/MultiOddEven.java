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
class Resource
{
    int n;
    boolean valueSet = false;
    
    synchronized void getEven(int n)
    {
        while(!valueSet){
            try{wait();}
            catch(InterruptedException e)
            { System.out.println(e);}
            
           
        }
        this.n=n;
        System.out.println("Even:"+n);
        valueSet=false;                              
        notify(); //can only be called in synchronized context
    }
    
    synchronized void getOdd(int n)
    {
        while(valueSet){
            try{wait();}
            catch(InterruptedException e)
            { System.out.println(e);}
        }
        this.n =n;
        System.out.println("Odd:"+n);
        valueSet = true;
        notify();
    }
    
} 

class Produce extends Thread
{
    Resource r;
    Produce(Resource r){
        this.r = r;
    }
    
    public void run(){
        try{
            for(int i=1;i<=10;i+=2){
                r.getOdd(i);
                Thread.sleep(1000);
            }
                   
        }catch(InterruptedException e){
            
        }
       }
    }

class Consum extends Thread
{
    Resource r;
    Consum(Resource r){
        this.r=r;
    }
    
    public void run(){
        try{
            for(int i=2;i<=10;i+=2){
                r.getEven(i);
                Thread.sleep(1000);
            }
        
            
        }catch(InterruptedException e){
            
            
        }
      }
    }




public class MultiOddEven {
     public static void main(String args[]){
        Resource r=new Resource();
        new Produce(r).start();
        new Consum(r).start();
    }
    
}
