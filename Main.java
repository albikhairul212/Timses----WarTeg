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

        //trial

        int trial = 1 ;

        //setter  
        System.out.println("Masukan Nama anda: " );
        nama = sNama.nextLine();
        login.setNama(nama);
        
        //setter
        System.out.println("Masukan Password anda: ");
        Pass = sPass.nextInt();
        login.setPass(Pass);



            if (nama.equals("umam") || Pass == 123) {
            
                //kondisi perulangan 3x
                while( Pass == 123){
                    //nama = sNama.nextLine();
                    Pass = sPass.nextInt();    
                    trial ++;
                    if (trial == 3){
                        System.out.println("Eror");
                        System.exit(0);
                    }

                }

            }else{
                kondisi = false;
                System.out.print("Berhenti");
            }












        }
    }
}
}
}

