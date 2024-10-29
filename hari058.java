import java.util.Scanner;
import java.math.BigInteger;

public class finalk {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Konversi Bilangan biner ke desimal");
        System.out.print("Bilangan biner: ");
        String inputSementara = in.next();
        boolean kondisi = true;
        
        BigInteger input = new BigInteger(inputSementara);
        String konversiBiner = input.toString();
        String identifikasiBiner = "";
        int jumlahDigit = input.toString().length();
        for (int i = 0; i < jumlahDigit; i++) {
            int digit = Integer.parseInt(Character.toString(konversiBiner.charAt(i)));
            if(digit==1 || digit==0){
                identifikasiBiner += digit;
            } else {
                kondisi = false;
                break;
            }
        }
        
        if(kondisi){
            int p = konversiBiner.length()-1;
            int j = konversiBiner.length()-1;
            
            int hasil = 0;
            while(j>=0){
                int digit = Integer.parseInt(Character.toString(identifikasiBiner.charAt(p-j)));
                double pangkat = Math.pow(2,j);
                int hasilPangkat = (int) pangkat;
                digit *= hasilPangkat;
                hasil += digit;
                j--;
            }
            System.out.println("Bilangan desimal : " + hasil);
        } else {
            System.out.println("Bukan bilangan biner");
        }
    }
}
