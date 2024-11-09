import java.util.Scanner;

public class NomorEnam{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan sebuah bilangan: ");
		int bil = in.nextInt();
		String hasil = (bil > 0)? "Bilangan ini positif" : (bil<0)? "Bilangan ini negatif" : "Bilangan ini nol";
		System.out.println(hasil);
	}
}
