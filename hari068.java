import java.util.Scanner;
public class hari068 {

        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                int panjang = in.nextInt();
                int lebar = in.nextInt();

                hasil(panjang, lebar);
        }
        public static int operator(int p,  int l){
                int luas;
                luas = p * l;
                return luas;
        }
        public static void hasil(int p, int l){
                int jawaban = operator(p, l);
                System.out.println("Luas = " + jawaban);
        }
}
