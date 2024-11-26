import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }

        int i = 0;
        while (i<arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        int k = 0;
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[k]);
            k++;
        }

        for (String string : arr) {
            System.out.println(string);
        }
    }
}
