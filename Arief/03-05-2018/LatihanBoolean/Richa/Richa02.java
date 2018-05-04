/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Richa02{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		int friend, crime, minFriend, maxCrime;
		String smile, name;
		boolean allowed, yep, nope;

		minFriend = 13;
		maxCrime = 7;

		
		System.out.println("Hai kamu ingin tahu kan bagaimana orang menilaimu?");
		System.out.println("Isi penilaian di bawah ini ya :)");
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

		System.out.print( "Nama : " );
		name = inputKey.next();

		System.out.print( "Berapa teman baik yang kamu punya, " + name + "? " );
		friend = inputKey.nextInt();

		System.out.print( "Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? kalo iya, berapa kali? " );
		crime = inputKey.nextInt();

		System.out.print( "Menurutmu kamu murah senyum atau tidak? (Ya/Tidak) " );
		smile = inputKey.next();
		yep = smile.equals("Ya");
		nope = smile.equals("Tidak");

		allowed = ((friend >= minFriend) && (crime <= maxCrime) && yep == true);

		System.out.println("Baiklah,");
		System.out.println("==================================================================");
		System.out.println( "Apakah " + name + " adalah orang yang baik? " + allowed);

	}
}
