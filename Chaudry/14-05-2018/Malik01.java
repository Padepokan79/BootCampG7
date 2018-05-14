/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Malik01{
	public static void main(String[] args){
		
		String gender, skin;
		int tinggi, cute;
		boolean hasil;
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("Berapa tinggi badan anda sekarang? ");
		tinggi 	= key.nextInt();

		System.out.print("Seberapa tampan diri anda? skala 0 - 10 ");
		cute 	= key.nextInt();

		System.out.print("Apa warna kulit anda? ");
		skin 	= key2.nextLine();







		hasil 	= ( gender.equals("pria") && tinggi >= 175 && cute >= 7 );

		System.out.println("==================================");
		System.out.println("         CALON MODEL BARU         ");
		System.out.println("==================================");
		System.out.println();
		System.out.println("Tinggi badan : " + tinggi);
		System.out.println("Skala penampilan : " + cute);
		System.out.println("Warna kulit : " + skin);
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Apakah anda diterima? " + hasil);
		System.out.println("----------------------------------");
		 
	}
}