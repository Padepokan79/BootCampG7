/*
Creted by	: Yana
Time		: 18 Mei 2018 14.19
*/

import java.util.Scanner;
import java.util.Random;

public class VikriDoWhile{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		int	babak=0, skorPersib, skorArema, tebakSkorPersib, tebakSkorArema, 
			tebakSkorAkhirPersib=0, tebakSkorAkhirArema=0,
			skorAkhirPersib=0, skorAkhirArema=0;

		do{
			babak++;
			System.out.println();
			System.out.println("BABAK KE - "+babak);

			System.out.print("Masukkan skor Persib babak ke "+babak+" : ");
			tebakSkorPersib = keyboard.nextInt();
			skorPersib = random.nextInt(10)+1;
			System.out.println("Skor Persib "+skorPersib+ "\n");

			System.out.print("Masukkan skor Arema babak ke "+babak+" : ");
			tebakSkorArema= keyboard.nextInt();
			skorArema = random.nextInt(10)+1;
			System.out.println("Skor Arema "+skorArema+ "\n");

			skorAkhirPersib = skorAkhirPersib + skorPersib;
			skorAkhirArema  = skorAkhirArema + skorArema;
			tebakSkorAkhirPersib = tebakSkorAkhirPersib + tebakSkorPersib;
			tebakSkorAkhirArema = tebakSkorAkhirArema + tebakSkorArema;

		}while(babak <= 1);

		System.out.println();
		System.out.println("Skor Akhir Persib " +skorAkhirPersib);
		System.out.println("Skor Akhir Arema " +skorAkhirArema);
		System.out.println("Tebak Skor Akhir Persib " +tebakSkorAkhirPersib);
		System.out.println("Tebak Skor Akhir Arema " +tebakSkorAkhirArema);

		if (skorAkhirPersib == tebakSkorAkhirPersib && skorAkhirArema == tebakSkorAkhirArema) {
			System.out.println("Selamat anda mendapatkan hadiah umroh");
		}
		else if (skorAkhirPersib == tebakSkorAkhirPersib || skorAkhirArema == tebakSkorAkhirArema) {
			System.out.println("Selamat anda mendapatkan hadiah baju atep");			
		}
		else {
			System.out.println("Maaf, anda harus coba lagi minggu depan");			
		}
	}
}

/*
+diketahui pertandingan persib dan arema digelar hari ini, tapi tidak disiarkan tv karna kendala Stasiun televisi nya dibajak. 
+agar tidak membuat para pendukung sepak bola tah air tidak kecewa, akhirnya panitia persib membuat kuis PERSIB VS AREMA, cara main nya adalah: 
+
+	- tebak berapa gol yang dicetak persib dan arema di babak 1, lalu tebak lagi berapa gol di babak kedua.
+
+	- kemudian gol dibabak ke 1 dan kedua akan dijumlahkan sebagai skor akhir;
+
+	- jika skor akhir antara persib dan arema bisa ditebak maka, pemenang bisa mendapatkan paket umroh gratis bareng pemain persib.
+
+	- dan jika berhasil menebak skor akhir dari salah satu tim akan diberi kaos atep
+
+*Example
+gunakan do While
+skala skor 1 sd 10
+
+====================================
+Masukan gol Persib babak ke 1: 1
+Masukan gol Arema babak ke 1: 1
+====================================
+Masukan gol Persib babak ke 2: 2
+Masukan gol Arema babak ke 2: 2
+====================================
+
+Skor Akhir nya adalah 1 : 4
+Skor Tebakan Anda 3 : 3
+====================================
+Maaf coba lagi minngu depan
+====================================
*/