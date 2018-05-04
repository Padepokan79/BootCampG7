/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Rizaldi02{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		String makan, minum, berak;
		boolean allowed, rumput, dedak, hujan, pasir;

		System.out.println( "Kebiasaan si kucing sasuke" );
		System.out.println();

		System.out.print( "Apa yang dimakan sasuke : " );
		makan = inputKey.next();
		rumput = makan.equals("rumput");
		dedak = makan.equals("dedak");

		System.out.print( "Air apa yang diminum  sasuke : " );
		minum = inputKey.next();
		hujan = minum.equals("hujan");

		System.out.print( "Dimana sasuke berak : " );
		berak = inputKey.next();
		pasir = berak.equals("pasir");

		allowed = ((rumput == true || dedak == true) && (hujan == true && pasir == true));

		System.out.println();
		System.out.println( "Bisakah sasuke tidur? " + allowed );

	}
}
