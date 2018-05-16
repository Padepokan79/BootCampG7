/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Chaudry01 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		int kkm, cukup, baik, math, eng, bhs, rata, rataan;
		String nama, ket, remed;
		boolean remedi;

		kkm = 75;
		cukup = 85;
		baik = 90;
		rata = 3;

		System.out.print("Nama: ");
		nama = inputKey.next();

		System.out.print("Nilai Math: ");
		math = inputKey.nextInt();

		System.out.print("Nilai Indonesia: ");
		bhs = inputKey.nextInt();

		System.out.print("Nilai Inggris: ");
		eng = inputKey.nextInt();

		rataan = (math + bhs + eng) / rata;

		if (rataan == kkm) {
			ket = "cukup";
			System.out.print("Ingin ikut Remedial? (Y/T) ");
			remed = inputKey.next();
			remedi = remed.equals("Y");
			if (remedi) {
			System.out.println("Anda memilih mengikuti remedial: ");
			}else {
				System.out.println("Anda memilih tidak mengikuti remedial: ");
			}
			
		}else if (rataan >= kkm && rataan < cukup) {
			ket = "cukup";
		}else if (rataan >= cukup && rataan <= baik) {
			ket = "baik";
		}else if (rataan > baik) {
			ket = "sangat baik";
		}else{
			ket = "Kurang";
			System.out.println("Anda diwajibkan ikut remedial");
		}

		System.out.println("Rata-rata Nilai: " + rataan);
		System.out.println("Keterangan nilai: " + ket);

	}
}