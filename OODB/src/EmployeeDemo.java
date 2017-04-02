
import com.db4o.ObjectContainer;

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
import com.db4o.config.Configuration;
import com.db4o.ext.ExtObjectContainer;
import com.db4o.query.Predicate;
import com.db4o.query.Query;
import com.db4o.query.QueryComparator;
import java.util.Comparator;
import java.util.Iterator;
class Employee{
    private int id;
    private String name;
    private String address;
    private String post;
    private double salary;

  public  Employee(int id,String name,String address,String post,double salary){
        this.id=id;
        this.name=name;
        this.address=address;
        this.post=post;
        this.salary=salary;
    }
  
  public void getEmployee(){
     System.out.println(name);
     System.out.println(address);
     System.out.println(post);
     System.out.println(salary);
     
      
  }
  
  public Employee(){
      
  }
    
}

public class EmployeeDemo {
    public static void main(String args[]){
        
       
        String dbname ="/home/sumitg/demo.yap";
        ObjectContainer db = Db4o.openFile(dbname);
        ObjectSet result=null;
        Employee e1=new Employee(1,"sumit Gautam","Bhaktapur","CEO",1000000);
        db.set(e1);
        result=db.get(e1);
        
           while (result.hasNext()){
            Employee e = (Employee) result.next();
            e.getEmployee();
         
            
        }
        
        // Close database
        db.close();
        
    
          
}

   
      
        
        
        
       


    }
    

