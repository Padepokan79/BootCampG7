/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 1:32PM

Soal :

Andi ingin menentukan statistik bulan, mulai dari januari sampai desember.
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

import java.util.Scanner;
public class MalikIf1{
	public static void main(String[] args){
		Scanner bulan = new Scanner(System.in);

		String text, namaBulan;
		int jan, feb, mar, apr, mei, jun, jul, agu, sep, okt, nov, des, minggu, hariDay, minHari, midHari, maxHari;
		int hari;
		minHari = 28; midHari = 30; maxHari = 31;
		minggu = 4;
		jan = 31; feb = 28; mar = 31; apr = 30; mei = 31; jun = 30; jul = 31; agu = 31; sep = 30; okt = 31; nov = 30; des = 31;

		System.out.println("======================");
		System.out.println("      SUPER MONTH     ");
		System.out.println("======================");
		System.out.print("Apa yang ingin anda tentukan(nama bulan/ jumlah hari)");
		text = bulan.nextLine();

		if ( text.equals("nama bulan") ) {
			System.out.print("Ketikan nama bulan (januari-desember) : ");
			namaBulan = bulan.nextLine();

			if ( namaBulan.equals("januari") ) {
				hari = jan%minggu;
				System.out.println(" Jumlah Hari : "+jan+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("februari") ) {
				hari = feb%minggu;
				System.out.println(" Jumlah Hari : "+feb+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("maret") ) {
				hari = mar%minggu;
				System.out.println(" Jumlah Hari : "+mar+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("april") ) {
				hari = apr%minggu;
				System.out.println(" Jumlah Hari : "+apr+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("mei") ) {
				hari = mei%minggu;
				System.out.println(" Jumlah Hari : "+mei+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("juni") ) {
				hari = jun%minggu;
				System.out.println(" Jumlah Hari : "+jun+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("juli") ) {
				hari = jul%minggu;
				System.out.println(" Jumlah Hari : "+jul+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("agustus") ) {
				hari = agu%minggu;
				System.out.println(" Jumlah Hari : "+agu+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("september") ) {
				hari = sep%minggu;
				System.out.println(" Jumlah Hari : "+sep+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("oktober") ) {
				hari = okt%minggu;
				System.out.println(" Jumlah Hari : "+okt+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("november") ) {
				hari = nov%minggu;
				System.out.println(" Jumlah Hari : "+nov+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}else if ( namaBulan.equals("desember") ) {
				hari = des%minggu;
				System.out.println(" Jumlah Hari : "+des+" hari");
				System.out.println(" Jumlah Minggu : "+minggu+ " minggu "+hari+" hari");
			}
		}else if ( text.equals("jumlah hari") ) {
			System.out.print("Ketikan jumlah hari : ");
			hariDay = bulan.nextInt();

			if ( hariDay == minHari ) {
				System.out.println("Jumlah bulan dengan "+hariDay+" hari : ");
				System.out.println("februari");
			}else if ( hariDay == midHari ) {
				System.out.println("Jumlah bulan dengan "+hariDay+" hari : ");
				System.out.println("april, juni, september, november");
			}else if ( hariDay == maxHari ) {
				System.out.println("Jumlah bulan dengan "+hariDay+" hari : ");
				System.out.println("januari, mei, juli, agustus, oktober, desember");
			}else{

				System.out.println("tidak ada bulan dengan jumlah "+hariDay);
			}
		}


	}
}