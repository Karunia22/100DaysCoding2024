import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        
        boolean perbandinganLebihDari = a>b;
        boolean perbandinganKurangDari = a<b;
        System.out.println(perbandinganLebihDari);
        System.out.println(perbandinganKurangDari);
       
    }
    
}
