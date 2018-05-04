/*
Create by	: Yana
Time 		: 3 Mei 2018 13.42
Update by	:
*/

import java.util.Scanner;

public class RichaBoolean2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		teman, pelanggaran;
		String	ramah, nama;
		boolean hasil;


		System.out.println("Hai kamu ingin tahu kan bagaimana orang menilaimu?");
		System.out.println("Isi penilaian di bawah ini ya :)");
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		System.out.print("Nama: ");
		nama		= keyboard.next();
		System.out.print("Jumlah teman: ");
		teman		= keyboard.nextInt();
		System.out.print("Jumlah pelanggaran kriminal: ");
		pelanggaran	= keyboard.nextInt();
		System.out.print("Murah senyum? \"YA\"/\"TIDAK\": ");
		ramah		= keyboard.next();

		hasil	= ( ( teman >= 13 && pelanggaran <= 7 && ramah.equals("Y") ) ||
				  ( teman >= 13 && pelanggaran <= 7 ) || ( teman >= 13 && ramah.equals("Y") ) ||
				  ( pelanggaran <= 7 && ramah.equals("Y") ) );

		System.out.println();
		System.out.println("Baiklah,");
		System.out.println("Apakah " +nama+ " adalah orang yang baik? " +hasil); 	
		System.out.println("Terima kasih! teruslah, menjadi orang yang baik yaa");	

	}
}