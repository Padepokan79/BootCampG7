/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Malik02 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		int bulan, hari, totHari, totMinggu, hari30, hari31, hari29, week, day,
			jan, feb, mar, apr, mei, jun, jul, ags, sep, okt, nov, des;
		String 	choice, month;
		boolean cBulan, cHari, januari, februari, maret, april, may, juni,
				juli, agustus, september, oktober, november, desember;

		jan = mar = mei = jul = ags = okt = des = 31;
		apr = jun = sep = nov = 30;
		feb = 28;
		week = 4;

		System.out.println("======================");
		System.out.println("      SUPER MONTH     ");
		System.out.println("======================");
		System.out.println("apa yang ingin anda tentukan(nama bulan/jumlah hari) :");
		choice = inputKey.nextLine();
		cBulan = choice.equals("nama bulan");
		cHari = choice.equals("jumlah hari");

		if (cBulan) {
			System.out.println("Ketikan nama bulan (januari-desember): ");
			month = inputKey.next();
			januari = month.equals("januari");
			februari = month.equals("februari");
			maret = month.equals("maret");
			april = month.equals("april");
			may = month.equals("mei");
			juni = month.equals("juni");
			juli = month.equals("juli");
			agustus = month.equals("agustus");
			september = month.equals("september");
			oktober = month.equals("oktober");
			november = month.equals("november");
			desember = month.equals("desember");

			if (januari) {
				hari = jan % week;
				System.out.println(" Jumlah Hari\t: " + jan + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (februari) {
				hari = feb % week;
				System.out.println(" Jumlah Hari\t: " + feb + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (maret) {
				hari = mar % week;
				System.out.println(" Jumlah Hari\t: " + mar + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (april) {
				hari = apr % week;
				System.out.println(" Jumlah Hari\t: " + apr + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (may) {
				hari = mei % week;
				System.out.println(" Jumlah Hari\t: " + mei + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (juni) {
				hari = jun % week;
				System.out.println(" Jumlah Hari\t: " + jun + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (juli) {
				hari = jul % week;
				System.out.println(" Jumlah Hari\t: " + jul + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (agustus) {
				hari = ags % week;
				System.out.println(" Jumlah Hari\t: " + ags + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (september) {
				hari = sep % week;
				System.out.println(" Jumlah Hari\t: " + sep + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (oktober) {
				hari = okt % week;
				System.out.println(" Jumlah Hari\t: " + okt + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (november) {
				hari = nov % week;
				System.out.println(" Jumlah Hari\t: " + nov + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}else if (desember) {
				hari = des % week;
				System.out.println(" Jumlah Hari\t: " + des + " hari");
				System.out.println(" Jumlah Minggu\t: " + week + " minggu " + hari + " hari");
			}
		}else if (cHari) {
			System.out.println("ketikan jumlah hari : ");
			day = inputKey.nextInt();
			if ( day == feb ) {
				System.out.println("Jumlah bulan dengan " + day + " hari : ");
				System.out.println("Februari");
			}else if ( day == apr ) {
				System.out.println("Jumlah bulan dengan " + day + " hari : ");
				System.out.println("April, Juni, September, November");
			}else if ( day == jan ) {
				System.out.println("Jumlah bulan dengan " + day + " hari : ");
				System.out.println("Januari, Maret, Mei, Juli, Agustus, Oktober, Desember");
			}else{

				System.out.println("Tidak ditemukan bulan dengan jumlah hari: " + day + " hari");
			}
		}
	}	
}