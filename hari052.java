import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Password : ");
        String sandi = input.nextLine();
        
        
        String password = (sandi.equals("Kampus"))? "Berhasil" : "Salah";
        System.out.println(password);
    }
} 
