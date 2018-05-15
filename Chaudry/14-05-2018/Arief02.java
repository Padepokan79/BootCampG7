/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Arief02{
	public static void main(String[] args){
		
		int ram;
		double procesor, hdd;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Berapa jumlah RAM laptop? ");
		ram 	= key.nextInt();

		System.out.print("Berapa kapasitas HDD? (dalam Terabyte) ");
		hdd 	= key.nextInt();

		System.out.print("Berapa kecepatan processor? ");
		procesor 	= key.nextDouble();

		hasil 	= ( ram >= 8 && hdd >= 1 && (procesor > 3.0 && procesor < 4.5) );

		System.out.print("Apakah spesifikasi Laptop sesuai? " + hasil);
		 
	}
}