import java.util.Scanner;

public class NomrLima {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan sebuah bilangan: ");
		int angka = in.nextInt();
		
		switch(angka){
			case 1 :
			System.out.println("Hari petama adalah hari senin");
			break;
			case 2 :
                        System.out.println("Hari kedua adalah hari selasa");
                        break;
			case 3 :
                        System.out.println("Hari ketiga adalah hari rabu");
                        break;
			case 4 :
                        System.out.println("Hari keempat adalah hari kamis");
                        break;
			case 5 :
                        System.out.println("Hari kelima adalah hari jumat");
                        break;
			case 6 :
                        System.out.println("Hari keenam adalah hari sabtu");
                        break;
			case 7 :
                        System.out.println("Hari ketujuh adalah hari minggu");
                        break;
			default :
			System.out.println("Input tidak valid");
		}
	}
}
