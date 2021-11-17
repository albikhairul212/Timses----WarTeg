public class Indomaret extends Transaksi{

    private double uang;

    public Indomaret(String idTransaksi, String idPembeli, double uang){
        super(idTransaksi, idPembeli);
        setBayar(uang);
    }
}
