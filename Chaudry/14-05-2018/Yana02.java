/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Yana02{
	public static void main(String[] args){
		
		String gender, akreditas, pendidikan;
		double ipkS1, ipkS2, rataan;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("Pendidikan terakhir? (s1/s2) ");
		pendidikan 	= key.next();

		System.out.print("IPK S1? ");
		ipkS1 	= key.nextDouble();

		System.out.print("IPK S2? ");
		ipkS2 	= key.nextDouble();

		System.out.print("Akreditas? (a/b/c) ");
		akreditas 	= key.next();

		rataan 	= (ipkS1 + ipkS2) / 2;
		hasil 	=  ( (gender.equals("pria") || gender.equals("wanita")) && pendidikan.equals("s2") && rataan >= 3.25 && (akreditas.equals("b") || akreditas.equals("a")) );

		System.out.print("Apakah anda termasuk kriteria kami? " + hasil);
		 
	}
}