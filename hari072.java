import java.util.Scanner;

public class MAin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int awal = in.nextInt();
        int beda = in.nextInt();
        int deret = in.nextInt();
        
        int hasil = deretBilangan(awal, beda, deret);
        
         System.out.println(hasil);
    }

    public static int deretBilangan(int a, int b, int d) {
        if(d==1){
            return a;
        } else {
            return deretBilangan(a, b, d-1)+b;
        }
    }
}
