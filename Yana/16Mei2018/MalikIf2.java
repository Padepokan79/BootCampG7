/*
Created by	: Yana
Time		: 16 Mei 2018 09.08
*/

import java.util.Scanner;

public class MalikIf2{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String 	pilihan, namaBulan, januari, februari;
		int 	jumlahHari, januariHari, februariHari, maretHari, aprilHari, meiHari, 
				juniHari, juliHari, agustusHari, septemberHari, oktoberHari, nopemberHari, desemberHari,
				jumlahMinggu, sisaHari, hariPerMinggu, hari28, hari30, hari31;

		hari31	= januariHari = maretHari = meiHari = juliHari = agustusHari = oktoberHari = desemberHari = 31;
		hari28	=  februariHari	= 28;
		hari30	=  aprilHari = juniHari = septemberHari = nopemberHari = 30;
		hariPerMinggu 	= 7;

		System.out.println("=============================");
		System.out.println("         SUPER MONTH");
		System.out.println("=============================");
		System.out.println();
		System.out.print("Apa yang Anda inginkan (Nama Bulan[N] / Jumlah Hari[J]): ");
		pilihan = keyboard.next();

		if ( pilihan.equals("N") ) {
			System.out.print("Masukkan nama Bulan (Januari - Desember): ");
			namaBulan = keyboard.next();
			
			if ( namaBulan.equals("Januari") ) {
				System.out.println("Jumlah hari   : " +januariHari);
				jumlahMinggu	= januariHari / hariPerMinggu;
				sisaHari		= januariHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Februari") ) {
				System.out.println("Jumlah hari   : " +februariHari);
				jumlahMinggu	= februariHari / hariPerMinggu;
				sisaHari		= februariHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Maret") ) {
				System.out.println("Jumlah hari   : " +maretHari);
				jumlahMinggu	= maretHari / hariPerMinggu;
				sisaHari		= maretHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("April") ) {
				System.out.println("Jumlah hari   : " +aprilHari);
				jumlahMinggu	= aprilHari / hariPerMinggu;
				sisaHari		= aprilHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Mei") ) {
				System.out.println("Jumlah hari   : " +meiHari);
				jumlahMinggu	= meiHari / hariPerMinggu;
				sisaHari		= meiHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Juni") ) {
				System.out.println("Jumlah hari   : " +juniHari);
				jumlahMinggu	= juniHari / hariPerMinggu;
				sisaHari		= juniHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Juli") ) {
				System.out.println("Jumlah hari   : " +juliHari);
				jumlahMinggu	= juliHari / hariPerMinggu;
				sisaHari		= juliHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Agustus") ) {
				System.out.println("Jumlah hari   : " +agustusHari);
				jumlahMinggu	= agustusHari / hariPerMinggu;
				sisaHari		= agustusHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("September") ) {
				System.out.println("Jumlah hari   : " +septemberHari);
				jumlahMinggu	= septemberHari / hariPerMinggu;
				sisaHari		= septemberHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Oktober") ) {
				System.out.println("Jumlah hari   : " +oktoberHari);
				jumlahMinggu	= oktoberHari / hariPerMinggu;
				sisaHari		= oktoberHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Nopember") ) {
				System.out.println("Jumlah hari   : " +nopemberHari);
				jumlahMinggu	= nopemberHari / hariPerMinggu;
				sisaHari		= nopemberHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else if ( namaBulan.equals("Desember") ) {
				System.out.println("Jumlah hari   : " +desemberHari);
				jumlahMinggu	= desemberHari / hariPerMinggu;
				sisaHari		= desemberHari%jumlahMinggu;
				System.out.println("Jumlah Minggu : " +jumlahMinggu+ " minggu " +sisaHari+ " hari");
			}
			else{
				System.out.println("Nama Bulan tidak sesuai");
			}
		}
		else if ( pilihan.equals("J") ) {
			System.out.print("Masukkan jumlah hari: ");
			jumlahHari = keyboard.nextInt();

			if ( jumlahHari < 28 || jumlahHari == 29 || jumlahHari > 31) {
				System.out.println("Masukkan jumlah hari setara 28, 30 atau 31");
			} else{
				System.out.print("Nama bulan dengan jumlah hari " +jumlahHari+ " hari adalah : ");
				if ( jumlahHari == hari28 ) {
					System.out.print("Februari");
				}
				else if ( jumlahHari == hari30 ) {
					System.out.print("April, Juni, September, Nopember");
				}
				else {
					System.out.print("Januari, Maret, Mei, Juli, Agustus, Oktober, Desember");
				}
			}
		}
		else{
			System.out.println("Pilihan tidak tersedia");
		}
		
	}
}
/*
2. Andi ingin menentukan statistik bulan, mulai dari januari sampai desember.
   baik berdasarkan nama dan hari. hari maksimal 31 hari. jika jumlah hari kurang
   dari 29 maka tidak ada bulan dengan jumlah hari tsb.

   output :

   ====================
       super month
   ====================
   apa yang ingin anda tentukan(nama bulan/jumlah hari) :

   -- jika "nama bulan" --

   Ketikan nama bulan (januari-desember) : januari

   jumlah hari : 31 hari
   jumlah minggu : 4 minggu 3 hari

   -- jika "jumlah hari" --

   ketikan jumlah hari : 31

   jumlah bulan dengan 31 hari : januari, maret, dst;
   */