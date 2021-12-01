<<<<<<< Updated upstream
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
     

=======
public class struk_konfirmasi extends Transaksi {

   private double Produk;
   private double OngkosKirim;
   private double BiayaPacking;
   private double Asurasi;
   private String idTransaksi;
   private String idPembeli;
   private int JumlahBarang;
   private double HargaBarang;
   private String COD;
   private String TransferBank;

   public class TotalBiaya{

        public String Transaksi(){
            return idTransaksi;
            return idPembeli; 
        }

        public void Transaksi(String idTransaksi, String idPembeli){
            this.idTransaksi = idTransaksi;
            this.idPembeli = idPembeli;
        }
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

        public Double Total(){
            return this.getHargaBarang() * this.getJumlahBarang();
        }
    }

    public class MetodePembayaran{

        public String getCOD(){
            return COD;
        }

        public void setCOD(String CoD){
            this.COD = COD;
        }

        public String getTransferBank(){
            return TransferBank;
        }

        public void setTransferBank(String TransferBank){
            this.TransferBank = TransferBank;
        }
    } 
>>>>>>> Stashed changes
}