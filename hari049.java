import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int nilai = input.nextInt();
        
        if(nilai>=0 && nilai<=70){
            System.out.println("Nilai : " + nilai + " Tidak tuntas");
        } else if (nilai>70 && nilai<=100) {
            System.out.println("Nilai : " + nilai + " Tuntas");
                
        }
        
    }
    
}
