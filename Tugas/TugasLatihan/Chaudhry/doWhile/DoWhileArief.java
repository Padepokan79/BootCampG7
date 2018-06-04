/*
	DATE CREATED : 20 MEI 2018
	TIME CREATED : 08.30 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	Batu, Kertas, Gunting, Kadal, Spock.

	Ini hanyalah versi lain dari Gunting Gunting Kertas, perbedaannya adalah bahwa ada 2 simbol 
	lain untuk dimainkan, yang disebut "Lizard", dan "Spock".
	Ada dua cara untuk MENGGUNAKAN simbol sebagai senjata, dan ada dua cara untuk DIHAPUS oleh 
	simbol lain. Anda dapat membaca aturan di bawah ini. Dua pemain sudah cukup (Player & Enemy).
	Game, bermain untuk 3 pertandingan, setiap pertandingan memiliki 5 putaran, pemain bisa 
	memenangkan 1 Game jika pemain menang setidaknya (> =) 4 putaran.

											ATURAN
	Simbol 1> Simbol 1 ATTACK Symmbol 2

	MENANGKAN KONDISI
	Rock> Batu menghancurkan Lizard, Rock menghancurkan Scissors
	Paper> Kertas mencakup Rock, Kertas menyangkal Spock
	Scissors> Gunting Potong Paper, Gunting Memutuskan Lizard
	Spock> Spock menguapkan Rock, Spock menghancurkan Scissors
	Lizard> Kadal racun Spock, Kadal memakan Paper
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
public class DoWhileArief{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int pertandingan, delapan, duabelas, sepuluh, gamePlayer, satu, dua, tiga, empat, lima, gameKomp, putaran, pertandinganAwal, putaranAwal, inputPilihan, angkaRand, menangPlayer, menangKomp;

		pertandinganAwal = satu = 1;
		delapan = 8;
		duabelas = 12;
		sepuluh = 10;
		dua = 2;
		empat = 4;
		pertandingan = tiga = 3;
		putaran = lima = 5;
		menangPlayer = menangKomp = gameKomp = gamePlayer = 0;


		while(pertandinganAwal <= pertandingan){
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Pertandingan : "+(pertandinganAwal));
			System.out.println("==================================");
			System.out.println("");
			System.out.println("");

			putaranAwal = 1;
			while(putaranAwal <= putaran){
				System.out.println("");
				System.out.println("Ronde : "+(putaranAwal));
				System.out.println("==================================");
				System.out.println("Komputer Pick");
				System.out.println("==================================");
				System.out.println("Kamu Pick ------------------------");
				System.out.println("Pilihan   : ");
				System.out.print("1. Rock\t\t2. Paper\t3. Scissors\n4. Lizard\t5. Spock\n");
				System.out.print("Masukan Pilihan | 1/2/3/4/5 | : ");
				inputPilihan = keyboard.nextInt();
				System.out.println("==================================");

				angkaRand = rand.nextInt(lima) + satu;
				System.out.println("Komputer Simbol   : "+angkaRand);
				System.out.println("Kamu Simbol       : "+inputPilihan);
				System.out.println("");

				if (angkaRand == inputPilihan) {
					System.out.println("Hasil Seri");
				}
				else if ( (angkaRand == satu && inputPilihan == empat) || (angkaRand == satu && inputPilihan == tiga) ) {
					System.out.println("Komputer memenangkan ronde ini");
					menangKomp += satu;
				}
				else if ( (angkaRand == empat && inputPilihan == satu) || (angkaRand == tiga && inputPilihan == satu) ) {
					System.out.println("Kamuuu memenangkan ronde ini");
					menangPlayer += satu;
				}
				else if ( (angkaRand == dua && inputPilihan == satu) || (angkaRand == dua && inputPilihan == lima) ) {
					System.out.println("Komputer memenangkan ronde ini");
					menangKomp += satu;
				}
				else if ( (angkaRand == satu && inputPilihan == dua) || (angkaRand == lima && inputPilihan == dua) ) {
					System.out.println("Kamuuu memenangkan ronde ini");
					menangPlayer += satu;
				}
				else if ( (angkaRand == tiga && inputPilihan == dua) || (angkaRand == tiga && inputPilihan == empat) ) {
					System.out.println("Komputer memenangkan ronde ini");
					menangKomp += satu;
				}
				else if ( (angkaRand == dua && inputPilihan == tiga) || (angkaRand == empat && inputPilihan == tiga) ) {
					System.out.println("Kamuuu memenangkan ronde ini");
					menangPlayer += satu;
				}
				else if ( (angkaRand == lima && inputPilihan == satu) || (angkaRand == lima && inputPilihan == tiga) ) {
					System.out.println("Komputer memenangkan ronde ini");
					menangKomp += satu;
				}
				else if ( (angkaRand == satu && inputPilihan == lima) || (angkaRand == tiga && inputPilihan == lima) ) {
					System.out.println("Kamuuu memenangkan ronde ini");
					menangPlayer += satu;
				}
				else if ( (angkaRand == empat && inputPilihan == lima) || (angkaRand == empat && inputPilihan == dua) ) {
					System.out.println("Komputer memenangkan ronde ini");
					menangKomp += satu;
				}
				else if ( (angkaRand == lima && inputPilihan == empat) || (angkaRand == dua && inputPilihan == empat) ) {
					System.out.println("Kamuuu memenangkan ronde ini");
					menangPlayer += satu;
				}


				System.out.println("Poin Komputer : "+menangKomp);
				System.out.println("Poin Player   : "+menangPlayer);

				System.out.println("");
				if (menangPlayer >= empat && pertandinganAwal == satu) {
					System.out.println("Kamuuu menang dalam Game "+pertandinganAwal);
					putaranAwal = putaran;
					gamePlayer += satu;
				}
				if (menangPlayer >= delapan && pertandinganAwal == dua) {
					System.out.println("Kamuuu menang dalam Game "+pertandinganAwal);
					putaranAwal = putaran;
					gamePlayer += satu;
				}
				if (menangPlayer >= duabelas && pertandinganAwal == tiga) {
					System.out.println("Kamuuu menang dalam Game "+pertandinganAwal);
					putaranAwal = putaran;
					gamePlayer += satu;
				}

				putaranAwal += satu;
			}



			if (gamePlayer == tiga) {
				System.out.println("KAMUUUUUU GODSPEED");
			}
			else if (gamePlayer == dua) {
				System.out.println("KAMUUUUUU Palladins");
			}
			else if (gamePlayer == satu) {
				System.out.println("KAMUUUUUU Knight");
			}
			else if (menangPlayer == sepuluh) {
				System.out.println("KAMUUUUUU Enthusiast");
			}
			else if (menangPlayer == delapan) {
				System.out.println("KAMUUUUUU Peserta");
			}
			else if (menangPlayer < delapan) {
				System.out.println("Ingin tau aja");
			}


			pertandinganAwal += satu;
		}
		


	}
}