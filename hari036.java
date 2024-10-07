import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        double a = input.nextByte();
        System.out.print("b: ");
        double b = input.nextByte();
        
        
        double hasilPerkalian = a * b;
        double hasilPembagian = a / b;
        double hasilModulo = a % b;
        
        System.out.println("a x b = " + hasilPerkalian);
        System.out.println("a : b = " + hasilPembagian);
        System.out.println("a % b = " + hasilModulo);
    }
    
}
