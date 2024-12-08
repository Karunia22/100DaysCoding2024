import java.util.Scanner;

public class coba2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int hasil = 0;
        
        for (int i = x; i <= y; i++) {
            if(x%2==0){
                hasil+=x;
            }
        }
        System.out.println(hasil);
    }
}
