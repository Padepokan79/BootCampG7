/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class Khairil{
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random random = new Random();

		int	jlhSoal, level, soal, bil1, bil2, com, player, jlhBenar, persentase;

		bil1 = bil2	= jlhBenar = soal = 0;

		System.out.print("Masukkan Level (1-6): ");
		level = inputKey.nextInt();
		System.out.print("Masukkan jumlah soal (1-100): ");
		jlhSoal = inputKey.nextInt();
		System.out.println();

		do{
			soal ++;

			if (level == 1) {
				bil1 = random.nextInt(10)+1;
				bil2 = random.nextInt(10)+1;
			}
			else if (level == 2) {
				bil1 = random.nextInt(90)+11;
				bil2 = random.nextInt(90)+11;
			}
			else if (level == 3) {
				bil1 = random.nextInt(900)+101;
				bil2 = random.nextInt(900)+101;
			}
			else if (level == 4) {
				bil1 = random.nextInt(9000)+1001;
				bil2 = random.nextInt(9000)+1001;
			}
			else if (level == 5) {
				bil1 = random.nextInt(90000)+10001;
				bil2 = random.nextInt(90000)+10001;
			}
			else if (level == 6) {
				bil1 = random.nextInt(900000)+100001;
				bil2 = random.nextInt(900000)+100001;
			}

			System.out.println("Pertanyaan ke " + soal);
			System.out.print(bil1 + " + " + bil2 + " = ");
			com	= bil1 + bil2;
			player = inputKey.nextInt();
			if (player == com) {
				jlhBenar += 1;
			}

		} while (soal < jlhSoal);

		persentase	= jlhBenar * 100 / jlhSoal;

		System.out.println();
		System.out.println("Jumlah soal benar: " + jlhBenar);

		if (persentase < 25) {
			System.out.println("Coba lagi ya! atau ngulang SD nya");
		}
		else if (persentase >= 25 && persentase < 50) {
			System.out.println("OKE lah masih mending");			
		}
		else if (persentase >= 50 && persentase < 75) {
			System.out.println("Sip lah masih di atas standar");			
		}
		else if (persentase >= 75 && persentase < 99) {
			System.out.println("Anda benar-benar matematikawan");			
		}
		else if (persentase == 100) {
			System.out.println("PURRFECT!");			
		}
	}
}