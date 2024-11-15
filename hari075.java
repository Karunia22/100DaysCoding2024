import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine();
        int indeks = in.nextInt();
        Integer indeksUp = null;
        if(indeks<=kalimat.length()-1){
            indeksUp = indeks;
        }
        for (int i = 0; i < kalimat.length(); i++) {
            if(indeksUp == i){
                String output = Character.toString(kalimat.charAt(i));
                System.out.println("Huruf yang diubah : " + output + " ke " + output.toLowerCase());
            }
        }
    }
}
