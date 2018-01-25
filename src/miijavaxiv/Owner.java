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
public class Owner extends Penyelia{

    public Owner() {
        
    }
    
    public Owner(String id, String nama, String alamat){
        super(id, nama, alamat);
        System.out.println("ctor owner");
    }
    
    public static void main(String[] args) {
        Owner ow = new Owner("ma", "fqw", "fqwf");
    }
}
