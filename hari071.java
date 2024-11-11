package srjunis;

import java.util.Scanner;

public class Srjunis {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bil, pangkat;
        bil = in.nextInt();
        pangkat = in.nextInt();

        hasil(bil, pangkat);
    }

    static void hasil(int b, int p) {
        System.out.println("Hasil : " + pangkat(b, p));
    }

    static double pangkat(int b, int p) {
        int bilangan, bilangan2, hasil, pangkat;
        bilangan = b;
        bilangan2 = b;
        pangkat = p;
        hasil = 0;
        if (p == 0) {
            hasil = 1;
            return (double) hasil;
        } else if (p < 0) {
            for (int i = 1; i <= (pangkat * -1); i++) {
                if (i == 1) {
                    hasil = bilangan;
                } else {
                    bilangan *= bilangan2;
                    hasil = bilangan;
                }
            }
            return (double) 1/hasil;
        } else {
            for (int i = 1; i <= pangkat; i++) {
                if (i == 1) {
                    hasil = bilangan;
                } else {
                    bilangan *= bilangan2;
                    hasil = bilangan;
                }
            }
            return (double) hasil;
        }
    }
}
