import java.util.Scanner;

public class hari002{

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = "admin";
        boolean n = true;
        while(n){
            System.out.print("Masukan password : ");
            String passInput = in.nextLine();
            if(passInput.equalsIgnoreCase(password)){
                System.out.println("Login berhasil");
                n=false;
            }
        }
    }
}
