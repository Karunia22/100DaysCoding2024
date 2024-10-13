import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a : ");
        int a = input.nextInt();
        System.out.print("b : ");
        int b = input.nextInt();
        
        boolean samaDengan = a==b;
        boolean tidakSamaDengan = a!=b;
        
        System.out.println(samaDengan);
        System.out.println(tidakSamaDengan);
        
    }
    
}
