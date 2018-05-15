/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Andrian01{
	public static void main(String[] args){
		String ketTeman, gender;
		int hadiah;
		double cute;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Apa anda teman sekolah Nesa? (ya/tidak) ");
		ketTeman 	= key.next();

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("Berapa nominal hadiah yang anda bawa? ");
		hadiah 	= key.nextInt();

		System.out.print("Seberapa menarik diri anda? ");
		cute 	= key.nextDouble();

		hasil 	= ( ketTeman.equals("ya") && (gender.equals("pria") || gender.equals("wanita")) && hadiah >= 5000000 && cute >= 8.5 ) || ( cute >= 0.0 && hadiah > 20000000 );

		System.out.print("Apa anda sesuai dengan kriteria ? " + hasil);
		 
	}
}