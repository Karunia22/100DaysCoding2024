import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a : ");
        boolean a = input.nextBoolean();
        
        boolean negasi= !a;
        
        System.out.println(negasi);
        
    }
    
}
