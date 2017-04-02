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
public class Employee {
    
    private int id;
    private String name;
    private double salary;
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public Employee(){
        
    }
    public Employee(int id){
        this.id=id;
    }
    
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public void insertRecord()throws Exception{
       
        System.out.println("Enter the Employee ID");
        Scanner scanner=new Scanner(System.in);
        int eid=scanner.nextInt();
        System.out.println("Enter the Employee Name");
        String ename=scanner.next();
        System.out.println("Enter the Employee Salary");
        double esalary=scanner.nextDouble();
        ObjectContainer db=Db4o.openFile("/home/sumitg/NetBeansProjects/OODB/Employee.yap");
        Employee emp =new Employee(eid,ename,esalary);
        db.set(emp);
        System.out.println("Data Inserted Successfully");
        db.close();
        
    }
    
     public void listRecords()throws Exception{
        ObjectContainer db=Db4o.openFile("/home/sumitg/NetBeansProjects/OODB/Employee.yap");
        ObjectSet result=null;
        Employee emp =new Employee();
        result=db.get(emp);
        while(result.hasNext()){
            emp=(Employee)result.next();
            System.out.println("ID\t\t"+"Name\t\t"+"Salary");
            System.out.println(emp.getId()+"\t\t"+emp.getName()+"\t\t"+emp.getSalary());
        }
        db.close();
       
        
    }
     
     public void searchRecords() throws Exception{
         System.out.println("Enter the ID of the Employee to be searched");
         Scanner scanner =new Scanner(System.in);
         int eid=scanner.nextInt();
         Employee emp=new Employee(eid);
         ObjectContainer db=Db4o.openFile("/home/sumitg/NetBeansProjects/OODB/Employee.yap");
         ObjectSet result =null;
         result=db.get(emp);
         while(result.hasNext()){
             emp=(Employee)result.next();
             System.out.println("ID\t\t"+"Name\t\t"+"Salary");
             System.out.println(emp.getId()+"\t\t"+emp.getName()+"\t\t"+emp.getSalary());
             
         }
         db.close();
     }
}