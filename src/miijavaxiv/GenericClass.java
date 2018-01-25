/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

/**
 *
 * @author MuhammadTaufik
 */
public class GenericClass<T> {
    
    public void add(T t){
        
    }
    
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass<>();
        gc.add("ww");
    }
}
