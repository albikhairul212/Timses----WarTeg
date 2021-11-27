public class struk_konfirmasi {

    private double Produk;
    private double OngkosKirim;
    private double BiayaPacking;
    private double Asurasi;
    private String COD;
    private String TransferBank;

    public void getProduk(){
        return Produk;
    }

    public void setProduk(double Produk){
        this.Produk = Produk;
    }

    public void getBiayaPacking(){
        return BiayaPacking;
    }

    public void setBiayaPacking(double BiayaPacking){
        this.BiayaPacking = BiayaPacking;
    }

    public void getAsuransi(){
        return Asuransi;
    }

    public void setAsurasi(double Asuransi){
        this.Asuransi = Asuransi;
    }

    public void Total(){
        return this.getProduk() + this.getOngkosKirim() + this.getBiayaPacking() + this.getAsuransi();
    }
     

}