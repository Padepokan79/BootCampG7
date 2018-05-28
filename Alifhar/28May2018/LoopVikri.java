/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	22.59
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class LoopVikri{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int persibGuess=0, aremaGuess=0, babak=0, persib, arema;

		System.out.println("==================================");
		do{
			babak++;
			System.out.print("Masukan gol Persib babak ke "+babak+": ");
			persibGuess+=scan.nextInt();
			System.out.print("Masukan gol Arema  babak ke "+babak+": ");
			aremaGuess+=scan.nextInt();
			System.out.println("==================================");
		}while(babak<2);

		persib=rand.nextInt(11);
		arema=rand.nextInt(11);

		System.out.println("\n==================================");
		System.out.println("Skor akhirnya adalah "+persib+" : "+arema);
		System.out.println("Skor tebakan anda "+persibGuess+" : "+aremaGuess);
		System.out.println("==================================");
		if(persib==persibGuess && arema==aremaGuess)
			System.out.println("Selamat anda berhak mendapatkan paket umroh");
		else if(persib==persibGuess || arema==aremaGuess)
			System.out.println("Selamat anda berhak mendapatkan kaos atep");
		else
			System.out.println("Maaf coba lagi minggu depan");
		System.out.println("==================================");

	}
}