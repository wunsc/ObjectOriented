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
public class Karyawan {
    private String id;
    protected String nama;
    public String alamat;
    static int jumlah;

    public Karyawan() {
        System.out.println("karyawan");
    }
    
    public Karyawan(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("karyawan2");
    }
    
    /**
     * method untuk mengajukan cuti
     * @param hari jumlah hari yang diajukan
     */
    
    //pass by value
    int mengajukanCuti(int hari){
        return hari = 18;
    }
    
    //pass by reference
    void mengajukanCuti(Karyawan karyawan){
        karyawan.setId("22");
    }
    
    /**
     * method static untuk mengajukan kerja
     */
    static void mengajukanKerja(){
        
    }
    /**
     * 
     * @return 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * 
     * @return 
     */
    public String getNama() {
        return nama;
    }

    /**
     * 
     * @param nama 
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @return 
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * 
     * @param alamat 
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public static void main(String[] args) {
        
    }
}
