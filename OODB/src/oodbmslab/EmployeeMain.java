/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodbmslab;

/**
 *
 * @author sumitg
 */
public class EmployeeMain {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

   
    
    public EmployeeMain(){
        
    }
    
    public EmployeeMain(int id){
        this.id=id;
    }
    
    public EmployeeMain(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    
    
    
}
