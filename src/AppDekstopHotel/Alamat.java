/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppDekstopHotel;

/**
 *
 * @author DANDY RIANSYAH
 */
public class Alamat {
    public String nama, hotel, alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

 
    
    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
public void pilih(String hotel ){
    this.hotel=hotel ;
    if (hotel.equalsIgnoreCase("ROYAL HOTEL"))
        alamat="JL JEMBARAN NO.23,BOGOR BARAT,BOGOR,JAWA BARAT";
    
    else if (hotel.equalsIgnoreCase("MSC HOTEL"))
        alamat="JL MARGONDA NO.312,PONDOK CINA,DEPOK,JAWA BARAT";
    
    else if (hotel.equalsIgnoreCase("VESA HOTEL"))
        alamat="JL RIOWER NO.99,KEBON JERUK,JAKARTA BARAT,DKI JAKARTA";
    
    else
        alamat="";  
   }
}

    

