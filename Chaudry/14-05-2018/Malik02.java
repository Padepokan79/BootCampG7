/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Malik02{
	public static void main(String[] args){
		
		String gender, skin;
		int income, cute, age;
		boolean hasil;
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("Berapa nominal penghasilan anda? ");
		income 	= key.nextInt();

		System.out.print("Seberapa menarik diri anda? skala 0 - 10 ");
		cute 	= key.nextInt();

		System.out.print("Berapa usia anda sekarang? ");
		age 	= key.nextInt();

		System.out.print("Apa warna kulit anda? ");
		skin 	= key2.nextLine();

		hasil 	= (gender.equals("cowo") && income >= 10000000 && cute >= 0 && age < 30 && skin.equals("putih")) || (gender.equals("cewe") && cute >= 7 && (income >= 10000000 || income < 10000000) && skin.equals("putih"));

		System.out.print("Apakah anda termasuk kriteria kami? " + hasil);
		 
	}
}