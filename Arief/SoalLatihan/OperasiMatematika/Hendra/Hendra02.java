/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.text.DecimalFormat;

public class Hendra02{
	public static void main( String[] args){
		double gapok, gapokjkt, umk, umkjkt, tunjKesehatan, tunjKesehatanjkt, bonus, totalBonus1, totalBonus2, totalBonus3, jlhProjek1, jlhProjek2, jlhProjek3, uangLembur, uangLemburjkt, totalLembur1, totalLembur2, totalLembur3, jamLembur1, jamLembur2, jamLembur3, tunjTransportasi, pph, totalpph1, totalpph2, totalpph3, gajiBulanan, thp, totalthp1, totalthp2, totalthp3, totalApril, totalMei, totalJuni;
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Pendapatan
		umk = 3091445.56; // Rp. 3.091.445,56
		umkjkt = 3648035.82;
		gapok = (120.0/100) * umk;
		gapokjkt = (120.0/100) * umkjkt;
		tunjKesehatan = (2.0/100) * gapok;
		tunjKesehatanjkt = (2.0/100) * gapokjkt;
		bonus = 500000;
		uangLembur = 1.5 * (1.0/173) * gapok; // Lembur per jam
		uangLemburjkt = 1.5 * (1.0/173) * gapokjkt; // Lembur per jam
		tunjTransportasi = 750000;

		// Hitungan Akkhir
		// April
		jlhProjek1 = 2;
		jamLembur1 = 10;
		totalBonus1 = bonus * jlhProjek1;
		totalLembur1 = uangLembur * jamLembur1;
		gajiBulanan = gapok + tunjKesehatan + totalBonus1 + totalLembur1;
		totalpph1 = (5.0/100) * gajiBulanan;
		totalthp1 = gajiBulanan - totalpph1;
		// Mei
		jlhProjek2 = 0;
		jamLembur2 = 5;
		totalBonus2 = bonus * jlhProjek2;
		totalLembur2 = uangLembur * jamLembur2;
		gajiBulanan = gapok + tunjKesehatan + totalBonus2 + totalLembur2;
		totalpph2 = (5.0/100) * gajiBulanan;
		totalthp2 = gajiBulanan - totalpph2;
		// Juni
		jlhProjek3 = 1;
		jamLembur3 = 12;
		totalBonus3 = bonus * jlhProjek3;
		totalLembur3 = uangLemburjkt * jamLembur3;
		gajiBulanan = gapokjkt + tunjKesehatanjkt + tunjTransportasi + totalBonus3 + totalLembur3;
		totalpph3 = (5.0/100) * gajiBulanan;
		totalthp3 = gajiBulanan - totalpph3;

		//April
		System.out.println("       Salary Bulan April      ");
		System.out.println("*******************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*******************************");
		System.out.println("Gaji Pokok 	: " + df.format(gapok));
		System.out.println("T.Kesehatan	: " + df.format(tunjKesehatan));
		System.out.println("Bonus		: " + df.format(totalBonus1));
		System.out.println("Lembur		: " + df.format(totalLembur1));
		System.out.println("PPH		: " + df.format(totalpph1));
		System.out.println("===============================");
		System.out.println("Take Home Pay	: " + df.format(totalthp1));
		System.out.println("===============================");
		
		//Mei
		System.out.println("        Salary Bulan Mei       ");
		System.out.println("*******************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*******************************");
		System.out.println("Gaji Pokok 	: " + df.format(gapok));
		System.out.println("T.Kesehatan	: " + df.format(tunjKesehatan));
		System.out.println("Bonus		: " + df.format(totalBonus2));
		System.out.println("Lembur		: " + df.format(totalLembur2));
		System.out.println("PPH		: " + df.format(totalpph2));
		System.out.println("===============================");
		System.out.println("Take Home Pay	: " + df.format(totalthp2));
		System.out.println("===============================");
		
		//Juni
		System.out.println("       Salary Bulan Juni       ");
		System.out.println("*******************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*******************************");
		System.out.println("Gaji Pokok 	: " + df.format(gapokjkt));
		System.out.println("T.Kesehatan	: " + df.format(tunjKesehatanjkt));
		System.out.println("T.Transportasi	: " + df.format(tunjTransportasi));
		System.out.println("Bonus		: " + df.format(totalBonus3));
		System.out.println("Lembur		: " + df.format(totalLembur3));
		System.out.println("PPH		: " + df.format(totalpph3));
		System.out.println("===============================");
		System.out.println("Take Home Pay	: " + df.format(totalthp3));
		System.out.println("===============================");
		// Total		
		System.out.println("Total Take Home Pay	selama 3 bulan: " + df.format(totalthp1 + totalthp2 + totalthp3));

	}
}

/*
Nurwan adalah seorang Programmer disebuah perusahaan IT dibandung, yang memiliki gaji pokok sebesar 120% dari UMK
(UMK mengikuti Penempatan Kerja).
Mendapatkan tunjangan kesehatan sebesar 2% dari gaji Pokok, Mendapatkan bonus sebesar 500.000 untuk setiap project yang diselesaikan.
Serta mendapatkan uang Lembur sebesar 1,5 x 1/173 x Gaji Pokok per jam nya. 
Serta Mendapatkan tunjangan transportasi Sebesar 750.000 jika dia bekerja diluar kota bandung.

Mendapatkan potongan PPH sebesar 5% dari Gaji Perbulan(Gaji Perbulan didapat dari jumlah Gaji Pokok, Bonus, Lembur, Tunjangan Kesehatan,
Tunjangan Transportasi)

Hitunglah Take Home Pay Nurwan Perbulannya dan Total Take Home Pay Nurwan Selama 3 bulan. Jika:
Bulan April menyelesaikan 2 project dan melakukan lembur selama 10 jam.
Bulan Mei melakukan lembur selama 5 jam.
Bulan Juni ditempatkan di Jakarta Pusat. menyelesaikan 1 project dan melakukan 12 jam lembur.

OutPut yang Diinginkan:

Salalry Bulan April
*******************************
Nama : Nurwan
Posisi : Programmer
*******************************
Gaji Pokok 	:
T.Kesehatan	:
Bonus		:
Lembur		:

PPH		:
===============================
Take Home Pay	:
===============================
*/