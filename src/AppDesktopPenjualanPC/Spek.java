/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppDesktopPenjualanPC;

/**
 *
 * @author ALFIAN
 */
public class Spek {
    public String nama,email,paket,spesifikasi,alamat,jasa,keterangan,metode,kode;
    public int harga,biaya,total;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpek(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public String getJasa() {
        return jasa;
    }

    public void setJasa(String jasa) {
        this.jasa = jasa;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
      public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    
    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getTotal() {
        return (harga+biaya);
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
   
    protected void pilih1(String paket ){
    this.paket=paket;
        if (paket.equalsIgnoreCase("SUPER")){
            spesifikasi="CPU I7-10700K|RAM 2X16GB|VGA-ASUS RTX2080 SUPER|SSD 1TB|MOBO Z490|PSU CORSAIR 465X RGB";
            harga=40000000;
        }
        else if (paket.equalsIgnoreCase("EXTRA")){
            spesifikasi="CPU RYZEN 9 3900X|RAM 2X16GB|VGA-GALAX RTX2070 SUPER|SSD 500GB|MOBO X570|PSU SEASONIC GC650";
            harga= 34000000;
        }    
        else if (paket.equalsIgnoreCase("PREMIUM")){
            spesifikasi="CPU RYZEN 7 3700X|RAM 2X8GB|VGA-MSI RTX2060 SUPER|SSD 512GB|MOBO X470|PSU BEQUIET DARK POWER PR011";
            harga=23000000;
        }    
        else if (paket.equalsIgnoreCase("HIGH")){
            spesifikasi="CPU I5-9600K|RAM 2X8GB|VGA-ZOTAC GTX1650 SUPER|SSD 512GB|MOBO Z390|PSU ANTEC NEOECO 700W";
            harga=15000000;
        }    
        else if (paket.equalsIgnoreCase("LOW")){
            spesifikasi="CPU RYZEN 5 3400G|RAM 2X4GB|VGA RX570|SSD 240GB|MOBO B450M|PSU CORSAIR CV450";
            harga=7000000;
        }    
        
    }
    public void pilih2(String jasa ){
    this.jasa=jasa;
        if (jasa.equalsIgnoreCase("JNE")){
            keterangan="Estimasi 5-7 Hari (Paking Kayu)";
            biaya=100000;
        }
        else if (jasa.equalsIgnoreCase("J&T EXPRESS")){
            keterangan="Estimasi 1-2 Hari (Paking Kayu)";
            biaya=200000;
        }
        else if (jasa.equalsIgnoreCase("GO-SEND")){
            keterangan="Estimasi 3-5 Hari (Paking Kayu)";
            biaya=150000; 
        }
    }
    
    public void pilih3(String metode ){
    this.metode=metode;
        if (metode.equalsIgnoreCase("BCA"))
            kode="003120100231";
        else if (metode.equalsIgnoreCase("BRI"))
            kode="006953002189";
        else if (metode.equalsIgnoreCase("BNI"))
            kode="009384002149";
        else if (metode.equalsIgnoreCase("MANDIRI"))
            kode="001311449189";
        else if (metode.equalsIgnoreCase("INDOMARET"))
            kode="1038IND342";
        else if (metode.equalsIgnoreCase("ALFAMART"))
            kode="4398ALF232";
        else 
            kode="";
    }
    
    
}
