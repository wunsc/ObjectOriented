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
public class Driver {
    public static void main(String[] args) {
        int hari = 21;
        Karyawan karyawan = new Karyawan();
        karyawan.setId("12");
        karyawan.setNama("Tes");
        karyawan.setAlamat("Jalan");
        hari = karyawan.mengajukanCuti(hari);
        //karyawan.mengajukanKerja();
        double s = Math.min(5.4, 3.2);
        double a = Math.pow(2, 9);
        double w = Math.floor(Math.random()*60)+40;
        System.out.println(w);
        System.out.println(hari);
        karyawan.mengajukanCuti(karyawan);
        System.out.println(karyawan.getId());
        Karyawan k1 = new Karyawan();
        k1.setNama("nini");
        Karyawan k2 = k1;
        k2.setNama("nana");
        System.out.println(k2.getNama());
        System.out.println(k1.getNama());
        k1.jumlah = 50;
        Karyawan k3 = new Karyawan();
        System.out.println(k3.jumlah);
        karyawan.jumlah = 100;
        System.out.println(k1.jumlah);
        System.out.println(Karyawan.jumlah);
        System.out.println(k2.jumlah);
    }
}
