import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("TInggi : ");
        int p = in.nextInt();
        for (int i = 1; i <= p ; i++) {
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
