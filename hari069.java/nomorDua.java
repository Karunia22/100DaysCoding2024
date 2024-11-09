import java.util.Scanner;

public class NomorDua {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan jumlah angka: ");
		byte angka = in.nextByte();
		
		System.out.print("Masukkan angka: ");
		byte max = 0;
		for(int i = 0; i < angka; i++){
			byte angkaAngka = in.nextByte();
			if(max < angkaAngka){
				max = angkaAngka;
			}
		}
		System.out.println("Nilai terbesar adalah: " + max);
	}
}
