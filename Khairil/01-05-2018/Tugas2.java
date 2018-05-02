/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 09:30 AM     
     Updated By  : 
     Update Date : 
*/
class Tugas2 {
	public static void main(String[] args) {
		String nama, posisi;
		int jumProject, jamLembur, dinas;
		double umk, uangLembur, tunjKesehatan, tunjTransport, gajiPokok, 
			   bonusProject, takeHomePay, potPph, gajiBulanan;

		nama = "Nurwan";
		posisi = "Programmer";
		umk = 3091445.56;
		gajiPokok = 1.2 * umk;
		tunjKesehatan = 0.02 * gajiPokok;
		System.out.println("Salary Bulan April 			   ");
		System.out.println("*******************************");
		System.out.println("Nama          : " + nama);
		System.out.println("Posisi        : " + posisi);
		System.out.println("\n*******************************");
		dinas = 0;
		jamLembur  = 10;
		jumProject = 2;
		bonusProject = 500000 * jumProject;
		tunjTransport = 750000 * dinas;
		uangLembur = 1.5 * (1.0/173.0) * gajiPokok * jamLembur; //per jam
		gajiBulanan = gajiPokok + bonusProject + uangLembur + tunjKesehatan + tunjTransport;
		potPph = 0.05 * gajiBulanan;
		takeHomePay = gajiBulanan - potPph;
		System.out.println("Gaji Pokok 	  : " + Math.ceil(gajiPokok));
		System.out.println("T.Kesehatan	  : " + Math.ceil(tunjKesehatan));
		System.out.println("Bonus		  : " + Math.ceil(bonusProject));
		System.out.println("Lembur		  : " + Math.ceil(uangLembur));
		System.out.println();
		System.out.println("PPH		      : " + Math.ceil(potPph));
		System.out.println("===============================");
		System.out.printf("Take Home Pay : Rp %.2f", Math.ceil(takeHomePay));
		System.out.println("\n===============================");
		System.out.println();
		System.out.println();
		System.out.println("Salary Bulan Mei 			   ");
		System.out.println("*******************************");
		System.out.println("Nama          : " + nama);
		System.out.println("Posisi        : " + posisi);
		System.out.println("*******************************");
		dinas = 0;
		jamLembur  = 5;
		jumProject = 0;
		bonusProject = 500000 * jumProject;		
		tunjTransport = 750000 * dinas;
		uangLembur = 1.5 * (1.0/173.0) * gajiPokok * jamLembur; //per jam
		gajiBulanan = gajiPokok + bonusProject + uangLembur + tunjKesehatan + tunjTransport;
		potPph = 0.05 * gajiBulanan;
		takeHomePay = gajiBulanan - potPph;
		System.out.println("Gaji Pokok 	  : " + Math.ceil(gajiPokok));
		System.out.println("T.Kesehatan	  : " + Math.ceil(tunjKesehatan));
		System.out.println("Bonus		  : " + Math.ceil(bonusProject));
		System.out.println("Lembur		  : " + Math.ceil(uangLembur));
		System.out.println();
		System.out.println("PPH		      : " + Math.ceil(potPph));
		System.out.println("===============================");
		System.out.printf("Take Home Pay : Rp %.2f", Math.ceil(takeHomePay));
		System.out.println("\n===============================");
		System.out.println();
		System.out.println();
		System.out.println("Salary Bulan Juni 			   ");
		System.out.println("*******************************");
		System.out.println("Nama          : " + nama);
		System.out.println("Posisi        : " + posisi);
		System.out.println("*******************************");
		dinas = 1;
		jamLembur  = 12;
		jumProject = 1;
		umk = 3648035;
		gajiPokok = 1.2 * umk;
		tunjKesehatan = 0.02 * gajiPokok;
		bonusProject = 500000 * jumProject;		
		tunjTransport = 750000 * dinas;
		uangLembur = 1.5 * (1.0/173.0) * gajiPokok * jamLembur; //per jam
		gajiBulanan = gajiPokok + bonusProject + uangLembur + tunjKesehatan + tunjTransport;
		potPph = 0.05 * gajiBulanan;
		takeHomePay = gajiBulanan - potPph;
		System.out.println("Gaji Pokok 	  : " + Math.ceil(gajiPokok));
		System.out.println("T.Kesehatan	  : " + Math.ceil(tunjKesehatan));
		System.out.println("T.Transport	  : " + Math.ceil(tunjTransport));		
		System.out.println("Bonus		  : " + Math.ceil(bonusProject));
		System.out.println("Lembur		  : " + Math.ceil(uangLembur));
		System.out.println();
		System.out.println("PPH		      : " + Math.ceil(potPph));
		System.out.println("===============================");
		System.out.printf("Take Home Pay : Rp %.2f", Math.ceil(takeHomePay));
		System.out.println("\n===============================");
		System.out.println();
		System.out.println();
	}
}

/*
Nurwan adalah seorang Programmer disebuah perusahaan IT dibandung, yang memiliki gaji pokok sebesar 120% dari UMK(UMK mengikuti Penempatan Kerja).
Mendapatkan tunjangan kesehatan sebesar 2% dari gaji Pokok, Mendapatkan bonus sebesar 500.000 untuk setiap project yang diselesaikan.
Serta mendapatkan uang Lembur sebesar 1,5 x 1/173 x Gaji Pokok per jam nya. 
Serta Mendapatkan tunjangan transportasi Sebesar 750.000 jika dia bekerja diluar kota bandung.

Mendapatkan potongan PPH sebesar 5% dari Gaji Perbulan(Gaji Perbulan didapat dari jumlah Gaji Pokok, Bonus, Lembur, Tunjangan Kesehatan, Tunjangan Transportasi)

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