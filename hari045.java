import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a : ");
        boolean a = input.nextBoolean();
        System.out.print("b : ");
        boolean b = input.nextBoolean();
        
        boolean logikaOR= a||b;
        
        System.out.println(logikaOR);
        
    }
    
}
