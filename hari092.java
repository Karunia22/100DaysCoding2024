import java.util.Scanner;

public class Pola {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ukuran pola V : ");
        int b = in.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b; j++) {
                if(j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = b-1; j >= 1; j--) {
                if(j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
