import java.util.Scanner;
public class hari067 {

        public static void main(String[] args){
                Scanner in = new  Scanner(System.in);
                int bil1, bil2;
                bil1 = in.nextInt();
                bil2 = in.nextInt();
                hasil(bil1, bil2);
        }
        public static void hasil(int k, int p){
                int hasil;
                hasil = k + p;
                System.out.println("Hasil penjumlahan = " + hasil);
        }
}

