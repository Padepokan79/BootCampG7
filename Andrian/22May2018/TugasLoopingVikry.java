/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	
diketahui pertandingan persib dan arema digelar hari ini, tapi tidak disiarkan tv karna kendala Stasiun televisi nya dibajak. 
agar tidak membuat para pendukung sepak bola tah air tidak kecewa, akhirnya panitia persib membuat kuis PERSIB VS AREMA, cara main nya adalah: 

	- tebak berapa gol yang dicetak persib dan arema di babak 1, lalu tebak lagi berapa gol di babak kedua.
	- kemudian gol dibabak ke 1 dan kedua akan dijumlahkan sebagai skor akhir;
	- jika skor akhir antara persib dan arema bisa ditebak maka, pemenang bisa mendapatkan paket umroh gratis bareng pemain persib.
	- dan jika berhasil menebak skor akhir dari salah satu tim akan diberi kaos atep

*Example
gunakan do While
skala skor 1 sd 10

====================================
Masukan gol Persib babak ke 1: 1
Masukan gol Arema babak ke 1: 1
====================================
Masukan gol Persib babak ke 2: 2
Masukan gol Arema babak ke 2: 2
====================================

Skor Akhir nya adalah 1 : 4
Skor Tebakan Anda 3 : 3
====================================
Maaf coba lagi minngu depan
====================================
*/
	
	import java.util.Scanner;
	import java.util.Random;

	public class TugasLoopingVikry {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();

			int babak=1, golPersib, golArema, scoreAkhirPersib, scoreAkhirArema, scoreAkhirPersibtemp=0, scoreAkhirArematemp=0, scoreAkhirPrediksiArema=0, scoreAkhirPrediksiPersib=0; 

			System.out.println("====================================================");
			System.out.println("                WELCOME TO THE GAME                 ");
			System.out.println("====================================================");

			do {
				scoreAkhirPersib = rand.nextInt(5);
				scoreAkhirArema = rand.nextInt(5);
				System.out.println(scoreAkhirPersib);
				System.out.println(scoreAkhirArema);
				System.out.println();
				System.out.println("============================================");
				System.out.print("Masukan gol persib babak "+babak+" \t: ");
				golPersib = key.nextInt();
				System.out.print("Masukan gol arema babak "+babak+" \t: ");
				golArema = key.nextInt();
				System.out.println("============================================");
				System.out.println();

				scoreAkhirPrediksiPersib += golPersib;
				scoreAkhirPrediksiArema += golArema;

				scoreAkhirPersibtemp += scoreAkhirPersib;
				scoreAkhirArematemp += scoreAkhirArema;
				babak++;	
			} while (babak<3);

				System.out.println("Skor Akhir nya adalah, persib "+scoreAkhirPersibtemp+" : Arema "+scoreAkhirArematemp);
				System.out.println("Skor tebakan anda adalah, persib "+scoreAkhirPrediksiPersib+" : Arema "+scoreAkhirPrediksiArema);
				System.out.println("============================================");


				if ( scoreAkhirPrediksiPersib==scoreAkhirPersibtemp && scoreAkhirPrediksiArema==scoreAkhirArematemp) {
					System.out.println("Selamat anda mendapatkan paket umroh gratis bareng pemain persib.");
				}
				else if ( scoreAkhirPrediksiPersib==scoreAkhirPersibtemp || scoreAkhirPrediksiArema==scoreAkhirArematemp) {
					System.out.println("Selamat anda mendapatkan kaos Atep.");
				}
				else {
					System.out.println("Maaf coba lagi minngu depan");
				}
		}
	}