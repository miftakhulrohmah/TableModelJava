/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moklet;

import java.util.Date;

/**
 *
 * @author A455L
 */
public class Moklet {
    private String nama;
    private String jenisKelamin;
    private Date tanggalLahir;
    private String alamat;
 
    public Moklet() {
    }
 
    public String getAlamat() {
        return alamat;
    }
 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
    public String getJenisKelamin() {
        return jenisKelamin;
    }
 
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public Date getTanggalLahir() {
    return tanggalLahir;
    }
 
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @param args the command line arguments
     */
   
}
