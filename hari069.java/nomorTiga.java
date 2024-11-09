import java.util.Scanner;

public class NomorTiga {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan bilangan pertama: ");
		short bil1 = in.nextShort();
		System.out.print("Masukkan bilangan kedua: ");
		short bil2 = in.nextShort();
		if(bil1<0 && bil2 <0){
			System.out.println("Kedua bilangan negatif");
		} else if (bil1>0 && bil2>0){
			System.out.println("Kedua bilangan positif");
		} else {
			System.out.println("Salah satu bilangan bernilai negatif");
		}
	}
}
