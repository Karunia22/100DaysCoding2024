public class NomorEmpat{
	public static void main(String[] args){
		short angka = 0;
		boolean kondisi = true;
		while(kondisi){
			angka+=7;
			System.out.print(angka + " ");
			switch(angka) {
				case 70 : 
				kondisi = false;
				break;
				default :
				continue;
			}
		}
	}
}
