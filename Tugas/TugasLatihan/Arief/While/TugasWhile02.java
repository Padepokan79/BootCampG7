/*
Date Created	: 17 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

class TugasWhile02 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int kue, kueJual, loop, waktu, jam, menit, totMenit, index. nol;

		nol = 0;
		kue = 200;
		loop = 15;
		waktu = 60;
		jam = 8;
		menit = 30;
		totMenit = (jam * waktu) + menit;
		index = totMenit;

		while (index >= nol) {
			index -= loop;
			kue-=kueJual;
		}
		
		System.out.println("Sisa kue Pedagang: " + kue);

	}
}