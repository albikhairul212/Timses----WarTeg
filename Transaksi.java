public class Transaksi extends TampilanAwal{

    protected String idTransaksi;
    protected String idPembeli;
    private String kodeResi;
    private int jumlahBarang;
    private double uang;
    private double bayar;
    private double harga;
    

    public Transaksi(){
        this.idTransaksi = idTransaksi; this.idPembeli = idPembeli;
    }

    public Transaksi(String idTransaksi, String idPembeli){
        this.idTransaksi = idTransaksi;
        this.idPembeli = idPembeli;
    }

    public String getKodeResi(){
        return kodeResi;
    }

    public void setKodeResi(){
        this.kodeResi = kodeResi;
    }

    public int getJmlBarang(){
        return jumlahBarang;
    }

    public void setJmlBarang(int jumlah){
        this.jumlahBarang = jumlah;
    }

    public void totalHarga(){ 
        
        harga = hargaBarang1 * jumlahBarang;
    }

    protected void setBayar(double uang){
        if(uang > harga){
            double total = uang - harga;
        }else{
            System.out.println("Uang yang anda masukkan kurang");
        }
    }

}
