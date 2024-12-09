import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int pilihan = input.nextInt();
        
        System.out.print("Masukkan angka pertama: ");
        double num1 = input.nextDouble();
        
        System.out.print("Masukkan angka kedua: ");
        double num2 = input.nextDouble();
        
        double hasil = 0;
        switch (pilihan) {
            case 1:
                hasil = num1 + num2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = num1 - num2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case 3:
                hasil = num1 * num2;
                System.out.println("Hasil perkalian: " + hasil);
                break;
            case 4:
                if (num2 != 0) {
                    hasil = num1 / num2;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        input.close();
    }
}
