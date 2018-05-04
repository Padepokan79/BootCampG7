/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Rizaldi03{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		String air;
		double o2, udara, totUdara;
		int suhu, minSuhu, maxSuhu, age, minAge, maxAge;
		boolean allowed, yep, nope;

		minSuhu = 32;
		maxSuhu = 42;
		minAge = 45;
		maxAge = 200;

		System.out.println( "Pencarian planet baru" );
		System.out.println();

		System.out.print( "Terdapat air? (Y/T): " );
		air = inputKey.next();
		yep = air.equals("Y");
		nope = air.equals("T");

		System.out.print( "Total volume udara : " );
		totUdara = inputKey.nextInt();

		System.out.print( "Persentase O2 : " );
		o2 = inputKey.nextInt();

		udara = (o2/100) * totUdara;

		System.out.print( "Temperatur lingkungan : " );
		suhu = inputKey.nextInt();

		System.out.print( "Usia Planet : " );
		age = inputKey.nextInt();

		allowed = (yep == true && (o2 >= udara) && (suhu >= minSuhu && suhu <= maxSuhu) && (age >= minAge && age <= maxAge));

		System.out.println();
		System.out.println( "Layak ditinggali " + allowed );

	}
}
