/*
	DATE CREATED : 20 MEI 2018
	TIME CREATED : 16.30 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK


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
public class DoWhileVikri{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int inputSkorPersib, angkaRandPer, angkaRandArema, babakSatuPer, babakSatuArema, babakDuaPer, babakDuaArema, inputSkorArema, skorAwal = 1, skorMax = 10;
		int skorAkhirPer, skorAkhirArema;

		babakSatuPer = babakSatuArema = babakDuaPer = babakDuaArema = 0;

		System.out.println("");
		System.out.println("---------- KUIS PERSIB VS AREMA ----------");
		System.out.println("");

			System.out.println("BABAK 1");
			System.out.print("Berapa gol yang dicetak PERSIB? ");
			inputSkorPersib = keyboard.nextInt();
			babakSatuPer = inputSkorPersib;

			System.out.print("Berapa gol yang dicetak AREMA? ");
			inputSkorArema = keyboard.nextInt();
			babakSatuArema = inputSkorArema;

			System.out.println("");

			System.out.println("BABAK 2");
			System.out.print("Berapa gol yang dicetak PERSIB? ");
			inputSkorPersib = keyboard.nextInt();
			babakDuaPer = inputSkorPersib;
			
			System.out.print("Berapa gol yang dicetak AREMA? ");
			inputSkorArema = keyboard.nextInt();
			babakDuaArema = inputSkorArema;

			System.out.println("");
			System.out.println("=====================================");
			System.out.println("");

		do{
			angkaRandPer = rand.nextInt(10) + 1;
			angkaRandArema = rand.nextInt(10) + 1;

			System.out.println("Skor Akhir Persib : "+angkaRandPer);
			System.out.println("Skor Akhir Arema : "+angkaRandArema);
			System.out.println("");

			skorAkhirPer = babakSatuPer + babakDuaPer;
			skorAkhirArema = babakSatuArema + babakDuaArema;

			System.out.println("Skor Tebakan PERSIB : "+(skorAkhirPer));
			System.out.println("Skor Tebakan AREMA : "+(skorAkhirArema));

			if (skorAkhirPer == angkaRandPer && skorAkhirArema == angkaRandArema) {
				System.out.println("SELAMAT anda mendapatkan paket umroh gratis");
				skorAwal += 10;
			}
			else if (skorAkhirPer == angkaRandPer || skorAkhirArema == angkaRandArema) {
				System.out.println("SELAMAT anda mendapatkan kaos ATEP");
				skorAwal += 10;
			}else{
				System.out.println("Maaf Coba lagi");
			}

			System.out.println("");
			System.out.println("=====================================");
			System.out.println("");

		}while(skorAkhirPer != angkaRandPer && skorAkhirArema != angkaRandArema);
			


	}
}