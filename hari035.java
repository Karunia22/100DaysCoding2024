import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextByte();
        System.out.print("b: ");
        int b = input.nextByte();
        
        int hasilPenjumlahan = a + b;
        int hasilPengurangan = a - b;
        
        System.out.println("a + b = " + hasilPenjumlahan);
        System.out.println("a - b = " + hasilPengurangan);
    }
    
}
