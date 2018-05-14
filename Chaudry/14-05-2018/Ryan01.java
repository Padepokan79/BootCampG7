/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Ryan01{
	public static void main(String[] args){
		
		String histori;
		int membaca, usia;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Seberapa besar anda pandai membaca? skala 0 - 10 ");
		membaca 	= key.nextInt();

		System.out.print("Berapa usia anda sekarang? ");
		usia 	= key.nextInt();

		System.out.print("Apakah anda pernah belajar di TK? (ya/tidak) ");
		histori 	= key.next();

		hasil 	= (membaca > 7 && usia >= 7 && (histori.equals("ya") || membaca == 10 ));

		System.out.print("Apakah anda termasuk kriteria kami? " + hasil);
		 
	}
}