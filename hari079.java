import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        String upAngka, digitGenap, digitGanjil;
        upAngka = Integer.toString(angka);
        digitGenap = "";
        digitGanjil = "";
        for (int i = 0; i < upAngka.length(); i++) {
            int digit = Integer.parseInt(Character.toString(upAngka.charAt(i)));
            if (digit%2==0) {
                digitGenap += digit;
            } else {
                digitGanjil += digit;
            }
        }
        
        System.out.println("DIgit ganap: " + Integer.parseInt(digitGenap));
        System.out.println("DIgit ganjil: " + Integer.parseInt(digitGanjil));
        
    }
}
