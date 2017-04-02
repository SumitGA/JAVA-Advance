/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodbmslab;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author sumitg
 */
public class EmployeeInheritanceDemo {
    
    public static void main(String args[]){
        System.out.println("Please enter..... 1-->To Inset the record.....2-->To List all the records..."
                + "3--->To Search the record");
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        PartTimeEmployee emp=new PartTimeEmployee();
       
        
        
        switch (sc){
            case 1:
                emp.insertRecord();
                break;
                
            case 2:
                emp.listRecord();
                break;
                
            case 3:
                emp.searchRecord();
                break;
                
            default:
                exit();
                
        }
    }
    
}
