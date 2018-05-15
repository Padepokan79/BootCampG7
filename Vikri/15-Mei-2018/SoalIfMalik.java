/*
	Created By Vikri
	15/05/2018
	13:25
*/
import java.util.Scanner;
public class SoalIfMalik{
	public static void main(String[] args) {
		String bulan, tentukan, minggu, minggu2;
		int hari;

		Scanner input = new Scanner(System.in);
		Scanner string = new Scanner(System.in);

		System.out.println("=================");
		System.out.println("   Super Month");
		System.out.println("=================\n");

		System.out.println("Apa yang ingin anda tentukan(nama bulan/jumlah hari)");
		tentukan = string.nextLine();

		if (tentukan.equals("nama bulan")) {
			System.out.print("Masukan nama Bulan: ");
			bulan = input.next();
			if (bulan.equals("januari")) {
				System.out.println("Jumlah Hari: 31 ");
				System.out.println("Jumlah minggu: 4 minggu 3 hari ");
			} else if (bulan.equals("februari")) {
				System.out.println("Jumlah Hari: 29 ");
				System.out.println("Jumlah minggu: 4 minggu 1 hari ");
			} else if (bulan.equals("maret")) {
				System.out.println("Jumlah Hari: 31 ");
				System.out.println("Jumlah minggu: 4 minggu 3 hari ");
			} else if (bulan.equals("april")) {
				System.out.println("Jumlah Hari: 20 ");
				System.out.println("Jumlah minggu: 4 minggu 2 hari ");
			} else if (bulan.equals("mei")) {
				System.out.println("Jumlah Hari: 31 ");
				System.out.println("Jumlah minggu: 4 minggu 3 hari ");
			} else if (bulan.equals("juni")) {
				System.out.println("Jumlah Hari: 20 ");
				System.out.println("Jumlah minggu: 4 minggu 2 hari ");
			} else if (bulan.equals("juli")) {
				System.out.println("Jumlah Hari: 31 ");
				System.out.println("Jumlah minggu: 4 minggu 3 hari ");
			} else if (bulan.equals("agustus")) {
				System.out.println("Jumlah Hari: 31 ");
				System.out.println("Jumlah minggu: 4 minggu 3 hari ");
			} else if (bulan.equals("september")) {
				System.out.println("Jumlah Hari: 20 ");
				System.out.println("Jumlah minggu: 4 minggu 2 hari ");
			} else if (bulan.equals("oktober")) {
				System.out.println("Jumlah Hari: 31 ");
				System.out.println("Jumlah minggu: 4 minggu 3 hari ");
			} else if (bulan.equals("november")) {
				System.out.println("Jumlah Hari: 20 ");
				System.out.println("Jumlah minggu: 4 minggu 2 hari ");
			} else if (bulan.equals("desember")) {
				System.out.println("Jumlah Hari: 31 ");
				System.out.println("Jumlah minggu: 4 minggu 3 hari ");
			}
		} else if (tentukan.equals("jumlah hari")) {
			System.out.print("Jumlah Hari: ");
			hari = input.nextInt();
			if (hari == 31) {
				System.out.println("Jumlah bulan dengan 31 hari:");
				System.out.println("Januari, Maret, Mei, Juli, Agustus, Oktober dan Desember");
			} else if (hari == 30) {
				System.out.println("April, juni, september, november");
			} else if (hari == 29) {
				System.out.println("Februari");
			} else {
				System.out.println("Bulan Tidak Diketahui");	
			}
		} else {
			System.out.println("Tidak Diketahui");
		}
	}
}