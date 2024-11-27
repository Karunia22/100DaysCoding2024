import java.util.Scanner;

public class funabocci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        int nilai[] = new int[angka];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = in.nextInt();
        }

        while (true) {
            System.out.print("Ingin mengubah niali? [y/t]");
            char k = in.next().charAt(0);
            if(k=='y' || k=='Y'){
                System.out.print("Data keberapa yang ingin diubah"  +(1) + "-" + (angka)+": ");
                int ubah = in.nextInt();
                System.out.print("Ubah nilai: ");
                nilai[ubah-1] = in.nextInt();
            } else {
                break;
            }
        }

        int index = 1;
        System.out.println("NIlai yang telah diubah");
        for (int i : nilai) {
            System.out.println("Nilai ke-"+index+": "+i);
        }
    }
}
