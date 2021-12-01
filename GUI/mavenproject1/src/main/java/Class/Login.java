public class Login {
    


    private String nama;
    private int Pass;


    public Login(){


    }

    public Login( String nama, int Pass){

        this.nama = nama;
        this.Pass = Pass;

    }



    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }



    public int getPass(){
        return this.Pass;
    }

    public void setPass(int Pass){
        this.Pass = Pass; 
    }


}
