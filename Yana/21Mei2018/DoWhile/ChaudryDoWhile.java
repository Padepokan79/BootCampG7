/*
Creted by	: Yana
Time		: 19 Mei 2018 17.23
*/

import java.util.Scanner;
import java.util.Random;

public class ChaudryDoWhile{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		char hurufRandom;
		String hurufTebak;
		int ronde=1, nyawaPlayer, nyawaKomputer, kesempatan, menangRonde, selisih;

		nyawaPlayer		= 1;
		nyawaKomputer	= 1;
		menangRonde 	= 0;
		do{
			System.out.println();
			System.out.println("Ronde "+ronde);
			System.out.println();

			for (kesempatan = 0; kesempatan < 2; kesempatan++) {
				hurufRandom = (char) (random.nextInt(26)+'A');
				System.out.println("Random "+hurufRandom);
				System.out.println("Nyawa Player: "+nyawaPlayer);
				System.out.println("Nyawa Komputer: "+nyawaKomputer);
				System.out.print("Masukkan huruf tebakan: ");
				hurufTebak = keyboard.next();
				if (hurufTebak.charAt(0) == hurufRandom) {
					System.out.println("BENAR");
					nyawaPlayer 	= nyawaPlayer + 2;
					kesempatan 		= 2;
					menangRonde		= menangRonde + 1;
				}
				else{
					System.out.println("SALAH");
					nyawaPlayer 	= nyawaPlayer - 1;
					nyawaKomputer	= nyawaKomputer + 2;
				}
			}			

			selisih = nyawaPlayer - nyawaKomputer;
			ronde++;
		}while(ronde <= 20 && selisih < 6);

		System.out.println();
		System.out.println("Jumlah Nyawa Player 	: "+nyawaPlayer);
		System.out.println("Jumlah Nyawa Komputer 	: "+nyawaKomputer);
		System.out.println();
		if (ronde <= 8) {
			System.out.println("CHEATER");			
		}
		else if (ronde > 8 && ronde <= 11) {
			System.out.println("NICE");			
		}
		else if (ronde > 11) {
			System.out.println("NOOB");			
		}
	}
}
/*
1. Micheal sedang memainkan sebuah permainan classik tebak huruf. 
Dimana Pemain dinyatakan menang jika salah satu pemain memiliki nyawa mencapai 16.
 - nyawa awal yang tersedia : - Player 1 nyawa
			      - Komputer 1 nyawa 
 - ada 2 kesempatan bermain dalam 1 ronde
 - max 20 ronde, dan pemain dinyatakan menang.
 - jika tebakan player sama dengan tebakan komputer, maka player mendapatkan 2 nyawa
 - jika tebakan player salah, maka nyawa player berkurang 1 dan komputer bertambah 2 nyawa
 
 - jika pemain palyer menang pada ronde <= 8 --> "CHEATER"
   jika pemain palyer menang pada ronde > 8 && <= 11  --> "NICE"
   jika pemain palyer menang pada ronde > 11 --> "NOOB"
 
 - jika selisih nyawa player dengan nyawa komputer = 6, maka permainan dimenangkan oleh 
 pemain yang memiliki nyawa lebih unggul
*/