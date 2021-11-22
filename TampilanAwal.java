public class TampilanAwal{

    private String opening;
    private String gambarBarang;
    private double hargaBarang;
    private String namaBarang;
    private String ketBarang;
    protected double hargaBarang1;
    protected double hargaBarang2;

    public TampilanAwal(){
        this.opening = opening;
    }

    public TampilanAwal(String nama_barang, String gambar, String keterangan, double harga){
        this.namaBarang = nama_barang;
        this.gambarBarang = gambar;
        this.ketBarang = keterangan;
        this.hargaBarang = harga;
    }
   
    public void setNamaBarang(String nama_barang){
       this.namaBarang = nama_barang; 
    }
    
    public void setGambarBarang(String gambar){
        this.gambarBarang = gambar;
    }

    public void setKetBarang(String keterangan){
        this.ketBarang = keterangan;
    } 

    public void getHargaBarang(){
       this.hargaBarang1 = 2000000;
       this.hargaBarang2 = 3000000;
    }

    public void setHargaBarang(double harga){
        this.hargaBarang = harga;
    }
}