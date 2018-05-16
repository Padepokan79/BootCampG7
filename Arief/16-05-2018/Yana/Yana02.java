/*
Date Created	: 16 May 2016
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
public class Yana02 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int kodeTI, kodeSI, kodeTK, semester, semesterMin, semesterMax, jurusan;
		double ipk, ipkmin;
		String nilaiAlgo, nilaiDbms, nilaiStrukDat, nilaiJaringan, nilaiRakitan;
		boolean algo, dbms, strukDat, jaringan, rakitanA, rakitanB, lulus, semesterSyarat;

		semesterMin = 3;
		semesterMax = 5;
		kodeTI = 345;
		kodeSI = 321;
		kodeTK = 531;

		System.out.print("Jurusan :");
		jurusan = inputKey.nextInt();

		if (jurusan == kodeTI || jurusan == kodeSI) {
			ipkmin = 3.0;
			System.out.print("Semester: ");
			semester = inputKey.nextInt();

			System.out.print("IPK: ");
			ipk = inputKey.nextDouble();

			System.out.print("Nilai Praktikum Algoritma: ");
			nilaiAlgo = inputKey.next();
			algo = nilaiAlgo.equals("A");

			System.out.print("Nilai Praktikum Basis Data: ");
			nilaiDbms = inputKey.next();
			dbms = nilaiDbms.equals("A");

			System.out.print("Nilai Praktikum Struktur Data: ");
			nilaiStrukDat = inputKey.next();
			strukDat = nilaiStrukDat.equals("A");

			semesterSyarat = semester >= semesterMin && semester <= semesterMax;
			lulus = semesterSyarat && (ipk >= ipkmin) && algo && (dbms || strukDat);

			if (lulus && (jurusan == kodeTI)) {
				System.out.print("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika");
			}else if (lulus && (jurusan == kodeSI)) {
				System.out.print("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Sistem Informasi");
			}else{
				System.out.print("Anda tidak lulus dimanapun");
			}
		}else if (jurusan == kodeTK) {
			ipkmin = 3.25;
			System.out.print("Semester: ");
			semester = inputKey.nextInt();

			System.out.print("IPK: ");
			ipk = inputKey.nextDouble();

			System.out.print("Nilai Praktikum Jaringan: ");
			nilaiJaringan = inputKey.next();
			jaringan = nilaiJaringan.equals("A");

			System.out.print("Nilai Praktikum Rakitan: ");
			nilaiRakitan = inputKey.next();
			rakitanA = nilaiRakitan.equals("A");
			rakitanB = nilaiRakitan.equals("B");

			semesterSyarat = semester >= semesterMin && semester <= semesterMax;
			lulus = semesterSyarat && (ipk >= ipkmin) && jaringan && (rakitanA || rakitanB);

			if (lulus) {
				System.out.print("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer");
			}else{
				System.out.print("Anda tidak lulus dimanapun");
			}
		}else {
			System.out.println("Anda tidak memasukan kode yang benar");
		}

	}
}