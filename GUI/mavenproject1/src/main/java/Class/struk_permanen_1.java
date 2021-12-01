package Class;

public class struk_permanen {
    private String idTransaksi;
    private String idPembeli;
    private String resi;
    private String NamaBarang;
    private double HargaBarang;
    private int JumlahBarang;

    public String Transaksi(){
       return idTransaksi;
       return idPembeli; 
    }

    public void Transaksi(String idTransaksi, String idPembeli){
        this.idTransaksi = idTransaksi;
        this.idPembeli = idPembeli;
    }

    public String getResi(){
        return resi;
    }

    public void setResi(String resi){
        this.resi = resi;
    }

    public String getNamaBarang(){
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang){
        this.NamaBarang = NamaBarang;
    }

    public Double getHargaBarang(){
        return HargaBarang;
    }

    public void setHargaBarang (double HargaBarang){
        this.HargaBarang = HargaBarang;
    }

    public int getJumlahBarang(){
        return JumlahBarang;
    }

    public void setJumlahBarang(int JumlahBarang){
        this.JumlahBarang = JumlahBarang;
    }

    public Double totalHarga(){
        return this.getHargaBarang() * this.getJumlahBarang();
    }
    
}

