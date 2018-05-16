/*
Date Created	: 16 May 2016
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Vikri02 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int nilaiMtk, nilaiAgama, kkmMtk, kkmAgama, utang, utangDef, nol;
		String spp, nama;
		boolean namaDef, lunas;

		kkmMtk = 72;
		kkmAgama = 75;
		utangDef = 0;
		nol = 0;

		System.out.println("Kenaikan Kelas");

		System.out.print("Masukan nama: ");
		nama = inputKey.next();
		namaDef = nama.equals("andi");

		System.out.print("Nilai MTK: ");
		nilaiMtk = inputKey.nextInt();

		System.out.print("Nilai Agama: ");
		nilaiAgama = inputKey.nextInt();

		System.out.print("SPP lunas (Y/T): ");
		spp = inputKey.next();
		lunas = spp.equals("Y");

		System.out.print("Jumlah Utang: ");
		utang = inputKey.nextInt();

		System.out.print("Keterangan: ");

		if (!namaDef && (nilaiMtk >= kkmMtk) && (nilaiAgama >= kkmAgama)) {
			System.out.println("Anda naik kelas ");
		}else if (lunas && utang <= nol) {
			System.out.println("Anda naik kelas ");
		}else if (namaDef) {
			System.out.println("Anda TIDAK naik kelas ");
		}else {
			System.out.println("Anda TIDAK naik kelas ");
		}
	}
}