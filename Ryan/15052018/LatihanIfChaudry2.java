/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 15 May 2018 09:53
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfChaudry2{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String nama, ketNilai=" ", ketTambahan=" ";
		int jmlPelajaran=3;
		double nilaiMath, nilaiInd, nilaiIng, nilaiRataRata;

		System.out.println("\n+++++++++++++++++++++++++++++++++++");
		System.out.print("Nama\t\t\t: ");
		nama = key.next();
		System.out.print("Nilai Math\t\t: ");
		nilaiMath = key.nextDouble();
		System.out.print("Nilai Indonesia\t\t: ");
		nilaiInd = key.nextDouble();
		System.out.print("Nilai Inggris\t\t: ");
		nilaiIng = key.nextDouble();

		nilaiRataRata = (nilaiMath+nilaiInd+nilaiIng)/jmlPelajaran;
		System.out.printf("\nRata-rata nilai\t\t: %.2f",nilaiRataRata);

		if (nilaiRataRata < 75) {
			ketNilai = "Kurang";
			ketTambahan = "Harus mengikuti remedial";
		}
		else if (nilaiRataRata < 85) {
			ketNilai = "Cukup";
			ketTambahan = "Boleh Mengikuti Remedial / Tidak";
		}
		else if (nilaiRataRata <= 90) {
			ketNilai = "Baik";
		}
		else{
			ketNilai = "Sangat Baik";
		}

		System.out.println("\nKeterangan nilai\t: "+ketNilai);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		if (nilaiRataRata < 85) {
			System.out.println("Keterangan Tambahan\t: "+ketTambahan);
		}

	}
}