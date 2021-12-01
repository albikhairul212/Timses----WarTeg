public class transaksiWarteg extends HalamanUtama1{

    private String idTransaksi;
    private String idPembeli;
    private double uang;
    private double bayar;
    private double HargaBarang;
    private int JumlahBarang;

    public String Transaksi(){
        return idTransaksi;
         
    }

    public void Transaksi(String idTransaksi, String idPembeli){
        this.idTransaksi = idTransaksi;
        this.idPembeli = idPembeli;
    }

    public Double getHargaBarang(){
        return HargaBarang;
    }

    public int getJumlahBarang(){
        return JumlahBarang;
    }

    public Double totalHarga(){
        return this.getHargaBarang() * this.getJumlahBarang();
    }

    protected void setBayar(double uang){
        this.bayar = uang;
    }

}

