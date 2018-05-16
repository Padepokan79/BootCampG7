/*
Created by	: Yana
Time		: 15 Mei 2018 11.18
*/

import java.util.Scanner;

public class AriefIf1{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int	platNomor, tanggal, kapasitasMesin, jenisKendaraan;
		String 	hariLibur, suratIzin, pengawalan;
		boolean	serasi, syaratLibur, syaratTidakLibur, syaratRodaDua;


		System.out.println("___________________________________________");
		System.out.println();
		System.out.println("Jalan Bebas Hambatan dan Kenangan PasoePati");
		System.out.println("___________________________________________");

		System.out.print("Plat Nomor                 : ");
		platNomor = keyboard.nextInt();
		System.out.print("Tanggal                    : ");
		tanggal = keyboard.nextInt();
		System.out.print("Hari Libur (Y/N)           : ");
		hariLibur = keyboard.next();
		System.out.print("Jenis Kendaraan roda (2/4) : ");
		jenisKendaraan = keyboard.nextInt();
		System.out.print("Kapasitas Mesin            : ");
		kapasitasMesin = keyboard.nextInt();
		System.out.print("Surat Izin (Y/N)           : ");
		suratIzin = keyboard.next();
		System.out.print("Pengawalan (Y/N)           : ");
		pengawalan = keyboard.next();

		platNomor	= platNomor % 2;
		tanggal 	= tanggal % 2;
		serasi 		= ( platNomor == tanggal );

		syaratLibur 	= ( serasi || !serasi );
		syaratTidakLibur= serasi;

		syaratRodaDua	= ( kapasitasMesin >= 1000 || 
						  ( kapasitasMesin < 1000 && suratIzin.equals("Y") && pengawalan.equals("Y") ) );


		if ( hariLibur.equals("Y")) {
			if ( syaratLibur ) {
				if ( jenisKendaraan > 2 || ( jenisKendaraan == 2 && syaratRodaDua )) {
					System.out.println("\nDiizinkan memasuki Toll");
				}
				else {
					System.out.println("\nTidak diizinkan memasuki Toll");
				}				
			}
		} 
		else if ( hariLibur.equals("N")) {
			if ( syaratTidakLibur ) {
				if ( jenisKendaraan > 2 || ( jenisKendaraan == 2 && syaratRodaDua )) {
					System.out.println("\nDiizinkan memasuki Toll");
				}
				else {
					System.out.println("\nTidak diizinkan memasuki Toll");
				}
			}else{
				System.out.println("\nTidak diizinkan memasuki Toll");				
			}
		}

		System.out.println("___________________________________________");
		System.out.println();
		System.out.println("        SEMOGA SELAMAT SAMPAI TUJUAN       ");
		System.out.println("___________________________________________");
	}
}

/*
1. Tol Ganjil/Genap

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
___________________________________________

*/