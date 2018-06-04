/*
	Program     : Tugas For While - Rizaldi
	Creator     : Khairil
	Created At  : 20 Mei 2018 17:00 PM     
	Updated By  : 
	Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class RizaldiForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random setNum = new Random();
		int lotre100, lotre200, lotre300, lotre500, nol, player1, player2, uangplayer1, uangplayer2, inputLotre1, inputLotre2, undi, undi1, cepek, nopek, sapek, gopek, seceng;
		player1 = 0;
		player2 = 0;
		nol = 0;
		uangplayer1 = 100000;
		uangplayer2 = 100000;
		undi = 0;
		undi1 = 0;
		cepek = 100;
		nopek = 200;
		sapek = 300;
		gopek = 500;
		seceng = 1000;

		while( (uangplayer1 > nol && uangplayer2 > nol) && (player1 < seceng && player2 < seceng) ) {
			lotre100 = setNum.nextInt(11);
			lotre200 = setNum.nextInt(21);
			lotre300 = setNum.nextInt(51);
			lotre500 = setNum.nextInt(101);

			System.out.print("Player 1 Silahkan masukkan harga : ");
			inputLotre1 = keyboard.nextInt();

			if(inputLotre1 == cepek) {
				undi = lotre100;
			}
			else if(inputLotre1 == nopek) {
				undi = lotre200;
			}
			else if(inputLotre1 == sapek) {
				undi = lotre300;
			}
			else if(inputLotre1 == gopek) {
				undi = lotre500;
			}

			uangplayer1 = uangplayer1 - inputLotre1;

			System.out.println("Sisa uang anda adalah : " + uangplayer1);
			System.out.println("Anda mendapatkan      : " + undi + " point ");
			player1 = player1 + undi;
			System.out.println("Total poin anda adalah : " + player1);
			System.out.println();

			System.out.print("Player 2 Silahkan masukkan harga : ");
			inputLotre2 = keyboard.nextInt();

			if(inputLotre2 == cepek) {
				undi1 = lotre100;
			}
			else if(inputLotre2 == nopek) {
				undi1 = lotre200;
			}
			else if(inputLotre2 == sapek) {
				undi1 = lotre300;
			}
			else if(inputLotre2 == gopek) {
				undi1 = lotre500;
			}

			uangplayer2 = uangplayer2 - inputLotre2;

			System.out.println("Sisa uang anda adalah : " + uangplayer2);
			System.out.println("Anda mendapatkan      : " + undi1 + " point ");
			player2 = player2 + undi1;
			System.out.println("Total poin anda adalah : " + player2);
			System.out.println();			
		}

		if(uangplayer1 == nol || player2 >= seceng) {
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("Player 2 Memenangkan Lotre");
			System.out.println("++++++++++++++++++++++++++++++++++++");	
		}
		else if(uangplayer2 == nol || player1 >= seceng) {
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("Player 1 Memenangkan Lotre");	
			System.out.println("++++++++++++++++++++++++++++++++++++");
		}
	}
}


/*
>lotre
- anda membeli lotre dengan kriteria
- harga 100 kesempatan mendapat point 0s/d10
- harga 200=0s/d20, 300=0s/d50, 500=0s/d100
- yang pertama kali mencapai point 1000 menang.
- yang uang nya habis, kalah dan point lotre nya tidak dapet.
- yang menjadi pemain 2 orang manusia.
- diberi modal awal 100.000.
*/