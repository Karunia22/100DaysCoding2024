package isc;

import java.util.Scanner;

public class NewClass6 {

    public static void main(String[] args) {
        hasil(); 
    }

    static void hasil() {
        Scanner in = new Scanner(System.in);

        System.out.print("Bil1 : ");
        int bil1 = in.nextInt();

        int k = 1;
        double penampung = bil1;
        while (true) {
            System.out.print("Bil2 : ");
            int bil2 = in.nextInt();

            if (k == 1) {
                System.out.println("Hasil: " + tambah(penampung, bil2));
                penampung = tambah(bil1, bil2);
            } else if (k == 2) {
                System.out.println("Hasil: " + kurang(penampung, bil2));
                penampung = kurang(penampung, bil2);
            } else if (k == 3) {
                System.out.println("Hasil: " + kali(penampung, bil2));
                penampung = kali(penampung, bil2);
            } else if (k == 4) {
                System.out.println("Hasil: " + bagi(penampung, bil2));
                penampung = bagi(penampung, bil2);
                k = 0;
            }
            
            System.out.print("mau lanjut [y/t]? ");
            char lanjut = in.next().charAt(0);
            
            if (lanjut != 'y') {
                System.out.println("Selesai");
                break;
            }
            k++;
        }
    }
    
    static double tambah(double bil1, int bil2) {
        return bil1 + bil2;
    }

    static double kurang(double penampung, int bil2) {
        int upPenampung = (int) penampung;
        return upPenampung - bil2;
    }

    static double kali(double penampung, int bil2) {
        int upPenampung = (int) penampung;
        return upPenampung * bil2;
    }

    static double bagi(double penampung, int bil2) {
        double upBil2 = (double) bil2;
        return penampung / upBil2;
    }
}
