/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 10:24AM

Soal :

coba buat game adu penalti dengan 5 penendang vs komputer.
untuk menentukan bola masuk atau tidak, menggunakan teknik random dimana yang mendapat random lebih tinggi itu 
yang berhasil memasukan/menangkap bola.
tapi random untuk player, diperintah dengan masukan tendang/tangkap
jika player memasukan perintah yang tidak sama dengan instruksi, random kekuatan player = 0

*/
import java.util.Scanner;
import java.util.Random;
public class SoalWhileRyan{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int randomKomp, randomPlayer, jmlPinalti, pinalti, poinPlayer, poinKomp, nol, satu, lima, sepuluh;
		String playerTendang, playerTangkap;
		
		pinalti 	= 1; 	nol 	= 0;
		jmlPinalti	= 5; 	satu 	= 1;
		poinKomp 	= 0; 	lima 	= 5;
		poinPlayer 	= 0; 	sepuluh = 10;

		System.out.println();
		System.out.println("==============================");
		System.out.println("       GAME ADU PINALTI       ");
		System.out.println("==============================");
		while( pinalti <= jmlPinalti ){
			System.out.println("Ronde ke "+pinalti);
			System.out.println();
			System.out.print("Jika siap menendang, masukan (tendang) : ");
			playerTendang = scan.next();

			if ( playerTendang.equals("tendang") ) {
				randomKomp 	 = random.nextInt(sepuluh)+satu;
				randomPlayer = random.nextInt(sepuluh)+satu;
				if ( randomKomp > randomPlayer ) {
					System.out.println();
					System.out.println("Bola berhasil ditangkap komputer");
				}else{ 
					System.out.println();
					System.out.println("GGOOLL!!! Bola berhasil masuk");
					poinPlayer += satu;
				}
			}else{
				randomPlayer = nol;
			}
			System.out.println();
			System.out.print("Jika anda siap menangkap, masukan (tangkap) : ");
			playerTangkap = scan.next();
			if ( playerTangkap.equals("tangkap") ) {
				randomKomp 	 = random.nextInt(sepuluh)+satu;
				randomPlayer = random.nextInt(sepuluh)+satu;
				if ( randomKomp > randomPlayer ) {
					System.out.println();
					System.out.println("GGOOLL!!! Bola berhasil masuk oleh Komputer");
					poinKomp += satu;
				}else{ 
					System.out.println();
					System.out.println("MANTAP!! Bola berhasil ditangkap");
				}
			}else{
				randomPlayer = nol;
			}

			System.out.println();
			System.out.println("SKOR : Player "+poinPlayer+" - Komputer "+poinKomp);
			System.out.println("-------------------------------");
			pinalti++;
		}
		if ( poinPlayer > poinKomp ) {
			System.out.println("Pemenangnya adalah Player");
			System.out.println("SKOR ANDA : "+poinPlayer);
		}else{
			System.out.println("Pemenangnya adalah Komputer");
			System.out.println("SKOR : "+poinKomp);
		}
	}
}