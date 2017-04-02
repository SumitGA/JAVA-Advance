/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author sumitg
 */
public class FileDemo {
    public static void main(String args[]) throws IOException
    {
        File f1 = new File("/home/sumitg/Public/java projects/test");
        f1.mkdir(); //to create a folder
        File f2 = new File("/home/sumitg/Public/java projects/test/abc.txt");
       
        f2.createNewFile(); //to create a file
        
        File f3 = new File("/home/sumitg/Public/java projects/test/");
        if(f3.isDirectory()){
           String []fn = f3.list();
            for(String filename : fn){
                if(filename.endsWith(".txt")){
                 System.out.println(filename);  
                }
                
            }
        }
        
        File f4 = new File("/home/sumitg/Public/java projects/test/abc.txt");
        f4.setReadOnly();
        
        //To display Readonly files
        File f5 = new File("/home/sumitg/Public/java projects/test/");
        File []fn = f5.listFiles();
        for(File filename : fn){
            if(filename.canWrite()==false){ 
                System.out.println(filename);
            }
        }
        
        //To display HiddenFiles
        
      
        for(File filename : fn){
            if(filename.isHidden()){
                System.out.println("filename");
            }
        }
       
        
       
    }
    
}
