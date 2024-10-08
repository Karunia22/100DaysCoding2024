import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.println(a);
        a+=a;
        System.out.println(a);
        a-=a;
        System.out.println(a);
    }
    
}
