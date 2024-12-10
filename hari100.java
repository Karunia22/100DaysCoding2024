import java.time.LocalTime;
import java.util.Scanner;

public class lin{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = in.nextLine();
        String sapaan = in.nextLine();
        LocalTime waktu = LocalTime.now();

        if(waktu.isBefore(LocalTime.of(12, 0))){
            for (int i = 0; i < 25; i++) {
                System.out.print("=");
            }
            System.out.println(sapaan + ", " + nama);
            System.out.println("Program anda telah selesai");
            for (int i = 0; i < 25; i++) {
                System.out.print("=");
            }
        } else if(waktu.isAfter(LocalTime.of(13, 0)) && waktu.isBefore(LocalTime.of(17, 0))) {
            for (int i = 0; i < 25; i++) {
                System.out.print("=");
            }
            System.out.println(sapaan + ", " + nama);
            System.out.println("Program anda telah selesai");
            for (int i = 0; i < 25; i++) {
                System.out.print("=");
            }
        } else {
            for (int i = 0; i < 25; i++) {
                System.out.print("=");
            }
            System.out.println(sapaan + ", " + nama);
            System.out.println("Program anda telah selesai");
            for (int i = 0; i < 25; i++) {
                System.out.print("=");
            }
        }
        
    }
}
