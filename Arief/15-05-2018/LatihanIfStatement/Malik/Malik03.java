/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Malik03 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int jujur, bohong, sombong, angkuh, totSkala, skalaKurangBaik, skalaSangatBaik, skalaBuruk;
		boolean baik, kurangBaik, sangatBaik, buruk;

		skalaKurangBaik = 5;
		skalaSangatBaik = 35;
		skalaBuruk = 15;

		System.out.println("===================================");
		System.out.println("        DETECTED UR ATTITUDE       ");
		System.out.println("===================================");

		System.out.print("Skala jujur anda\t:");
		jujur = inputKey.nextInt();

		System.out.print("Skala bohong anda\t:");
		bohong = inputKey.nextInt();

		System.out.print("Skala sombong anda\t:");
		sombong = inputKey.nextInt();

		System.out.print("Skala angkuh anda\t:");
		angkuh = inputKey.nextInt();

		totSkala = jujur + bohong + sombong + angkuh;

		System.out.println("-----------------------------------");
		System.out.print("SELAMAT! anda ");
		
		baik = (jujur >= 8 && bohong < 5 && sombong <=6 && angkuh < 7) || (jujur >= 9 && bohong <= 2);
		kurangBaik = totSkala <= skalaKurangBaik;
		sangatBaik = totSkala > skalaSangatBaik;
		buruk = totSkala < skalaBuruk;

		if (baik) {
			System.out.println("baik !");
		}else if (kurangBaik) {
			System.out.println("kurang baik !");
		}else if (sangatBaik) {
			System.out.println("sangat baik !");
		}else if (buruk) {
			System.out.println("buruk !");
		}
	}
}