/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 10:32AM

Soal :
Batu, Kertas, Gunting, Kadal, Spock.

Ini hanyalah versi lain dari Gunting Gunting Kertas, perbedaannya adalah bahwa ada 2 simbol lain untuk dimainkan,
yang disebut "Lizard", dan "Spock".
Ada dua cara untuk MENGGUNAKAN simbol sebagai senjata, dan ada dua cara untuk DIHAPUS oleh simbol lain.
Anda dapat membaca aturan di bawah ini. Dua pemain sudah cukup (Player & Enemy).
Game, bermain untuk 3 pertandingan, setiap pertandingan memiliki 5 putaran, pemain bisa memenangkan 1 Game jika pemain menang 
setidaknya (> =) 4 putaran.

ATURAN
Simbol 1> Simbol 1 ATTACK Symmbol 2

MENANGKAN KONDISI
Rock> Rock crush Lizard, Rock crush Scissors
Kertas> Kertas mencakup Batu, Kertas menyangkal Spock
Gunting> Gunting Potong Kertas, Gunting Memutuskan Kadal
Spock> Spock menguapkan Rock, Spock menghancurkan Gunting
Kadal> Kadal racun Spock, Kadal memakan Kertas
Catatan Lain
"GODSPEED" memenangkan 3 Game
"Palladins" memenangkan 2 Game
"Knight" memenangkan 1 pertandingan
"Enthusiast" memenangkan 10 putaran
"Peserta" menang 8 putaran
"Ingin-tahu saja" tidak pernah menang

*/
import java.util.Scanner;
import java.util.Random;
public class SoalWhileArief{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int banyakPertandingan, pertandingan, putaran, banyakPutaran, komputerPilih, playerPilih, poinKomp, poinPlayer;
		int poinGame, poinMenang, satu, dua, tiga, empat, lima, delapan, sepuluh, nol;

		banyakPertandingan	= 3; 	satu 	= 1; 	lima 	= 5;
		pertandingan 		= 1;	dua 	= 2; 	delapan = 8;
		poinGame 			= 0; 	tiga 	= 3; 	sepuluh = 10;
		poinMenang 			= 0;	empat 	= 4;	nol 	= 0;

		while( pertandingan <= banyakPertandingan ){
			System.out.println();
			System.out.println();
			System.out.println("GAME ke "+pertandingan);
			System.out.println("-------------------");

			putaran 			= satu;
			banyakPutaran 		= lima;
			poinKomp 			= nol;
			poinPlayer 			= nol;
			while( putaran <= banyakPutaran ){
				System.out.println();
				System.out.println();
				System.out.println("Putaran ke "+putaran);
				System.out.println();
				System.out.println("Komputer memilih");
				komputerPilih = random.nextInt(lima)+satu;
				System.out.println("==================="); 
				System.out.println("Pilih main :\n1.Batu 2.Kertas 3.Gunting 4.Kadal 5.Spock ");
				System.out.print("Masukan angka pilihan : ");
				playerPilih = scan.nextInt();
				System.out.println("==================="); 
				System.out.println("Simbol komputer : "+komputerPilih);
				System.out.println("Simbol player   : "+playerPilih);
				System.out.println();

				if ( komputerPilih == playerPilih ) {
				 	System.out.println("HASIL SERI");
				 	System.out.println("================");
				 	poinPlayer += nol;
				 	poinKomp += nol;
				 }else if ( (komputerPilih == satu && playerPilih == empat) || ( komputerPilih == satu && playerPilih == tiga) ) {
				 	System.out.println("Komputer Menang atas Batu");
				 	System.out.println("================");
				 	poinKomp += satu;
				 }else if ( (playerPilih == satu && komputerPilih == empat) || ( playerPilih == satu && komputerPilih == tiga) ) {
				 	System.out.println("Player Menang atas Batu");
				 	System.out.println("================");
				 	poinPlayer += satu;
				 	poinMenang += satu;
				 }else if ( (komputerPilih == dua && playerPilih == satu) || ( komputerPilih == dua && playerPilih == lima) ) {
				 	System.out.println("Komputer Menang atas Kertas");
				 	System.out.println("================");
				 	poinKomp += satu;
				 }else if ( (playerPilih == dua && komputerPilih == satu) || ( playerPilih == dua && komputerPilih == lima) ) {
				 	System.out.println("Player Menang atas Kertas");
				 	System.out.println("================");
				 	poinPlayer += satu;
				 	poinMenang += satu;
				 }else if ( (komputerPilih == tiga && playerPilih == dua) || ( komputerPilih == tiga && playerPilih == empat) ) {
				 	System.out.println("Komputer Menang atas Gunting");
				 	System.out.println("================");
				 	poinKomp += satu;
				 }else if ( (playerPilih == tiga && komputerPilih == dua) || ( playerPilih == tiga && komputerPilih == empat) ) {
				 	System.out.println("Player Menang atas Gunting");
				 	System.out.println("================");
				 	poinPlayer += satu;
				 	poinMenang += satu;
				 }else if ( (komputerPilih == lima && playerPilih == satu) || ( komputerPilih == lima && playerPilih == tiga) ) {
				 	System.out.println("Komputer Menang atas Spock");
				 	System.out.println("================");
				 	poinKomp += satu;
				 }else if ( (playerPilih == lima && komputerPilih == satu) || ( playerPilih == lima && komputerPilih == tiga) ) {
				 	System.out.println("Player Menang atas Spock");
				 	System.out.println("================");
				 	poinPlayer += satu;
				 	poinMenang += satu;
				 }else if ( (komputerPilih == empat && playerPilih == lima) || ( komputerPilih == empat && playerPilih == dua) ) {
				 	System.out.println("Komputer Menang atas Kadal");
				 	System.out.println("================");
				 	poinKomp += satu;
				 }else if ( (playerPilih == empat && komputerPilih == lima) || ( playerPilih == empat && komputerPilih == dua) ) {
				 	System.out.println("Player Menang atas Kadal");
				 	System.out.println("================");
				 	poinPlayer += satu;
				 	poinMenang += satu;
				 }
				 putaran++;
			}
			if ( poinPlayer >= empat ) {
				System.out.println("KAMU MEMENANGKAN GAME "+pertandingan);
				poinGame += satu;
			}
			pertandingan++;
		}
		if ( poinGame == tiga ) {
			System.out.println("GODSPEED");
		}else if ( poinGame == dua ) {
			System.out.println("PALLADINS");
		}else if ( poinGame == satu ) {
			System.out.println("KNIGHT");
		}else if ( poinMenang == sepuluh ) {
			System.out.println("ENTHUSIAST");
		}else if ( poinMenang == delapan ) {
			System.out.println("PESERTA");
		}else if ( poinMenang < delapan ) {
			System.out.println("INGIN TAHU SAJA");
		}
	}
}