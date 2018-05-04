/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Andrian02{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		String gender, ktp;
		int age, minAge, salary, maxSalary, height, maleHeight, femaleHeight;
		boolean allowed, punyaKtp, male, female;

		maleHeight = 160;
		femaleHeight = 153;
		maxSalary = 3000000;
		minAge = 25;

		System.out.println( "TRIANGLE" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Pria\" / \"Wanita\" ) : " );
		gender = inputKey.next();
		male  = gender.equals("Pria");
		female  = gender.equals("Wanita");

		System.out.print( "Usia: " );
		age = inputKey.nextInt();

		System.out.print( "Penghasilan: " );
		salary = inputKey.nextInt();

		System.out.print( "Memiliki KTP? (Ya/Tidak): " );
		ktp = inputKey.next();
		punyaKtp  = ktp.equals("Ya");

		System.out.print( "Tinggi Badan: " );
		height = inputKey.nextInt();

		allowed = ((male == true && height >= maleHeight) || (female == true && height >= femaleHeight)) && (salary >= maxSalary) && (age >= minAge);

		System.out.println( "Bolehkah tamu Memasuki TRIANGLE? " + allowed );

	}
}