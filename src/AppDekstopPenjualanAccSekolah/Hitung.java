/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppDekstopPenjualanAccSekolah;

/**
 *
 * @author ALFIAN
 */
public class Hitung {
    public double dasi, topi, ikat, total ;

    public double getDasi() {
        return dasi;
    }

    public void setDasi(double dasi) {
        this.dasi = dasi;
    }

    public double getTopi() {
        return topi;
    }

    public void setTopi(double topi) {
        this.topi = topi;
    }

    public double getIkat() {
        return ikat;
    }

    public void setIkat(double ikat) {
        this.ikat = ikat;
    }

    public double getTotal() {
        return ((dasi*15000)+(topi*20000)+(ikat*30000)) ;
    }

    public void setTotal(double total) {
        this.total = total;
    }
     

   
   
    
}
