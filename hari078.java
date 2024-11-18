import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kal1 = in.nextLine();
        String kal2 = in.nextLine();
        
        if (kal1.equalsIgnoreCase(kal2)) {
            System.out.println("Kata sesuai");
        } else {
            System.out.println("Kata tidak sesuai");
        }
    }
}
