import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        
        if(angka%2!=0 || angka%2==0 && angka!=0){
            if(angka%2==0){
                System.out.println(angka + " adalah bilangan genap");
            } else {
                System.out.println(angka + " adalah bilangan ganjil");
            }
        } else {
            System.out.println(angka + " bukan bilangan genap atau ganjil");
        }
        
    }
    
}
