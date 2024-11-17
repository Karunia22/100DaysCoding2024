import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> userName = new ArrayList<>();
        ArrayList<String> password = new ArrayList<>();
        System.out.println("1. Buat akun");
        System.out.println("2. Login");

        boolean masukAkun, status;
        masukAkun = true;
        status = false;
        while (masukAkun) {
            System.out.print("Pilih : ");
            String pilihan = in.next();
            switch (Integer.parseInt(pilihan)) {
                case 1:
                    System.out.print("Buat nama  : ");
                    String nama = in.nextLine();
                    in.nextLine();
                    System.out.print("Buat sandi : ");
                    String sandi = in.nextLine();
                    userName.add(nama);
                    password.add(sandi);
                    System.out.println("Selesai membuat akun");
                    break;
                case 2:
                    boolean kondisi = true;
                    while (kondisi) {
                        String masukkanNama, masukkanSandi;
                        System.out.print("Masukkan nama : ");
                        masukkanNama = in.nextLine();
                        in.nextLine();
                        System.out.print("Masukan : ");
                        masukkanSandi = in.nextLine();
                        for (int i = 0; i < userName.size(); i++) {
                            if ((masukkanNama.equals(userName.get(i))) && masukkanSandi.equals(password.get(i))) {
                                kondisi = false;
                                masukAkun = false;
                                status = true;
                            } 
                        }
                    }
                    break;
                default:
                    break;

            }
            System.out.println();
        }
        
            if (status) {
                 System.out.println("Login Berhasil");
            } else {
                 System.out.println("Login Gagal");
            }
    }
}
