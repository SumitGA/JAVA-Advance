/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello;

/**
 *
 * @author sumitg
 */
public class HelloImpl implements Hello {
    @Override
    public void sayHello(String name){
        System.out.println("Hello World"+ name);
    }
    
}
