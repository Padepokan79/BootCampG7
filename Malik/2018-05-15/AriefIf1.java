/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 10:47AM
update		: 15-05-2018 8:34PM

Soal :

Tol Ganjil/Genap

Plat nomor yang boleh masuk ditentukan berdasarkan tanggal, ganjil atau genap. Namun jika tanggal merah, dan hari libur, 
semua kendaraan boleh masuk. Kendaraan roda dua dengan kapasitas mesin dibawah 1000 CC dilarang masuk kapanpun itu, tetapi 
jika memiliki izin dari kepolisian dan dikawal langsung oleh polisi, kendaraan apapun boleh masuk.

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

import java.util.Scanner;
public class AriefIf1{
	public static void main(String[] args){
		Scanner tol = new Scanner(System.in);

		int tgl, kapasitas, plat, satu, tigaSatu, seribu;
		String hari, jenis, surat, pengawalan;
		boolean tglGanjil, tglGenap, platGenap, platGanjil;

		System.out.println("___________________________________________");
		System.out.println("Jalan Bebas Hambatan dan Kenangan PasoePati");
		System.out.println("___________________________________________");
		System.out.print("Plat nomer : ");
		plat = tol.nextInt();
		System.out.print("Tanggal : ");
		tgl = tol.nextInt();
		System.out.print("Hari Libur (Y/N): ");
		hari = tol.next();
		System.out.print("Jenis kendaraan (Motor/Mobil) : ");
		jenis = tol.next();
		System.out.print("Kapasitas Mesin : ");
		kapasitas = tol.nextInt();
		System.out.print("Surat Izin (Y/N) : ");
		surat = tol.next();
		System.out.print("Pengawalan (Y/N) : ");
		pengawalan = tol.next();

		tglGanjil 	= (( tgl % 2 ) < 0); 
		tglGenap 	= (( tgl % 2 ) == 0);
		platGenap 	= (( plat % 2 ) == 0);
		platGanjil 	= (( plat % 2 ) < 0);

		satu 		= 1;
		tigaSatu	= 31;
		seribu		= 1000;

		if ( tgl > satu && tgl <= tigaSatu ) {
			if ( hari.equals("Y") ) {
				System.out.println("Status : Bebas Masuk Hari Libur");
			}else{
				if ( surat.equals("Y") && pengawalan.equals("Y") ) {
					System.out.println("Status : Diijinkan masuk Toll");	
				}else if ( tglGanjil != platGenap  ) {
					System.out.println("Status : Khusus kendaraan plat Ganjil");
				}else if ( tglGenap != platGanjil ) {
					System.out.println("Status : Khusus kendaraan plat Genap");
				}else if ( kapasitas < seribu && jenis.equals("Motor") ) {
					System.out.println("Status : Kendaraan roda dua dilarang masuk");
				}
			}
		}


		System.out.println("___________________________________________");
		System.out.println("Selamat Sampai Tujuan");
		System.out.println("___________________________________________");
	}
}