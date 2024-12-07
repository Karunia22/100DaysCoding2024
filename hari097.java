import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();

        if (angka < 2) {
            System.out.println(angka + " bukan bilangan prima.");
        } else {
            boolean isPrima = true;
            for (int i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    isPrima = false;
                    break;
                }
            }
            System.out.println(isPrima ? angka + " adalah bilangan prima." : angka + " bukan bilangan prima.");
        }
        
        input.close();
    }
}
