import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] kordinat = {0, 0, 30};
      
        char karakter = 'x';
        for (int i = 0; i < kordinat.length; i++) {
            System.out.print(karakter + " = ");
            int n = in.nextInt();
            kordinat[i]+=n;
            karakter++;
        }
        
        System.out.println();
        char karakter2 = 'x';
        for (int i : kordinat) {
            System.out.print(karakter2 + " = " + i);
            karakter2++;
            System.out.println();
        }
    }
}
