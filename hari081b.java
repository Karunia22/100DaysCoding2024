public class Main {
    public static void main(String[] args) {
        int angka = 42;
        boolean kondisi = true;
        char karakter = 'A';

        String upAngka = String.valueOf(angka);
        String upKondisi = String.valueOf(kondisi);
        String upKarakter = String.valueOf(karakter);

        System.out.println("integer ke String: " + upAngka); 
        System.out.println("boolean ke String: " + upKondisi);  
        System.out.println("char ke String: " + upKarakter); 
    }
}
