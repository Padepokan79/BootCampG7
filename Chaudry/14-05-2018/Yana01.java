/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Yana01{
	public static void main(String[] args){
		
		String gender, pendidikan, keahlianJava, keahlianPhp, keahlianAngular, pengalaman;
		int usia;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("Berapa usia anda sekarang? ");
		usia 	= key.nextInt();

		System.out.print("Pendidikan terakhir anda? (s1/s2/s3) ");
		pendidikan 	= key.next();

		System.out.print("Keahlian Java? (ya/tidak) ");
		keahlianJava 	= key.next();

		System.out.print("Keahlian angularJS? (ya/tidak) ");
		keahlianAngular 	= key.next();

		System.out.print("Keahlian PHP? (ya/tidak) ");
		keahlianPhp 	= key.next();

		System.out.print("Apakah anda memiliki pengalaman? (ya/tidak) ");
		pengalaman 	= key.next();

		hasil 	= (gender.equals("pria") && usia >= 23 && (pendidikan.equals("s1") || pendidikan.equals("s2") || pendidikan.equals("s1")) && ( (keahlianJava.equals("ya") && keahlianAngular.equals("ya")) || keahlianJava.equals("ya") && keahlianPhp.equals("ya") ) && pengalaman.equals("ya") );

		System.out.print("Apakah anda termasuk kriteria kami? " + hasil);
		 
	}
}