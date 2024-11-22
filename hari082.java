import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bil1, bil2, hasil;
        bil1 = in.nextDouble();
        bil2 = in.nextDouble();
        
        hasil = bil1/bil2;
        
        System.out.println("Method ceil(): " + Math.ceil(hasil));
        System.out.println("Method round(): " + Math.round(hasil));
        System.out.println("Method floor(): " + Math.floor(hasil));
        
    }
}
