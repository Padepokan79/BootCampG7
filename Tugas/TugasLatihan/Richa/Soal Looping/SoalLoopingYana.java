/* 
Created by  		: Richa Fitria
Date/hour			: 20 Mei 2018/ 06.26 PM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingYana {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();

		int budi, tono, man, tambahBudi, tambahMan, tambahTono1, tambahTono2, waktu;

		budi = 200;
		tambahBudi = 20;//per menit
		man = 10;
		tambahMan = 40; //per menit
		tono = 500;
		tambahTono1 = rand.nextInt (6) + 1; // per menit
		waktu = 1; //dalam menit

		do {
			System.out.println("Menit ke-" + waktu);
			budi = budi + tambahBudi;
			man = man + tambahMan;
			
			if (man> budi) {
			tono = budi + tono;
			} 
			tono = tono + tambahTono1;

			System.out.println("Kelereng Budi " + budi + " buah");
			System.out.println("Kelereng Man " + man + " buah");
			System.out.println("Kelereng Tono " + tono + " buah");
			System.out.println("------------------------------------");
			waktu++;
		} while (man < budi );

		tambahTono2 = rand.nextInt (6) + 1; // per menit
		
		do {
			System.out.println("Menit ke-" + waktu);

			budi = budi + tambahBudi;
			man = man + tambahMan;
			tono = tono + tambahTono2;

			System.out.println("Kelereng Budi " + budi + " buah");
			System.out.println("Kelereng Man " + man + " buah");
			System.out.println("Kelereng Tono " + tono + " buah");
			System.out.println("------------------------------------");
			waktu++;
		} while (man<tono);

		System.out.println("Jumlah kelereng Tono terkejar oleh pada menit ke " + (waktu-1));
	}
}



/*

1. Saat ini Budi mempunyai 200 butir kelereng, dan akan bertambah 20 butir per menit
Sedangkan saat ini Man mempunyai 10 butir kelereng dan akan bertambah 40 butih
Pada waktu yang sama Tono memiliki kelereng 500 butir dan setiap menit akan bertambah sebanyak nilai dadu yang dikocok Tono.
Pada saat jumlah kelereng Man mengejar jumlah kelereng Budi, kelereng Tono juga akan bertambah sebanyak jumlah kelereng Budi saat itu. 
Pada menit berapakah jumlah kelereng Man akan mengejar 
jumlah kelereng Tono?

-Tono mengocok dadu sebanyak 2 kali.
-pertama saat kelerengnya berjumlah 500 butir,
-kedua saat setelah jumlah kelereng Man mengejar jumlah kelereng Budi
*gunakan random dan perulangan dowhile

*/

		


