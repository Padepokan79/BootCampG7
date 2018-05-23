/*
	DATE CREATED : 20 MEI 2018
	TIME CREATED : 10.30 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	Soal looping (Richa)

	25 tahun yang lalu gaji pak Jokowi hanya 1500.000. Setelah berkarir cukup lama gaji pak jokowi
	meningkat 5% per tahunnya dan tiap 5 tahun beliau mungkin naik pangkat hingga gajinya menjadi 
	2 kali lipat dari yang sebelumnya. Berapa gaji pak jokowi sekarang?

	output:
	==================
	 Gaji Pak Jokowi
	==================

	Umur: 31 tahun
	Naik pangkat? Tidak
	gaji : 1500000

	-------------------
	Umur: 32 tahun
	Naik pangkat? Tidak
	gaji : 1575000

	-------------------
	.
	.
	.
	.
	.
	.
	------------------
	Umur: 35 tahun
	Naik pangkat? (y/n)
	y
	gaji: 3472875

	------------------
	Umur: 36 tahun
	Naik pangkat? Tidak
	gaji: 3646518

	------------------
	.
	.
	.
	.
	.
	.
	dan seterusnya


*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileRicha{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int gajiAwal, usiaAwal, usiaNaik, usiaSkrang, gajiNaik, tahunNaik;
		double kenaikanGaji;
		String inputPangkat;

		gajiAwal = 1500000;
		usiaSkrang = 56;
		usiaAwal = 31;
		usiaNaik = 35;
		tahunNaik = 5;
		gajiNaik = 0;

		

		System.out.println("=======================");
		System.out.println("    GAJI PAK JOKOWI    ");
		System.out.println("=======================");
		System.out.println("");


		while(usiaAwal <= usiaSkrang){
			while(usiaAwal <= usiaNaik && usiaAwal <= usiaSkrang){
				System.out.println("Umur        : "+usiaAwal);
				// System.out.println("Naik pangkat? Tidak");
				System.out.println("Gaji        : "+gajiAwal);
				System.out.println("");
				System.out.println("-----------------------");

				usiaAwal++;
				// gajiNaik = ;
				gajiAwal = gajiAwal + ((gajiAwal*5)/100);
			}
			if (usiaAwal <= usiaSkrang) {
				System.out.print("Di Usia "+usiaAwal+" ini Naik pangkat ? ");
				inputPangkat = keyboard.next();
				System.out.println("");
				System.out.println("-----------------------");

				if (inputPangkat.equals("ya")) {
					usiaNaik += tahunNaik;
					gajiAwal *= 2;
				}else{
					usiaNaik += tahunNaik;
				}
			}

			// if (usiaAwal > usiaSkrang) {
			// 	System.out.println("GAJI PAK JOKOWI SAAT INI : "+gajiAwal);
			// }
		}



	}
}