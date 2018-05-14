/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Ryan02{
	public static void main(String[] args){
		
		String gender;
		int usia, tinggi;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("Berapa usia anda sekarang? ");
		usia 	= key.nextInt();

		System.out.print("Berapa tinggi badan anda? ");
		tinggi 	= key.nextInt();

		hasil 	= (gender.equals("pria") && usia > 12 && tinggi > 150) || (gender.equals("wanita") && usia > 12 && tinggi > 145);

		System.out.print("Apakah anda termasuk kriteria kami? " + hasil);
		 
	}
}