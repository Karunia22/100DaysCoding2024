import java.util.Scanner;

public class Main {
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                String nama = in.nextLine();
                String nim = in.nextLine();

                panggil(nama, nim);
        }

        static void panggil(String nama, String nim){
                int banyakKarakterNama = karakterNama(nama);
                int banyakKarakterNim = karakterNim(nim);
                System.out.println("banyak Karakter Nama : " + banyakKarakterNama);
                System.out.println("banyak Karakter Nim : " + banyakKarakterNim);
        }
        static int karakterNama(String nama){
                String identifikasi = nama;
                int hasil = 0;
                for(int i = 0; i < identifikasi.length(); i++){
                        if(identifikasi.charAt(i) != ' '){
                         hasil++;
                        }
                }
                return hasil;
        }
        static int karakterNim(String nim){
                String identifikasi = nim; 
                int hasil = 0;
                for(int i = 0; i < identifikasi.length(); i++){
                        if(identifikasi.charAt(i) != ' '){ 
                         hasil++;
                        }
                }
                return hasil;
        }
}
