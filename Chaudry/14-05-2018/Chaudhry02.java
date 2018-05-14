/*
	DATA CREATED 	: 13 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Chaudhry02{
	public static void main(String[] args){
		
		int luasTanah, jmlKamar, jarak, jmlLantai;
		String warnaToilet, taman;
		boolean hasil;
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		System.out.print("Berapa luas tanah rumah? (dalam m2) ");
		luasTanah 	= key.nextInt();

		System.out.print("Berapa jumlah kamar tidur? ");
		jmlKamar 	= key.nextInt();

		System.out.print("Apa warna kamar mandinya? ");
		warnaToilet = key2.nextLine();

		System.out.print("Apakah terdapat taman? (ya/tidak) ");
		taman 	= key.next();

		System.out.print("Berapa jarak menuju komplex? (dalam meter) ");
		jarak 	= key.nextInt();

		System.out.print("Berapa jumlah lantai rumah? ");
		jmlLantai 	= key.nextInt();

		hasil 	= ( luasTanah >= 100 && jmlKamar >= 2 && warnaToilet.equals("biru") && taman.equals("ya") && jarak < 100 || jmlLantai >= 1 );

		System.out.println("Apa rumah yang bersangkutan sesuai? " + hasil);
		 
	}
}