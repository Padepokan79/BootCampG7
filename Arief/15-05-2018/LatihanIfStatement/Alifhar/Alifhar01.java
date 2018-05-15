/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Alifhar01 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		double angka, nol, ganjil, genap;
		boolean bulat;

		nol = 0;
		ganjil = 1;
		genap = 2;

		System.out.println("=====================================");
		System.out.print("Masukan bilangan: ");
		angka = inputKey.nextDouble();
		System.out.println("=====================================");
		System.out.println("Bilangan tersebut adalah");
		System.out.print("Bilangan ");

		if (angka % genap == ganjil || angka % ganjil == nol) {
			System.out.print("bulat ");

			bulat = (angka % genap ) == ganjil;

			if (bulat) {
				System.out.print("ganjil ");
			}else{
				System.out.print("genap ");
			}
		}else{
			System.out.print("riil ");
		}

		if (angka < nol) {
			System.out.print("negatif ");
		}else {
			System.out.print("positif");
		}

		System.out.println("\n=====================================");

	}
}