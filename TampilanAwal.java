public class TampilanAwal{

    private String opening;
    private String gambarBarang;
    protected double hargaBarang;
    private String namaBarang;
    private String ketBarang;

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

    public String getNamaBarang(){
        return namaBarang;
    }
    
    public void setGambarBarang(String gambar){
        this.gambarBarang = gambar;
    }

    public String getGambarBarang(){
        return gambarBarang;
    }

    public void setKetBarang(String keterangan){
        this.ketBarang = keterangan;
    } 

    public String getKetBarang(){
        return ketBarang;
    }

    public void setHargaBarang(double harga){
        this.hargaBarang = harga;
    }

    public Double getHargaBarang(){
       return hargaBarang;
    }
 
}