import java.util.Scanner;

public class pertemuan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int paslon = in.nextInt();
        String suara[] = new String[paslon];

        in.nextLine();
        for (int i = 0; i < paslon; i++) {
            System.out.println("Suara paslon " + (i+1));
            suara[i] = in.nextLine();
        }
        for (int i = 0; i < paslon; i++) {
            int hasil = 0;
            String hasilSuara =  "";
            for (int j = 0; j < suara[i].length(); j++) {
                if (suara[i].charAt(j)=='I') {
                    hasil++;
                    hasilSuara+=suara[i].charAt(j);
                }
            }
            System.out.print("Paslon " + (i+1)+ ": ");
            for (int j = 1; j <= hasilSuara.length(); j++) {
                if(j%5==0){
                    System.out.print(hasilSuara.charAt(i)+" ");
                } else {
                    System.out.print(hasilSuara.charAt(i));
                }
            }
            System.out.println("\nHasil suara: "+hasil);
        }
        in.close();
    }
}
