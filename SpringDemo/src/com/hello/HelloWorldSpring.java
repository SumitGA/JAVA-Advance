/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sumitg
 */
public class HelloWorldSpring {
    
    public static void main(String args[]){
        ApplicationContext ctx =                                                                                
            new ClassPathXmlApplicationContext("spring-config.xml");                    

        Hello helloBean = (Hello) ctx.getBean("helloBean");
        
        helloBean.sayHello("Angry Bird");
    }
    
}
