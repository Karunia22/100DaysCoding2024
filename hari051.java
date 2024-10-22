import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("angka 1 : ");
        int angka1 = input.nextInt();
        System.out.print("angka 2 : ");
        int angka2 = input.nextInt();
        
        System.out.println("Operasi : +, -, x, /, %");
        
        char pilihan = input.next().charAt(0);
        switch(pilihan){
            case '+' :
            System.out.println("Hasil : " + (angka1 + angka2));
            break;
            case '-' :
            System.out.println("Hasil : " + (angka1 - angka2));
            break;
            case 'x' :
            System.out.println("Hasil : " + (angka1 * angka2));
            break;
            case '/' :
            System.out.println("Hasil : " + ((double) angka1 / angka2));
            break;
            case '%' :
            System.out.println("Hasil : " + (angka1 % angka2));
            break;
            default :
            break;
        }
    }
} 
