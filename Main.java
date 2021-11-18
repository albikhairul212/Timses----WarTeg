import java.util.Scanner;

public class Main{
    











    public static void main(String[] args) {

        String nama = null;
        int Pass;
        

        Login login = new Login();

        try(Scanner sNama = new Scanner(System.in)){
            try(Scanner sPass = new Scanner(System.in);){

        
        //setter  
        System.out.println("Masukan Nama anda: " );
        nama = sNama.nextLine();
        login.setNama(nama);

        //setter
        System.out.println("Masukan Password anda: ");
        Pass = sPass.nextInt();
        login.setPass(Pass);


        //getter
        login.setPass(123456);
        System.out.println(login.getPass());

        }
    }
    }
}
