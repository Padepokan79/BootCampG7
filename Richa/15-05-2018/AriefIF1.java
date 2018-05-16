import java.util.Scanner;

public class AriefIF1 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	int tanggal, plat, jenisKendaraan, kapasitas;
	String  hariLibur, surat, pengawalan, status = "INIT";

	System.out.println("------------------------------------------");
	System.out.println ("Jalan Bebas Hambatan dan Kenangan PasoePati");
	System.out.println("------------------------------------------");

	System.out.print ("Tanggal: ");
	tanggal= keyboard.nextInt ();

	System.out.print ("No. Plat: ");
	plat= keyboard.nextInt ();

	System.out.print ("Hari libur (Y/N): ");
	hariLibur= keyboard.next ();

	System.out.print ("Jenis Kendaraan roda (2/4): ");
	jenisKendaraan = keyboard.nextInt ();

	System.out.print ("Kapasitas mesin: ");
	kapasitas= keyboard.nextInt ();

	System.out.print ("Surat ijin (Y/N): ");
	surat = keyboard.next ();

	System.out.print ("Pengawalan (Y/N): ");
	pengawalan = keyboard.next ();

	if (hariLibur.equals ("Y")) {
		status = "Bebas Masuk Hari Libur";
	}
	else {
		if (jenisKendaraan==2) {
			if (surat.equals ("Y") && pengawalan.equals ("Y")) {
				status = "Diijinkan Memasuki Toll";
			}
			else if (kapasitas < 1000) {
				status = "Kendaraan Roda 2 dilarang masuk";
			}
			else {
				if (tanggal%2 == 0 && plat%2 == 0) {
					status = "Diijinkan Memasuki Toll";
				}
				else if (tanggal%2 == 0 && plat%2 == 1) {
					status = "Khusus kendaraan dengan plat genap";
				}
				else if (tanggal%2 == 1 && plat%2 == 0) {
					status = "Khusus kendaraan dengan plat ganjil";
				}
			}
		}
		else if (jenisKendaraan == 4) {
			if (surat.equals ("Y") && pengawalan.equals ("Y")) {
				status = "Diijinkan Memasuki Toll";
			}
			else if (tanggal%2 == 0 && plat%2 == 0) {
					status = "Diijinkan Memasuki Toll";
			}
			else if (tanggal%2 == 0 && plat%2 == 1) {
					status = "Khusus kendaraan dengan plat genap";
			}
			else if (tanggal%2 == 1 && plat%2 == 0) {
					status = "Khusus kendaraan dengan plat ganjil";
			}
		}
	}


	System.out.println ("Status: " + status);
	System.out.println("------------------------------------------");
	System.out.println ("Semoga Selamat Sampai Tujuan");
	System.out.println("------------------------------------------");
}
}



/*1. Tol Ganjil/Genap

Plat nomor yang boleh masuk ditentukan berdasarkan tanggal, ganjil atau genap. Namun jika tanggal merah, dan hari libur, semua kendaraan boleh masuk. Kendaraan roda dua dengan kapasitas mesin dibawah 1000 CC dilarang masuk kapanpun itu, tetapi jika memiliki izin dari kepolisian dan dikawal langsung oleh polisi, kendaraan apapun boleh masuk.

OUTPUT
___________________________________________

Jalan Bebas Hambatan dan Kenangan PasoePati
___________________________________________

Tanggal		:
Hari Libur	:
Jenis Kendaraan	:
Kapasitas Mesin	:
Surat Izin	:
Pengawalan	:

Status		: Diijinkan Memasuki Toll		>> Jika semua terpenuhi
		  Kendaraan Roda 2 dilarang masuk	>> Jika kapasitas mesin tidak mencapai 1000CC
		  Khusus kendaraan dengan plat ganjil	>> Jika kendaraan ber plat genap, begitu juga sebaliknya
		  Bebas Masuk Hari Libur		>> Jika hari libur
___________________________________________

	Semoga Selamat Sampai Tujuan
___________________________________________ */