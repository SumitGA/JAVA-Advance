/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sumitg
 */
import com.db4o.*;
public class StudentDemo {
    public static void main(String args[]){
        Student s=new Student(1,"Sumit Gautam","Bhaktapur");
        Student s2=new Student(2,"Ram Prashad","Kathmandu");
        String filename="/home/sumitg/NetBeansProjects/OODB/database.yap";
        ObjectContainer ob=Db4o.openFile(filename);
        
        //ob.set(s);
        ob.set(s2);
        if((ob !=null)) {
            System.out.println("The record inserted succesfully");
        
        } else {
            System.out.println("The record could not be completed");
        }
        ob.close();
    }
}
