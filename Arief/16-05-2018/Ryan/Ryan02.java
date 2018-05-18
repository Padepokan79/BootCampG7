/*
Date Created	: 16 May 2016
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ryan02 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int maxKos1, maxKos2, jlhKamar1, jlhKamar2, hargaKamar1, hargaKamar2, maxKamar1, maxKamar2, orang, jlhOrang;
		boolean budget1, budget2, budget3;
		
		hargaKamar1 = 650000;
		hargaKamar2 = 350000;
		jlhKamar1 = 4;
		jlhKamar2 = 7;
		maxKamar1 = 3;
		maxKamar2 = 2;
		maxKos1 = jlhKamar1 * maxKamar1;
		maxKos2 = jlhKamar2 * maxKamar2;

		System.out.print("Orang yang akan ngekost: ");
		jlhOrang = inputKey.nextInt();

		// budget1 = (jlhOrang / maxKamar1) * hargaKamar1;
		// budget2 = (jlhOrang / maxKamar2) * hargaKamar2;
		// System.out.println("harga kosan 1 : " + budget1);
		// System.out.println("harga kosan 2 : " + budget2);
		// System.out.println("=====================================");
		
        if (jlhOrang > maxKos2) {
			System.out.println("Tidak ada rumah yang cukup!");
		}
		else if ((jlhOrang <= maxKos2 && jlhOrang >= jlhKamar1) || (jlhOrang <= maxKamar2 && jlhOrang >= 1) ) {
			System.out.println("Rekomendasi Rumah 2");
		}
		else if (jlhOrang == maxKamar1) {
			System.out.println("Rekomendasi Rumah 1");

		}
	}
}