public class Struk_Konfirmasi {

    private double Produk;
    private double OngkosKirim;
    private double BiayaPacking;
    private double Asuransi;
    private String COD;
    private String TransferBank;
    private double Total;

    
    public double getProduk(){
        return this.Produk;
    }

    public void setProduk(double Produk){
        this.Produk = Produk;
    }

    public double getBiayaPacking(){
        return this.BiayaPacking;
    }

    public void setBiayaPacking(double BiayaPacking){
        this.BiayaPacking = BiayaPacking;
    }

    public double getAsuransi(){
        return this.Asuransi;
    }

    public void setAsurasi(double Asuransi){
        this.Asuransi = Asuransi;
    }

    public String getCOD(){
        return this.COD;
    }

    public void setCOD(String COD){
        this.COD = COD;
    }

    public String getTransferBank(){
        return this.TransferBank;
    }

    public void setTransferBank(String TransferBank){
        this.TransferBank = TransferBank;
    }

    public double getTotal(){
        return this.Total;
    }

    public void setTotal(double Total){
        this.Total = Total;
    }
     

}