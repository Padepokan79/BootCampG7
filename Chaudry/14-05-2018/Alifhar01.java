/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Alifhar01{
	public static void main(String[] args){
		int age, experience;
		boolean hasil;
		double cute, fast;

		Scanner key = new Scanner(System.in);

		System.out.print("Seberapa cepat anda dalam bekerja? (skala 0.0 - 10.0) ");
		fast 	= key.nextDouble();

		System.out.print("Seberapa menarik diri anda? (skala 0.0 - 10.0) ");
		cute 	= key.nextDouble();

		System.out.print("Berapa Usia anda saat ini? ");
		age 	= key.nextInt();

		System.out.print("Berapa lama pengalaman yang anda miliki? ");
		experience 	= key.nextInt();


		hasil 	= ( fast > 8.0 && cute >= 9.0 && (age > 30 || experience >= 3) );

		System.out.print("Apa anda sesuai dengan kriteria kami? " + hasil);
		 
	}
}