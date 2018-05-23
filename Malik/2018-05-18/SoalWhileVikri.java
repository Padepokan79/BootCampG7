/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 9:58AM

Soal :

diketahui pertandingan persib dan arema digelar hari ini, tapi tidak disiarkan tv karna kendala Stasiun televisi nya dibajak. 
agar tidak membuat para pendukung sepak bola tah air tidak kecewa, akhirnya panitia persib membuat kuis PERSIB VS AREMA, 
cara main nya adalah: 

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
public class SoalWhileVikri{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int persibSkorBabakSatu, persibSkorBabakDua, aremaSkorBabakSatu, aremaSkorBabakDua;
		int persibGol, aremaGol, skorPersib, skorArema, satu, sepuluh, nol;

		satu 	= 1;
		sepuluh = 10;
		nol 	= 0;

		System.out.println();
		System.out.println("===========================");
		System.out.println("     AYO TEBAK SKORMU      ");
		System.out.println("===========================");
		System.out.print("Tebakan gol persib babak ke 1 = ");
		persibSkorBabakSatu = scan.nextInt();
		System.out.print("Tebakan gol arema babak ke 1  = ");
		aremaSkorBabakSatu = scan.nextInt();
		System.out.println("===========================");
		System.out.println();
		System.out.println("===========================");
		System.out.print("Tebakan gol persib babak ke 2 = ");
		persibSkorBabakDua = scan.nextInt();
		System.out.print("Tebakan gol arema babak ke 2  = ");
		aremaSkorBabakDua = scan.nextInt();
		System.out.println("===========================");

		
			do{
			persibGol 	= random.nextInt(sepuluh)+satu;
			aremaGol  	= random.nextInt(sepuluh)+satu;

			skorPersib 	= persibSkorBabakSatu+persibSkorBabakDua;
			skorArema	= aremaSkorBabakSatu+aremaSkorBabakDua;
			


			if ( persibGol == skorPersib && aremaGol == skorArema ) {
				System.out.println();
				System.out.println("Skor Akhir nya adalah    = "+persibGol+" : "+aremaGol);
				System.out.println("Skor tebakan anda adalah = "+skorPersib+" : "+skorArema);
				System.out.println("SELAMAT ANDA\nmendapatkan paket umroh gratis bareng pemain persib");
				System.out.println("-----------------------------------------------------------------");
				System.out.println();
				break;
			}else if ( persibGol == skorPersib || aremaGol == skorArema ) {
				System.out.println("Skor Akhir nya adalah    = "+persibGol+" : "+aremaGol);
				System.out.println("Skor tebakan anda adalah = "+skorPersib+" : "+skorArema);
				System.out.println("SELAMAT ANDA\nmendapatkan kaos Atep");
				System.out.println("-----------------------------------------------------------------");
				System.out.println();
				break;
			}else if ( skorArema == nol && skorPersib == nol ) {
				System.out.println();
				System.out.println("Maaf anda tidak mendapatkan apa apa");
				break;
			}else{
				System.out.println("Skor Akhir nya adalah    = "+persibGol+" : "+aremaGol);
				System.out.println("Skor tebakan anda adalah = "+skorPersib+" : "+skorArema);
				System.out.println("AYO COBA LAGI");
				System.out.println("-----------------------------------------------------------------");
				System.out.println();
				break;
			}

			}while(!(persibGol == skorPersib && aremaGol == skorArema));
		
		
	}
}