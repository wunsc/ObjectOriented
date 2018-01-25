
package miijavaxiv;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MuhammadTaufik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1_000_000;
        long l = i;
        //int j = l;
        //short k = i;
        double d1 = 5.6;
        double d2 = 5.8;
        float f1 = (float) d1;
        float f2 = (float) d2;
        char c1 = 97;
        String s1 = "lump";
        int[] arrInt[] = {
            {1,2},
            {4,5,6}
        };
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println("print tes");
        System.out.println(i);
        //System.out.println(l);
        //System.out.println(j);
        System.out.println(d1+d2);
        System.out.println(f1+f2);
        System.out.println(c1);
        for (char a = 65; a <= 128; a++){
            System.out.print(a);
        }
        System.out.println();
        for (int w = 0; w < 10; w++){
            if(w%5 == 4) break;
            System.out.println(w);
        }
        System.out.println();
        System.out.println(arrInt.length);
        System.out.println();
        for (int[] q : arrInt) {
            for (int r : q) {
                System.out.println(r);
            }
        }
        
        System.out.println("array 1D");
        int []f = new int[5];
        for(int s=0; s < f.length; s++){
            f[s] = s+1;
        }
        System.out.print(Arrays.toString(f));
        
        System.out.println("");
        System.out.println("");
        System.out.println("array 2D");
//        int [][]z = new int[5][];
//        int k = 1;
//        for(int o = 0; o < 5; o++){
//            z[o] = new int[5];
//            for(int p = 0; p < 5; p++){
//                z[o][p] = k;
//                k = k+1;
//            }
//            System.out.println(Arrays.toString(z[o]));
//        }
        
        int [][]b = new int[5][];
        for(int o = 0; o < 5; o++){
            b[o] = new int[5];
            for(int p = 0; p < 5; p++){
                b[o][p] = (o*5)+(p+1);
            }
            System.out.println(Arrays.toString(b[o]));
        }
        System.out.println("Pake If");
        int [][]h = new int[5][];
        for(int t = 0; t < 5; t++){
            h[t] = new int[5];
            for(int y = 0; y < 5; y++){
               if(t%2 == 0){
                    if(y%2 == 0){
                        h[t][y] = 0;
                    }
                    else {
                        h[t][y] = 1;
                    }   
               }
               else{
                   if(y%2 == 0){
                        h[t][y] = 1;
                    }
                    else {
                        h[t][y] = 0;
                    }   
               }
            }
            System.out.println(Arrays.toString(h[t]));
        }
        
        System.out.println("Ga Pake If");
        int [][]g = new int[5][];
        for(int t = 0; t < 5; t++){
            g[t] = new int[5];
            for(int y = 0; y < 5; y++){
                g[t][y] = (t+y)%2;
            }
            System.out.println(Arrays.toString(g[t]));
        }
        
        
//        char a = 65;
//        while(a <= 128){
//            System.out.print(a);
//            a++;
//        }
//        System.out.println();
//        char b = 65;
//        do{
//            System.out.print(b);
//            b++;
//        }while(b<=128);
//        for( ; ; ){
//            System.out.println("");
//        }
//        System.out.println("");

    }
    
}
