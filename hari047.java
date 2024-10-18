import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        String password = "unsulbar";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sandi : ");
        String sandi = input.nextLine();
        
        if(sandi.equals(password)){
            System.out.println("Barhasil login");
        }
        
    }
    
}
