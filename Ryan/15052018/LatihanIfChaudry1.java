/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 15 May 2018 09:28
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfChaudry1{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String nama, golongan="0" ;
		int gajiGolA, gajiGolB, gajiGolC, gajiGolD, gajiPokok=0, bonus=0, gajiKaryawan=0;

		gajiGolA = 1500000;
		gajiGolB = 1700000;
		gajiGolC = 2500000;
		gajiGolD = 5000000;

		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("LAPORAN PENGGAJIAN KARYAWAN BULANAN");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.print("\nNama\t\t: ");
		nama = key.next();
		System.out.print("Tahun Masuk\t: ");
		int tahunMasuk = key.nextInt();
		int masaKerja = 2018 - tahunMasuk;
		System.out.println("Masa Kerja\t: "+masaKerja+" tahun");

		if (masaKerja <= 1) {
			golongan = "A";
			gajiPokok = gajiGolA;
			bonus = 0;
			gajiKaryawan = gajiPokok+bonus;
		}
		else if (masaKerja < 5) {
			golongan = "B";
			gajiPokok = gajiGolB;
			bonus = 0;
			gajiKaryawan = gajiPokok+bonus;
		}
		else if (masaKerja <= 7) {
			golongan = "C";
			gajiPokok = gajiGolC;
			bonus = (masaKerja-4)*500000;
			gajiKaryawan = gajiPokok+bonus;
		}
		else if (masaKerja > 7) {
			golongan = "D";
			gajiPokok = gajiGolD;
			bonus = (masaKerja-4)*500000;
			gajiKaryawan = gajiPokok+bonus;
		}

		System.out.println("Golongan\t: "+golongan);
		System.out.println("Gaji Pokok\t: Rp."+gajiPokok);
		System.out.println("Bonus\t\t: Rp."+bonus);
		System.out.println("Gaji Karyawan\t: Rp."+gajiKaryawan);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
	}
}