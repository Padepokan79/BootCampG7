/*
Date Created	: 20 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class Rizaldi {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int cashP1, cashP2, poinLotre, chooseP1, chooseP2, pointP1, pointP2, totPointP1, totPointP2;

		cashP2 = cashP1	= 1000;
		totPointP2 = totPointP1 = pointP2 = pointP1 = poinLotre = 0;

		while(cashP1 > 0 || cashP2 > 0){
			if (cashP1 > 0) {			
				System.out.println("PLAYER 1");
				System.out.println("Uang Anda : " + cashP1);
				System.out.print("Pilih harga lotre (100, 200, 300, 500): ");
				chooseP1 = inputKey.nextInt();

				if (chooseP1 == 100) {
					poinLotre = random.nextInt(10);
				}else if (chooseP1 == 200) {
					poinLotre = random.nextInt(20);
				}else if (chooseP1 == 300) {
					poinLotre = random.nextInt(50);
				}else if (chooseP1 == 500) {
					poinLotre = random.nextInt(100);
				}
				pointP1 = pointP1 + poinLotre;
				cashP1 = cashP1 - chooseP1;
				totPointP1 = totPointP1 + poinLotre;
				System.out.println("Poin Lotre : " + poinLotre);
				System.out.println("Total Poin : " + totPointP1);
				System.out.println();
			}
			if (cashP2 > 0) {
				System.out.println("PLAYER 2");
				System.out.println("Uang Anda : " + cashP2);
				System.out.print("Pilih harga lotre (100, 200, 300, 500): ");
				chooseP2 = inputKey.nextInt();

				if (chooseP2 == 100) {
					poinLotre = random.nextInt(10);
				}else if (chooseP2 == 200) {
					poinLotre = random.nextInt(20);
				}else if (chooseP2 == 300) {
					poinLotre = random.nextInt(50);
				}else if (chooseP2 == 500) {
					poinLotre = random.nextInt(100);
				}
				pointP2 = pointP2 + poinLotre;
				cashP2 = cashP2 - chooseP2;
				totPointP2 = totPointP2 + poinLotre;
				System.out.println("Poin Lotre : " + poinLotre);
				System.out.println("Total Poin : " + totPointP2);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Poin Akhir Player 1: " + totPointP1);
		System.out.println("Poin Akhir Player 2: " + totPointP2);

		if (totPointP1 == totPointP2) {
			System.out.println("SERI");
		}else if (totPointP1 > totPointP2) {
			System.out.println("PLAYER 1 MENANG");
		}else if (totPointP2 > totPointP1) {
			System.out.println("PLAYER 2 MENANG");
		}
		System.out.println();
	}
}