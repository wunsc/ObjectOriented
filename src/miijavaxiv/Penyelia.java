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
public class Penyelia extends Karyawan {

    public Penyelia() {
        System.out.println("penyelia");
    }
    
    public Penyelia(String id, String nama, String alamat){
        super(id, nama, alamat);
        System.out.println("ctor penyelia2");
    }
    
    public int methodC(){
        return 0;
    }

    @Override
    public String getAlamat() {
        return "Jakarta"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nama: ");
        builder.append(nama);
        builder.append(", Alamat ");
        builder.append(alamat);
        return builder.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        Karyawan k = new Karyawan("10", "nov", "ban");
        Penyelia penyelia = new Penyelia();
        penyelia.setAlamat("Bandung");
        penyelia.setNama("Tes");
        System.out.println(penyelia.getAlamat());
        
        System.out.println(penyelia);
        
        Penyelia penyelia1 = penyelia;
        penyelia1.setAlamat("Jogjakarta");
        System.out.println(penyelia.hashCode());
        System.out.println(penyelia1.hashCode());
        
        System.out.println(k.getNama());
        
        Penyelia p2 = new Penyelia("mm", "asda", "awfwq");
        
    }
}
