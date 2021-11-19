public class TransferBank extends Transaksi{
    
    private double uang;

    public TransferBank(String idTransaksi, String idPembeli, double uang){
        super(idTransaksi, idPembeli);
        setBayar(uang);
    }
}
