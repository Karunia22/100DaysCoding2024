import java.util.Scanner;

public class hariKeTiga {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine();
        char[] huruf = new char[kalimat.length()];
        int banyakHuruf = 0;
        for(int i=0; i<huruf.length; i++){
            huruf[i] = kalimat.charAt(i);
            if(huruf[i]==' '){
                continue;
            } else {
                banyakHuruf++;
            }
        }
        System.out.println("Banyak kata dalam kalimat : "+banyakHuruf);
    }
    
}
