import java.util.Scanner;

public class NewClass5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine();
        
        System.out.println("String tidak menggunakan method trim() : " + kalimat + "\nBanyak karakter: \t " + kalimat.length());
        System.out.println("String  menggunakan method trim() : " + kalimat.trim() + "\nBanyak karakter: \t " + kalimat.trim().length());
    }
}    
