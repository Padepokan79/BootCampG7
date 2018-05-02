/* 
Created by 	: Yana 
time		: 1 Mei 2018

2. Di toko Bu Poniem tersedia 12 karung beras. Setiap karung beratnya 50 kg. 
Jika hari ini dan kemarin masing-masing terjual 175 kg dan 120 kg, 
berapa kg sisa beras di warung Bu Poniem sekarang ?

*/

public class Andrian2{
	public static void main(String[] args){

		int jumlahKarung, beratPerKarung, penjualanHariIni, penjualanKemarin, sisaBeratBeras;

		jumlahKarung		= 12;
		beratPerKarung		= 50;
		penjualanHariIni	= 175;
		penjualanKemarin	= 120;
		sisaBeratBeras		= 0;

		sisaBeratBeras		= jumlahKarung * beratPerKarung;
		sisaBeratBeras		= sisaBeratBeras - penjualanHariIni - penjualanKemarin;

		System.out.println();
		System.out.println("Jumlah sisa beras di warung Bu Poniem adalah " +sisaBeratBeras+ " Kg");

	}
}