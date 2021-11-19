import java.util.Scanner;

public class Main {
    


    public static void main(String[] args) {

        String nama = "Umam";
        int Pass;
        boolean kondisi = true;
        

        Login login = new Login();

        try(Scanner sNama = new Scanner(System.in)){
            try(Scanner sPass = new Scanner(System.in);){

                
        while (kondisi) {
            
        //setter  
        System.out.println("Masukan Nama anda: " );
        nama = sNama.nextLine();
        login.setNama(nama);
        
        //setter
        System.out.println("Masukan Password anda: ");
        Pass = sPass.nextInt();
        login.setPass(Pass);

            if (nama.equals("umam") || Pass == 123      ) {
            
                kondisi = true;

            }else{
                kondisi = false;
            }
        }
    }
}
}
}

