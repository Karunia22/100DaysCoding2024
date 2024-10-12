import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        final float pi = 3.14159f;
        Scanner input = new Scanner(System.in);
        System.out.print("Input jari-jari : ");
        String jariJari = input.nextLine();
        int up_jariJari = Integer.valueOf(jariJari);
        System.out.print("Input satuan \t: ");
        String satuan = input.nextLine();
        
        float keliling = (float) up_jariJari * pi * 2;
        float luas = (float) up_jariJari *up_jariJari * pi;
        
        System.out.println("========================HASIL========================");
        System.out.println("Jari-jari \t: " + jariJari + " " + satuan);
        System.out.println("Keliling \t: " + keliling + " " + satuan);
        System.out.println("Luas \t \t: " + luas + " " + satuan + "^2");
       
    }
    
}
