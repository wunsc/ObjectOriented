/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//exception yg harus di catch disebut check
//exception yg tanpa harus di catch disebut uncheck

package miijavaxiv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MuhammadTaufik
 */
public class HandlingException {
    static void bacaFile(String namaFile) throws FileNotFoundException, IOException{
        FileReader reader = new FileReader(namaFile);
        int i;
        while((i = reader.read()) > 0){
            System.out.println((char)i);
        }
    }
    public static void main(String[] args) {
        try {
            int c = -1;
            assert c > 0;
            if(c == 0) throw new CustomException("c tidak boleh 0");
            int y = 10 / c;
            bacaFile(args[0]);
        } catch (IOException ex) {
            //Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (CustomException ex) {
            //Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (AssertionError er){
            System.out.println(er.getMessage());
        }
    }
}
