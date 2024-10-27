import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Konversi bilangan bulat ke biner");
        System.out.print("Masukkan bilanga Desimal: ");
        int bil = in.nextInt();
        String hasilSementara = "";
        for (int i = bil; i >= 0; i--) {
            int sisaBagi = bil%2;
            bil/=2;
            i = bil;
            hasilSementara+=sisaBagi;
        }
        
        String reverseHasilSementara = "";
        for (int i = 0; i < hasilSementara.length(); i++) {
            char digit = hasilSementara.charAt((hasilSementara.length()-1)-i);
            reverseHasilSementara += digit;
        }
        int hasil = Integer.parseInt(reverseHasilSementara);
        System.out.println("Bilangan Biner : " + hasil);
    }
}
