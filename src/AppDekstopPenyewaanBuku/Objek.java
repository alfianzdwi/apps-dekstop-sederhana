/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppDekstopPenyewaanBuku;

/**
 *
 * @author ALFIAN
 */
public class Objek {
    public String nomor,tanggal,kodea,nama,kodeb,judul;
     public int sewa;

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKodea() {
        return kodea;
    }

    public void setKodea(String kodea) {
        this.kodea = kodea;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeb() {
        return kodeb;
    }

    public void setKodeb(String kodeb) {
        this.kodeb = kodeb;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getSewa() {
        return sewa;
    }

    public void setSewa(int sewa) {
        this.sewa = sewa;
    }

    
    
    public void piliha(String kodea ){
    this.kodea=kodea;
        if (kodea.equalsIgnoreCase("A001"))
            nama="Dinda";
        else if (kodea.equalsIgnoreCase("A002"))
            nama="Ayu";
        else if (kodea.equalsIgnoreCase("A003"))
            nama="Muthia";
        else 
            nama="";
    }
    
    public void pilihb(String kodeb ){
    this.kodeb=kodeb;
        if (kodeb.equalsIgnoreCase("B001")){
            judul="CPU I7-10700K|RAM 2X16GB|VGA-ASUS RTX2080 SUPER|SSD 1TB|MOBO Z490|PSU CORSAIR 465X RGB";
            sewa=20000000;
            
        }
        else if (kodeb.equalsIgnoreCase("B002")){
            judul="Detective Conan";
            sewa =5000;
            
        }
        else if (kodeb.equalsIgnoreCase("B003")){
            judul="24 Jam Belajar Java";
            sewa=7000;
            
        }
    }
    
}
