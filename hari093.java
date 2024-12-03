import java.util.Scanner;

public class Pola {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ukuran pola V terbalik : ");
        int b = in.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int j = b; j >= 1; j--) {
                if(j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= b; j++) {
                if(j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        in.close();
    }
}
