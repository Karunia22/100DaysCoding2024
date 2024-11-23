import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Banyak data yang akan disimpan: ");
        int banyakData = in.nextInt();
        
        int[] memori = new int[banyakData];
        
        for (int i = 0; i < memori.length; i++) {
            memori[i] = in.nextInt();
        }
        
        for (int x : memori) {
            System.out.println(x);
        }
    }
    
}
