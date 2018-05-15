/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Andrian02{
	public static void main(String[] args){
		String gender, ktp;
		int age, income, tinggi;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("Berapa usia anda saat ini? ");
		age 	= key.nextInt();

		System.out.print("Apakah anda memiliki KTP? (ya/tidak) ");
		ktp 	= key.next();

		System.out.print("Berapa nominal penghasilan anda? ");
		income 	= key.nextInt();

		System.out.print("Berapa tinggi badan anda sekarang? ");
		tinggi 	= key.nextInt();

		hasil 	= ( (gender.equals("pria") || gender.equals("wanita")) && age >= 25 && ktp.equals("ya") && income > 3000000 && ((gender.equals("pria") && tinggi > 160) || (gender.equals("wanita") && tinggi >= 153)) );

		System.out.print("Apa anda sesuai dengan kriteria ? " + hasil);
		 
	}
}