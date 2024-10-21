import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai1 : ");
        int nilai = input.nextInt();
        
        if(nilai>=90 && nilai<=100){
            System.out.println("Predikat : A");
        } else if (nilai>=80 && nilai<90) {
            System.out.println("Predikat : B");  
        } else {
            System.out.println("Predikat : C");
        }
    }
} 
