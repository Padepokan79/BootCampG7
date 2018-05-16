/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Andrian03 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		double nilaiUas, nilaiUts, nilaiTugas, uas, uts, tugas, rangeA, rangeB, rangeC, rangeD, rangeE, nol, nilaiAkhir;
		String nama, predikat, keterangan;

		nilaiUas = 30.0/100;
		nilaiUts = 30.0/100;
		nilaiTugas = 40.0/100;

		rangeA	= 100;
		rangeB	= 79;
		rangeC	= 59;
		rangeD	= 39;
		rangeE	= 19;
		nol		= 0;

		System.out.print("Nama\t: ");
		nama = inputKey.next();

		System.out.print("Uas\t: ");
		uas = inputKey.nextDouble();

		System.out.print("Uts\t: ");
		uts = inputKey.nextDouble();

		System.out.print("Tugas\t: ");
		tugas = inputKey.nextDouble();

		nilaiAkhir = (nilaiUts * uts) + (nilaiUas * uas) + (nilaiTugas * tugas);

		if((nilaiAkhir > rangeB) && (nilaiAkhir <= rangeA)) {
			predikat = "A";
			keterangan = "Lulus";
		}else if((nilaiAkhir > rangeC) && (nilaiAkhir <= rangeB)) {
			predikat = "B";
			keterangan = "Lulus";
		}else if((nilaiAkhir > rangeD) && (nilaiAkhir <= rangeC)) {
			predikat = "C";
			keterangan = "Tidak Lulus";
		}else if((nilaiAkhir > rangeE) && (nilaiAkhir <= rangeD)) {
			predikat = "D";
			keterangan = "Tidak Lulus";
		}else{
			predikat = "E";
			keterangan = "Tidak Lulus";
		}
		if (keterangan.equals("Tidak Lulus")) {
			System.out.println("\nMaaf " + nama + " predikat yang anda dapatkan " + predikat + " dan dinyatakan " + keterangan);	
		}else{
			System.out.println("\nSelamat " + nama + " predikat yang anda dapatkan " + predikat + " dan dinyatakan " + keterangan);
		}
	}	
}