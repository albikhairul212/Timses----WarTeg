public class Transaksi extends TampilanAwal{

    private String idTransaksi;
    private String idPembeli;
    private double uang;
    private double bayar;

    public Transaksi(){
        this.idTransaksi = idTransaksi; this.idPembeli = idPembeli;
    }

    public Transaksi(String idTransaksi, String idPembeli){
        this.idTransaksi = idTransaksi;
        this.idPembeli = idPembeli;
    }

    public void totalHarga(double harga){
        this.getHargaBarang();
    }

    protected void setBayar(double uang){
        this.bayar = uang;
    }

}
