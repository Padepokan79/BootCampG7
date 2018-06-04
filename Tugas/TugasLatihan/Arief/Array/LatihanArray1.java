/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

public class LatihanArraySatu {
	public static void main(String[] args) {
		int[]	angka = {1, 4, 2, 5, 7, 10},
				number = new int[angka.length];

		// for (int angk : angka) {
		// 	System.out.println(angk);
		// }
		// System.out.println();

		for (int index = 0; index < angka.length; index++) {
			number[index] = angka[index];
			System.out.println(number[index]);
		}

		for ( int x : number) {
			System.out.println(x);
		}
	}
}

// copy isi array pada angka ke array number
// kemudian tampilkan isi dari array number