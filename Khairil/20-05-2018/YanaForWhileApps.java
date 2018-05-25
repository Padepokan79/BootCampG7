/*
	 Program     : Tugas For While - Yana
     Creator     : Khairil
     Created At  : 20 Mei 2018 11:00 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class YanaForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random dice = new Random();

		int kelerengBudi, kelerengMan, kelerengTono, tambahBudi, tambahMan, tambahTono, duaMenit, tigaMenit, satuMenit, shakeDice, totalKelerengBudi, totalKelerengMan, totalKelerengTono, kesempatanDadu, maxKesempatan, shakeDice1;

		kelerengBudi = 200;
		kelerengMan = 10;
		kelerengTono = 500;
		tambahBudi = 40;
		tambahMan = 120;
		duaMenit = 2;
		tigaMenit = 3;
		satuMenit = 1;
		kesempatanDadu = 1;
		maxKesempatan = 2;
		shakeDice = 0;
		totalKelerengTono = 500;
		totalKelerengBudi = 0;

		shakeDice = dice.nextInt(6)+1;	
		shakeDice1 = dice.nextInt(6)+1;

		do {
			totalKelerengTono = kelerengTono+=(shakeDice);
			System.out.println("========================================================================");
			totalKelerengBudi = kelerengBudi+=(tambahBudi/duaMenit);
			totalKelerengMan  = kelerengMan+=(tambahMan/tigaMenit);
			if(totalKelerengBudi < totalKelerengMan) {
				totalKelerengTono = totalKelerengTono + totalKelerengBudi;
			}
			System.out.print("Menit ke-"+ satuMenit + " : ");
			System.out.println("Kelereng Budi " + totalKelerengBudi + " || Kelereng Man " + totalKelerengMan + " || Kelereng Tono " + totalKelerengTono);
			satuMenit++;
		}
		while(kelerengMan < kelerengBudi);

		do {
			System.out.println("========================================================================");
			totalKelerengTono = totalKelerengTono+=(shakeDice1);
			totalKelerengBudi = kelerengBudi+=(tambahBudi/duaMenit);
			totalKelerengMan  = kelerengMan+=(tambahMan/tigaMenit);
			System.out.print("Menit ke-"+ satuMenit + " : ");
			System.out.println("Kelereng Budi " + totalKelerengBudi + " || Kelereng Man " + totalKelerengMan + " || Kelereng Tono " + totalKelerengTono);
			satuMenit++;
		}
		while(totalKelerengMan < totalKelerengTono);

		System.out.println("========================================================================");

		System.out.println("Pada menit ke " + (satuMenit-1) + " jumlah kelereng Man akan mengejar jumlah kelereng Tono");
	}
}