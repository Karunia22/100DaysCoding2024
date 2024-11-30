import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int[] kordinat = new int[3];
        for (int i = 0; i < kordinat.length; i++) {
            kordinat[i] = in.nextInt();
        }
        in.nextLine();
        String pengendali = in.next().toUpperCase();
        boolean kondisi = false;
        for (int i = 0; i < pengendali.length(); i++) {
            if(pengendali.charAt(i)=='A' || pengendali.charAt(i)=='D'){
                if (pengendali.charAt(i)=='A') {
                    kordinat[0] -= 5;
                } else {
                    kordinat[0] += 5;
                }
            } else if (pengendali.charAt(i)=='R' || pengendali.charAt(i)=='E') {
                if (pengendali.charAt(i)=='R') {
                    kordinat[1] += 5;
                } else{
                    kordinat[1] -= 5;
                }
            } else if (pengendali.charAt(i)=='W' || pengendali.charAt(i)=='S'){
                if (pengendali.charAt(i)=='W') {
                    kordinat[2] += 5;
                    if(i==0 && kordinat[2]>40){
                        kordinat[2]=40;
                    }
                    if(kordinat[2]>40){
                        kordinat[2] -= 5;
                    }
                } else {
                    kordinat[2] -= 5;
                }
                
            }
            if (kordinat[0]<=0) {
                kondisi = true;
                break;
            }
            
        }
        
        if (kondisi) {
            System.out.println("Pesawat terjatuh");
        } else {
            System.out.print("Posisi: ");
            for (int i : kordinat) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
