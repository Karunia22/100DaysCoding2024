public class TipeDataString {
    
    public static void main(String[] args) {
        String nama = "karunia juli sariri";
        cetak(nama);
    }
    static void cetak(String nama){
        int k = jumlahKata(nama);
        System.out.println("Nama : " + nama);
        System.out.println("Banyak karakter : " + k);
    }
    public static int jumlahKata(String nama){
        int k = 0;
        char[] karakter = new char[nama.length()];
        for(int i = 0; i<karakter.length; i++){
            karakter[i] = nama.charAt(i);
            if(karakter[i] != ' '){
                k++;
            }
        }
        return k;
    }
}
