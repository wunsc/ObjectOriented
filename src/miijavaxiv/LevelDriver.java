/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.function.Consumer;

/**
 *
 * @author MuhammadTaufik
 */
public class LevelDriver {
    static void methodZ(int y, Level1 l){
        
    }
    
    static void methodZ(InterfaceX x){
        
    }
    
    public static void main(String[] args) {
        methodZ(new Level3());
        
        //anonymous class berlaku untuk interface maupun abstract class yang langsung menggunakan method nya tanpa membuat class baru yang implement/extends
        methodZ(new InterfaceX() {
            @Override
            public void methodA() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int methodC(int y) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Level1 level11 = new Level3();
        //level11.method1(0);
        
        System.out.println(level11.getClass());
        System.out.println(level11 instanceof Level1);
        System.out.println(level11 instanceof Level2);
        
        System.out.println("");
        Dictionary<Integer, String> d1 = new Hashtable();
        d1.put(1, "Dictionary");
        d1.put(2, "Yrd");
        d1.put(3,"awgawga");
        System.out.println(d1.get(1));
        System.out.println(d1.size());
        
        
        //class interface bisa create object jika class yang digunakan sudah pernah di implement
        InterfaceX ix = new Level3();   
        List<String> ls = new ArrayList();
        ls.add("test");
        ls.add("aaa");
        ls.add("coba");
        //ls.forEach((c) -> System.out.println(c));
        ls.forEach(new Consumer() {
            @Override
            public void accept(Object a) {
                System.out.println(a);
            }
        });
        
        
        Map<String, String> mp = new Hashtable();
        mp.put("indonesia", "jakarta");
        mp.put("singapore", "singapore");
        mp.put("brunei", "bandar sri begawan");
        System.out.println(mp.values());
        System.out.println(mp.get("indonesia"));
        
        //lambda expression
        mp.forEach((k,v)->System.out.println(k + " == " + v));
    }
}
