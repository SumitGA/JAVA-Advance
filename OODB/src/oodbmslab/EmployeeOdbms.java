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
import com.db4o.*;
import com.db4o.ObjectContainer;
import java.util.Scanner;
import static javafx.application.Platform.exit;
public class EmployeeOdbms {
   
    public static void main(String args[]) throws Exception{
        
        System.out.println("Please enter..... 1-->To Inset the record.....2-->To List all the records..."
                + "3--->To Search the record");
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        Employee e=new Employee();
       
        
        
        switch (sc){
            case 1:
                e.insertRecord();
                break;
                
            case 2:
                e.listRecords();
                break;
                
            case 3:
                e.searchRecords();
                break;
                
            default:
                exit();
                
        }
        
        
        
        
    }
    

    
}
