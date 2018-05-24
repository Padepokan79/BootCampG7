/*
	Created By vikri
	19/05/2018
	10:00
*/
import java.util.Scanner;
import java.util.Random;

public class SoalYanaWhile{
	public static void main(String[] args) {
		int kBudi, round, kMan, kTono, menit, dadu, dadu2;
		String kocok;
		Random rand = new Random();
		menit = 0;
		kBudi = 200;
		kTono = 500;
		kMan = 10;

		round = 0;

		dadu = rand.nextInt(6)+1;
			
		do{
			menit++;
			kBudi += 20;
			kMan += 40;
			kTono += dadu;
			
			if (kMan>kBudi) {
				kTono += kBudi;
			}

			System.out.println("Menit Ke "+menit);
			System.out.println("Kelereng Tono : " +kTono);
			System.out.println("Kelereng Man  : " +kMan);
			System.out.println("Kelereng Budi : " +kBudi);
			System.out.println("");

		}while(kBudi>=kMan);
		dadu = rand.nextInt(6)+1;
		if (kMan>=kBudi) {
			do{
				kBudi += 20;
				kMan += 40;
				kTono += dadu;
				menit++;

				System.out.println("Menit Ke "+menit);
				System.out.println("Kelereng Tono : " +kTono);
				System.out.println("Kelereng Man  : " +kMan);
				System.out.println("Kelereng Budi : " +kBudi);
				System.out.println("");
			}while(kMan<=kTono);
		}
		System.out.println("Menit ke: "+menit);
	}
}