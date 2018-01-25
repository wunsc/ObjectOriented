
package miijavaxiv;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MuhammadTaufik
 */
public class Percabangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Bulan ");
            BULAN bulan = BULAN.valueOf(sc.next());
            //int bulan=sc.nextInt();
            System.out.print("Tahun ");
            int tahun=sc.nextInt();
            int jumlah_hari=0;
            switch (bulan) {
                case JANUARI: case MARET: case MEI: case JULI: case AGUSTUS: case OKTOBER: case DESEMBER:
                    jumlah_hari = 31;
                    break;
                case APRIL: case JUNI: case SEPTEMBER: case NOVEMBER:
                    jumlah_hari = 30;
                    break;
                case FEBRUARI:
                    jumlah_hari = tahun % 4 == 0 ? 29 : 28;
                    break;
                default:
                    System.out.println("Bulan tidak ada");
                    break;
            }
            System.out.println("Jumlah Hari "+jumlah_hari);
        }
    }
}

//pass by value
enum BULAN{
    JANUARI, FEBRUARI, MARET, APRIL, MEI, JUNI, JULI, AGUSTUS, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER
}