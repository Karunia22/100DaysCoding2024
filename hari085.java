import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah data yang ingin disimpan: ");
        int bData = in.nextInt();
        int[] arr = new int[bData];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }

        int k = 0;
        for (int i : arr) {
            arr[k] = in.nextInt();
            k++;
        }

        int i=0;
        while (i<arr.length) {
            arr[i]= in.nextInt();
            i++;
        }
    }
}
