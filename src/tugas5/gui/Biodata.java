/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5.gui;

/**
 *
 * @author Alaba
 */
public class Biodata {
    String nama,nim,kelas,sekolah;
    
    public Biodata(String nama,String nim,String kelas,String sekolah){
    this.nama=nama;
    this.nim=nim;
    this.kelas=kelas;
    this.sekolah=sekolah;
    }

    Biodata(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getSekolah() {
        return sekolah;
    }
    
    
}
