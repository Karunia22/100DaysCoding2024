import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a : ");
        int a = input.nextInt();
        System.out.print("b : ");
        int b = input.nextInt();
        
        boolean LebihBesarSamaDengan = a>=b;
        boolean LebihKecilSamaDengan = a<=b;
        
        System.out.println(LebihBesarSamaDengan);
        System.out.println(LebihKecilSamaDengan);
        
    }
    
}
