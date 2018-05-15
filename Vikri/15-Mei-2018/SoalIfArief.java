/*
	Created By Vikri
	15/02/2018
*/
import java.util.Scanner;
public class SoalIfArief{
	public static void main(String[] args) {
		int plat, tanggal, kMesin;
		String hari, jKendaraan, surat, pengawalan;
		int ganjil;

		Scanner string = new Scanner(System.in);

		System.out.print("Plat: ");
		plat = string.nextInt();

		System.out.print("Tanggal: ");
		tanggal = string.nextInt();

		System.out.print("Hari Libur: ");
		hari = string.next();

		System.out.print("Jenis Kendaraan: ");
		jKendaraan = string.next();

		System.out.print("Kapasitas Mesin: ");
		kMesin = string.nextInt();

		System.out.print("Surat Izin: ");
		surat = string.next();

		System.out.print("Pengawalan: ");
		pengawalan = string.next();

		ganjil = tanggal%2;

		System.out.println("\n--------------------------------");
		if (tanggal>=1&&tanggal<=31) {
			if (hari.equals("tidak")) {
				if (jKendaraan.equals("motor")) {
					if (kMesin>=1000) {
						System.out.println("Diijinkan Memasuki Toll");
					} else {
						if (surat.equals("ya")&&pengawalan.equals("ya")) {
							System.out.println("Diijinkan Memasuki Toll");
						} else {
							System.out.println("Kendaraan Roda 2 Dilarang Masuk");
						}
					}
				} else if (jKendaraan.equals("mobil")) {
					if (ganjil==1) {
						if ( (plat%2)==1 ) {
							System.out.println("Diijinkan Masuk Toll");
						} else {
							System.out.println("Khusus Kendaraan Berplat ganjil");
						}
					} else {
						if ( (plat%2)==0 ) {
							System.out.println("Diijinkan Masuk Toll");
						} else {
							System.out.println("Khusus Kendaraan Berplat Genap");
						}
					}
				}
			} else {
				System.out.println("Bebas Masuk Hari Libur");
			}
		} else {
			System.out.println("Tanggal Ngaco");
		}
	}
}