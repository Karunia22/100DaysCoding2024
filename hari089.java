import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] kordinat = new int[3];

        System.out.print("Nilai awal = ");
        for (int i = 0; i < kordinat.length; i++) {
            kordinat[i] = in.nextInt();
        }

        char variabel = 'x';
        for (int i = 0; i < kordinat.length; i++) {
            System.out.print(variabel + " : ");
            String pilihan = in.next();
            int k = in.nextInt();
            if (pilihan.equalsIgnoreCase("kiri")) {
                kekiri(kordinat, i, k);
            } else if (pilihan.equalsIgnoreCase("kanan")) {
                kekanan(kordinat, i, k);
            } else if (pilihan.equalsIgnoreCase("naik")) {
                atas(kordinat, i, k);
            } else if (pilihan.equalsIgnoreCase("turun")) {
                bawah(kordinat, i, k);
            } else if (pilihan.equalsIgnoreCase("maju")) {
                maju(kordinat, i, k);
            } else if (pilihan.equalsIgnoreCase("mundur")) {
                mundur(kordinat, i, k);
            }
            variabel++;
        }

        char variabel2 = 'x';
        for (int i : kordinat) {
            System.out.println(variabel2 + " = " + i);
        }
        in.close();

        System.out.print("Posisi pesawat adalah ");
        for (int i = 0; i < kordinat.length; i++) {
            if(i==kordinat.length-1){
                System.out.println(kordinat[i]);
            } else {
                System.out.print(kordinat[i]+", ");
            }
        }
    }

    static int kekiri(int kordinat[], int i, int l) {
        return kordinat[i] -= l;
    }

    static int kekanan(int kordinat[], int i, int l) {
        return kordinat[i] += l;
    }

    static int maju(int kordinat[], int i, int l) {
        return kordinat[i] += l;
    }

    static int mundur(int kordinat[], int i, int l) {
        return kordinat[i] -= l;
    }

    static int atas(int kordinat[], int i, int l) {
        return kordinat[i] += l;
    }

    static int bawah(int kordinat[], int i, int l) {
        return kordinat[i] -= l;
    }
}
