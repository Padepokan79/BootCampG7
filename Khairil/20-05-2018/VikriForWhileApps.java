/*
	 Program     : Tugas For While - Vikri
     Creator     : Khairil
     Created At  : 20 Mei 2018 10:00 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class VikriForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rNum = new Random();

		String sign;
		int hideScorePersib1, hideScorePersib2, hideScoreArema1, hideScoreArema2, guessScorePersib, guessScoreArema, totalScorePersib, totalScoreArema, realScorePersib, realScoreArema, repeater, first, babakMax;

		guessScoreArema = guessScorePersib = 0;		
		totalScorePersib = 0;
		totalScoreArema = 0;
		realScorePersib = 0;
		realScoreArema = 0;
		first = 1;
		babakMax = 2;
		sign = "";

		for(repeater = first; repeater <= babakMax; repeater++) {
			hideScorePersib1 = rNum.nextInt(10) + 1;
			hideScorePersib2 = rNum.nextInt(10) + 1;
			hideScoreArema1 = rNum.nextInt(10) + 1;
			hideScoreArema2 = rNum.nextInt(10) + 1;

			realScorePersib = hideScorePersib1 + hideScorePersib2;
			realScoreArema = hideScoreArema1 + hideScoreArema2;

			System.out.print("Masukkan gol Persib babak ke " + repeater + "(skala 1 - 10)");
			guessScorePersib = keyboard.nextInt();
			System.out.print("Masukkan gol Arema babak ke " + repeater + "(skala 1 - 10)");
			guessScoreArema = keyboard.nextInt();
		}
			System.out.println("==========================================================");
			
			totalScorePersib = guessScorePersib+=guessScorePersib;
			totalScoreArema = guessScoreArema+=guessScoreArema;


		System.out.println("Score akhirnya adalah : " + realScorePersib + " - " + realScoreArema);
		System.out.println("Score tebakan anda    : " + totalScorePersib + " - " + totalScoreArema);

		if(totalScorePersib == realScorePersib && totalScoreArema == realScoreArema) {
			System.out.println("Tebakan Anda Akurat");
			System.out.println("Anda berhasil mendapatkan paket umroh gratis bareng pemain persib");
		}
		else if(totalScorePersib == realScorePersib || totalScoreArema == realScoreArema) {
			if(totalScorePersib == realScorePersib) {
				sign = "Persib";
			}
			else if(totalScoreArema == realScoreArema) {
				sign = "Arema";
			}
			System.out.println("Tebakan Anda pada score akhir " + sign + " Akurat");
			System.out.println("Anda berhasil mendapatkan kaos Atep");
		}
		else {
			System.out.println("Maaf. Coba lagi minggu depan..");	
		}
	}
}