import java.util.Scanner;

public class hari091 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hasilLooping = 0;
        while(true){
            String inputan = in.nextLine();
            if(inputan.equalsIgnoreCase("you and i")){
                hasilLooping++;
                continue;
            } else if (inputan.equalsIgnoreCase("end")) {
                break;
            }
        }
        System.out.println("Jumlah perulangan : " + hasilLooping);
    }
}
