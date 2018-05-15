/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Chaudry03 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int media;

		System.out.println("");

		System.out.print("Masukan jarak rumah dengan perusahaan: ");
		media = keyboard.nextInt();

		System.out.println("Perjalanan yang tersedia untuk anda : ");
		if ( media >= 0 ) {
			System.out.println("\tJalan kaki");
		}
		if ( media >= 35 ) {
			System.out.println("\tNaik Sepeda");
		}
		if ( media >= 72 ) {
			System.out.println("\tNaik Motor");
		}
		if ( media >= 100 ) {
			System.out.println("\tNaik Mobil");
		}
		if ( media >= 150 ) {
			System.out.println("\tNaik Helikopter");
		}
	}
}