/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

class TugasFor2 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int kue, loop, waktu, jam, menit, totMenit, i;

		kue = 200;
		loop = 15;
		waktu = 60;
		jam = 8;
		menit = 30;
		totMenit = (jam * waktu) + menit;

		for (i = totMenit; i >= 0 ; i -= loop) {
			kue-=3;
		}
		System.out.println("Sisa kue Pedagang: " + kue);

	}
}