/*
	 Program     : Soal 2 - Malik
     Creator     : Khairil
     Created At  : 16 Mei 2018 09:20 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class MalikIfElse2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean jans, febs, mars, aprs, meis, juns, juls, agus, sept, okts, novs, dess;
		int inputHari, jumlahHari, jumlahMinggu, sisaHari, penentuBulanHari, satuAjah, duaAjah, jan, feb, mar, apr, mei, jun, jul, agu, sep, okt, nov, des;
		String inputBulan, januari, februari, maret, april, may, juni, juli, agustus, september, oktober, november, desember;
		System.out.println("Apa yang ingin anda tentukan (nama bulan/jumlah hari)");
		System.out.println("1> Nama Bulan");
		System.out.println("2> Jumlah Hari");
		penentuBulanHari = keyboard.nextInt();

		satuAjah = 1;
		duaAjah = 2;

		if(penentuBulanHari == satuAjah) {
			System.out.println("Ketikan nama bulan (januari-desember) : ");
			inputBulan = keyboard.next();

			jans = inputBulan.equals("januari");
			febs = inputBulan.equals("februari");
			mars = inputBulan.equals("maret");
			aprs = inputBulan.equals("april");
			meis = inputBulan.equals("mei");
			juns = inputBulan.equals("juni");
			juls = inputBulan.equals("juli");
			agus = inputBulan.equals("agustus");
			sept = inputBulan.equals("september");
			okts = inputBulan.equals("oktober");
			novs = inputBulan.equals("november");
			dess = inputBulan.equals("desember");

			januari = "Januari";
			februari = "Februari";
			maret = "Maret";
			april = "April";
			may = "Mei";
			juni = "Juni";
			juli = "Juli";
			agustus = "Agustus";
			september = "September";
			oktober = "Oktober";
			november = "November";
			desember = "Desember";

			jan = mar = mei = jul = agu = okt = des = 31;
			apr = jun = sep = nov = 30;
			feb = 28;

			if(jans) {
				jumlahHari = jan;
				jumlahMinggu = jan / 7;
				sisaHari = jan % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			}
			else if(febs) {
				jumlahHari = feb;
				jumlahMinggu = feb / 7;
				sisaHari = feb % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(mars) {
				jumlahHari = mar;
				jumlahMinggu = mar / 7;
				sisaHari = mar % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(aprs) {
				jumlahHari = apr;
				jumlahMinggu = apr / 7;
				sisaHari = apr % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(meis) {
				jumlahHari = mei;
				jumlahMinggu = mei / 7;
				sisaHari = mei % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(juns) {
				jumlahHari = jun;
				jumlahMinggu = jun / 7;
				sisaHari = jun % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(juls) {
				jumlahHari = jul;
				jumlahMinggu = jul / 7;
				sisaHari = jul % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(agus) {
				jumlahHari = agu;
				jumlahMinggu = agu / 7;
				sisaHari = agu % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(sept) {
				jumlahHari = sep;
				jumlahMinggu = sep / 7;
				sisaHari = sep % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(okts) {
				jumlahHari = okt;
				jumlahMinggu = okt / 7;
				sisaHari = okt % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(novs) {
				jumlahHari = nov;
				jumlahMinggu = nov / 7;
				sisaHari = nov % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			} 
			else if(dess) {
				jumlahHari = des;
				jumlahMinggu = des / 7;
				sisaHari = des % 7;
				System.out.println("jumlah hari   : " + jumlahHari + " hari");
				System.out.println("jumlah minggu : " + jumlahMinggu + " minggu " + sisaHari + " hari");				
			}
			else {
				System.out.println("Nama bulan salah");
			} 
		}
		else if(penentuBulanHari == duaAjah) {
			System.out.println("Ketikan jumlah hari : ");
			inputHari = keyboard.nextInt();

			if(inputHari == 31) {
				System.out.println("jumlah bulan dengan 31 hari : Januari, Maret, Mei, Juli, Agustus, Oktober, Desember");
			}
			else if(inputHari == 30) {
				System.out.println("jumlah bulan dengan 30 hari : April, Juni, September, November");
			}
			else if(inputHari == 29) {
				System.out.println("jumlah bulan dengan 29 hari : Februari");
			}			
			else {
				System.out.println("Tidak ada bulan dengan jumlah hari yang dimaksud");
			}
		} 
		else {
			System.out.println("Pilihan Tidak ada");
		}
	}
}