/*
Date Created	: 16 May 2016
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Vikri01 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int istri, istriMin, istriMax, anak, anakMin, anakMax;
		boolean hadiah;

		istriMin = 1;
		istriMax = 2;
		anakMin = 1;
		anakMax = 2;

		System.out.println("Hadiah Mobil dari nenek");

		System.out.print("Masukan jumlah istri ");
		istri = inputKey.nextInt();

		System.out.print("Masukan jumlah anak ");
		anak = inputKey.nextInt();

		if (istri == istriMin && anak > anakMax) {
			System.out.println("Hadiah diberikan");
		}else if (istri > istriMax & anak == anakMin) {
			System.out.println("Hadiah diberikan");
		}else {
			System.out.println("Hadiah TIDAK diberikan");
		}



	}
}