/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 8:08PM

Soal :

lotre
- anda membeli lotre dengan kriteria
- harga 100 kesempatan mendapat point 0s/d10
- harga 200=0s/d20, 300=0s/d50, 500=0s/d100
- yang pertama kali mencapai point 1000 menang.
- yang uang nya habis, kalah dan point lotre nya tidak dapet.
- yang menjadi pemain 2 orang manusia.
- diberi modal awal 100.000.
*/
import java.util.Scanner;
import java.util.Random;
public class SoalWhileRizaldi{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int hargaSatu, hargaDua, modalSatu, modalDua;
		int maxPoint, pointSatu, pointDua, skorPoinSatu, skorPoinDua, nol, sepuluh, seratus, duaRatus, tigaRatus, limaRatus, duaPuluh, limaPuluh;
		modalSatu	= 100000;	nol 		= 0;		sepuluh		= 10;
		modalDua	= 100000;	seratus		= 100;
		maxPoint 	= 1000;		duaRatus	= 200;
		pointSatu 	= 0;		tigaRatus	= 300;
		pointDua	= 0;		limaRatus 	= 500;
		skorPoinSatu= 0; 		duaPuluh 	= 20;
		skorPoinDua	= 0;		limaPuluh 	= 50;
		while( skorPoinSatu < maxPoint && skorPoinDua < maxPoint && modalSatu > nol && modalDua > nol){		
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("                LOTRE                 ");
			System.out.println("--------------------------------------");
			System.out.print("Masukan harga Player pertama : Rp. ");
			hargaSatu = scan.nextInt();
			System.out.print("Masukan harga Player kedua : Rp. ");
			hargaDua = scan.nextInt();
			if ( hargaSatu == seratus && modalSatu > nol) {
				pointSatu = random.nextInt(sepuluh);
				skorPoinSatu += pointSatu;
				modalSatu -= hargaSatu;
			}else if ( hargaSatu == duaRatus && modalSatu > nol ) {
				pointSatu = random.nextInt(duaPuluh);
				skorPoinSatu += pointSatu;
				modalSatu -= hargaSatu;
			}else if ( hargaSatu == tigaRatus && modalSatu > nol ) {
				pointSatu = random.nextInt(limaPuluh);
				skorPoinSatu += pointSatu;
				modalSatu -= hargaSatu;
			}else if ( hargaSatu == limaRatus && modalSatu > nol ) {
				pointSatu = random.nextInt(seratus);
				skorPoinSatu += pointSatu;
				modalSatu -= hargaSatu;
			}
			if ( hargaDua == seratus && modalDua > nol  ) {
				pointDua = random.nextInt(sepuluh);
				skorPoinDua += pointDua;
				modalDua -= hargaDua;
			}else if ( hargaDua == duaRatus && modalDua > nol  ) {
				pointDua = random.nextInt(duaPuluh);
				skorPoinDua += pointDua;
				modalDua -= hargaDua;
			}else if ( hargaDua == tigaRatus && modalDua > nol  ) {
				pointDua = random.nextInt(limaPuluh);
				skorPoinDua += pointDua;
				modalDua -= hargaDua;
			}else if ( hargaDua == limaRatus && modalDua > nol  ) {
				pointDua = random.nextInt(seratus);
				skorPoinDua += pointDua;
				modalDua -= hargaDua;
			}
			System.out.println();
			System.out.println("Point player pertama : "+skorPoinSatu);
			System.out.println("Modal player pertama : "+modalSatu);
			System.out.println("--------------------------------------");
			System.out.println("Point player kedua : "+skorPoinDua);
			System.out.println("Modal player kedua : "+modalDua);
			System.out.println("======================================");
			System.out.println();
		}
		if ( modalSatu == nol ) {
			System.out.println("MAAF UANG ANDA HABIS, PLAYER PERTAMA KALAH");
			System.out.println("SKOR POIN ANDA : 0");
			System.out.println("SELAMAT PLAYER KEDUA MENANG");
			System.out.println("SKOR POIN KEDUA : "+skorPoinDua);
		}else if ( modalDua == nol ) {
			System.out.println("MAAF UANG ANDA HABIS, PLAYER KEDUA KALAH");
			System.out.println("SKOR POIN ANDA : 0");
			System.out.println("SELAMAT PLAYER PERTAMA MENANG");
			System.out.println("SKOR POIN PERTAMA : "+skorPoinSatu);
		}else if ( pointSatu > pointDua ) {
			System.out.println("SELAMAT PLAYER PERTAMA MENANG");
			System.out.println("SKOR POIN ANDA : "+skorPoinSatu);
		}else if ( pointDua > pointSatu ) {
			System.out.println("SELAMAT PLAYER KEDUA MENANG");
			System.out.println("SKOR POIN ANDA : "+skorPoinDua);
		}
	}
}