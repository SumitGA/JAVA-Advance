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
public class StudentRecords {
    public static void main(String args[]){
     Student s1=new Student();
     ObjectContainer db=Db4o.openFile("/home/sumitg/NetBeansProjects/OODB/database.yap");
     ObjectSet result=null;
     result = db.get(s1);
     
     while(result.hasNext()){
         s1=(Student)result.next();
         System.out.println(s1.getId());
         System.out.println(s1.getName());
         System.out.println(s1.getAddress());
     }
     db.close();
    }
}
