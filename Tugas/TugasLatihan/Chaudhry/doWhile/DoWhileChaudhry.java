/*
	DATE CREATED : 19 MEI 2018
	TIME CREATED : 08.30 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	1. Micheal sedang memainkan sebuah permainan classik tebak huruf. Dimana Pemain dinyatakan menang jika salah satu pemain memiliki nyawa mencapai 16.
 - nyawa awal yang tersedia : - Player 1 nyawa
			      - Komputer 1 nyawa 
 - ada 2 kesempatan bermain dalam 1 ronde
 - max 20 ronde, dan pemain dinyatakan menang.
 - jika tebakan player sama dengan tebakan komputer, maka player mendapatkan 2 nyawa
 - jika tebakan player salah, maka nyawa player berkurang 1 dan komputer bertambah 2 nyawa
 
 - jika pemain palyer menang pada ronde <= 8 --> "CHEATER"
   jika pemain palyer menang pada ronde > 8 && <= 11  --> "NICE"
   jika pemain palyer menang pada ronde > 11 --> "NOOB"
 
 - jika selisih nyawa player dengan nyawa komputer = 6, maka permainan dimenangkan oleh pemain yang memiliki nyawa lebih unggul
*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileChaudhry{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand 	 = new Random();
		char huruf;
		int kesempatan, rondeMax, selisih, benarPlayer, benarKomputer, angka, rondeAwal, angkaRound, angkaRand, round, benar, salah;
		String inputHuruf;
		kesempatan = 2;
		benarPlayer = benarKomputer = rondeAwal = angkaRound = 1;
		selisih = 0;
		rondeMax  = 20;


		while(rondeAwal <= rondeMax && benarPlayer < 16 && benarKomputer < 16 && ( ((benarPlayer - benarKomputer) != 6 && (benarPlayer - benarKomputer) <= 6 && (benarPlayer - benarKomputer) >= 0) || ((benarKomputer - benarPlayer) != 6 && (benarKomputer - benarPlayer) <= 6 && (benarKomputer - benarPlayer) >= 0) ) ){
			System.out.println("");
			System.out.println("Ronde : "+(angkaRound++));
			angka = 1;
			huruf = (char) (rand.nextInt(26)+'A');
			System.out.println("Huruf : "+huruf);

			while(angka <= kesempatan){

				System.out.print("Tebak huruf Alphabet :   ");
				inputHuruf 	= keyboard.next();

				if (inputHuruf.charAt(0) == huruf) {
					System.out.println("=========================");
					System.out.println("TEBAKAN BENAR :)");
					angka = kesempatan;
					benarPlayer += 2;
					System.out.println("Nyawa anda : " + benarPlayer);
					System.out.println("Nyawa PC   : " + benarKomputer);
					System.out.println("=========================");
				}
				else{
					if (angka == kesempatan) {
						System.out.println("=========================");
						System.out.println("TEBAKAN SALAH!!");
						benarPlayer -= 1;
						benarKomputer += 2;
						System.out.println("Nyawa anda : "+benarPlayer);
						System.out.println("Nyawa PC   : "+ benarKomputer);	
						System.out.println("=========================");
					}else{
						System.out.print("\t\t\t\t-- Coba lagi --\n");
					}
				}

				angka = angka + 1;
			}

			if (benarPlayer < 0) {
				System.out.println("Anda sudah tidak memiliki nyawa :( ");
				System.out.println("Dan dinyatakan kalah :( ");
			}

			if ( (benarPlayer - benarKomputer) >= 6 || ( (benarKomputer - benarPlayer) >= 6 && benarPlayer >= 0 ) ) {
				System.out.println("");
				if (benarPlayer > benarKomputer) {
					if (rondeAwal <= 8) {
						System.out.println("SELAMAT!! Anda Memenangkan permainan");
						System.out.println("Selisih    : "+(benarPlayer - benarKomputer)+" poin");
						System.out.println("Keterangan : CHEATER");
					}
					else if (rondeAwal > 8 && rondeAwal <= 11) {
						System.out.println("SELAMAT!! Anda Memenangkan permainan");	
						System.out.println("Selisih    : "+(benarPlayer - benarKomputer)+" poin");
						System.out.println("Keterangan : NICE");
					}
					else if (rondeAwal > 11) {
						System.out.println("SELAMAT!! Anda Memenangkan permainan");
						System.out.println("Selisih    : "+(benarPlayer - benarKomputer)+" poin");
						System.out.println("Keterangan : NOOB");
					}
				}else{
					System.out.println("Komputer memenangkan permainan :( ");
					System.out.println("Selisih    : "+(benarKomputer - benarPlayer)+" poin");
					System.out.println("Dan anda dinyatakan kalah :( ");
				}
			}

			if (rondeAwal >= 20) {
				System.out.println("");
				if (benarPlayer > benarKomputer) {
					System.out.println("RONDE BERAKHIR");
					System.out.println("SELAMAT!! Anda Memenangkan permainan");
					System.out.println("Keterangan : NOOB");
				}
				else if (benarKomputer > benarPlayer) {
					System.out.println("RONDE BERAKHIR");
					System.out.println("Komputer Memenangkan permainan");
					System.out.println("Anda dinyatakan kalah :(");
				}
				else if (benarPlayer == benarKomputer) {
					System.out.println("RONDE BERAKHIR");
					System.out.println("Permainan SERI :)");
				}
			}

			if (benarPlayer >= 16 || benarKomputer >= 16) {
				System.out.println("");

				if (benarPlayer >= 16) {
					if (rondeAwal <= 8) {
						System.out.println("Point mencapai 16");
						System.out.println("SELAMAT!! Anda Memenangkan permainan");
						System.out.println("Keterangan : CHEATER");
					}
					else if (rondeAwal > 8 && rondeAwal <= 11) {
						System.out.println("Point mencapai 16");
						System.out.println("SELAMAT!! Anda Memenangkan permainan");	
						System.out.println("Keterangan : NICE");
					}
					else if (rondeAwal > 11) {
						System.out.println("Point mencapai 16");
						System.out.println("SELAMAT!! Anda Memenangkan permainan");
						System.out.println("Keterangan : NOOB");
					}
				}else{
					System.out.println("Point mencapai 16");
					System.out.println("Komputer memenangkan permainan :( ");
					System.out.println("Dan anda dinyatakan kalah :( ");
				}
			}

			rondeAwal = rondeAwal + 1;
		}

			


	}
}