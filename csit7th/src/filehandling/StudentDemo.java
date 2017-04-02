/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

/**
 *
 * @author sumitg
 */
    class Student {
    private int id;
    private String name;
    private String faculty;
    
    //Setters nam
    public void setId(int id)
    {
        this.id =id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    
    
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }
    
    
    
}


public class StudentDemo
{
    public static void main(String args[]){
        Student []ob = new Student[3];
        ob[0] = new Student();
        ob[1] = new Student();
        ob[2] = new Student();
     

        ob[0].setId(1);
        ob[0].setName("Sumit Gautam");
        ob[0].setFaculty("BSc CSIT");
        ob[0].getId();
        ob[0].getName();
        ob[0].getFaculty();
      }
        
    }
