/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodbmslab;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Scanner;

/**
 *
 * @author sumitg
 */
public class PartTimeEmployee extends EmployeeMain {
    private double salary;
    
    
    public PartTimeEmployee(){
        
    }
    public PartTimeEmployee(int id,String name,String address,double salary){
        super(id,name,address);
        this.salary=salary;
    }
    
    public PartTimeEmployee(int id){
        super(id);
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void insertRecord(){
        System.out.println("Enter the Part Time Employee Id");
        Scanner scanner=new Scanner(System.in);
        int peid=scanner.nextInt(); 
        System.out.println("Enter the Part Time Employee Name");
        String pename=scanner.next();
        System.out.println("Enter the Part Time Employee Address");
        String peaddress=scanner.next();
        System.out.println("Enter the Part Time Employee Salary");
        double pesalary=scanner.nextDouble();
        PartTimeEmployee pemp=new PartTimeEmployee(peid,pename,peaddress,pesalary);
        ObjectContainer db=Db4o.openFile("/home/sumitg/NetBeansProjects/OODB/Inheritancedemo.yap");
        db.set(pemp);
        System.out.println("Data Inserted Successfully");
        db.close();
        
    }
    
      public void listRecord(){
        
        PartTimeEmployee pemp=new PartTimeEmployee();
        ObjectContainer db=Db4o.openFile("/home/sumitg/NetBeansProjects/OODB/Inheritancedemo.yap");
        ObjectSet result=null;
        result=db.get(pemp);
        while(result.hasNext()){
            pemp=(PartTimeEmployee)result.next();
            System.out.println("EmpID\t\t"+"Name\t\t"+"Address\t\t"+"Salary");
            System.out.println(pemp.getId()+"\t\t"+pemp.getName()+"\t\t"+pemp.getAddress()+"\t\t"+pemp.getSalary());
                
        }
       
        db.close();
        
    }
      
      public void searchRecord(){
          System.out.println("Enter the ID of Part Time Employee to be searched");
          Scanner scanner=new Scanner(System.in);
          int peid=scanner.nextInt();
          PartTimeEmployee pemp=new PartTimeEmployee(peid);
          ObjectContainer db=Db4o.openFile("/home/sumitg/NetBeansProjects/OODB/Inheritancedemo.yap");
          ObjectSet result=null;
          result=db.get(pemp);
          while(result.hasNext()){
            pemp=(PartTimeEmployee)result.next();
            System.out.println("EmpID\t\t"+"Name\t\t"+"Address\t\t"+"Salary\t\t");
            System.out.println(pemp.getId()+"\t\t"+pemp.getName()+"\t\t"+pemp.getAddress()+"\t\t"+pemp.getSalary());
                
        }
          db.close();
      }
      
}
      
    

