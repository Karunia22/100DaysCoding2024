import java.util.Scanner;

public class haro069 {
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);

                System.out.println("Nomor 1");
                System.out.print("Masukkan suhu air: ");
                int suhu = in.nextInt();
                if(suhu <= 0){
                        System.out.println("Air membeku");
                } else if (suhu >0 && suhu<=100){
                        System.out.println("Air dalam keadaan mencair");
                } else {
                        System.out.println("Air mendidih");
                }

        }
}
