/*
Creted by	: Yana
Time		: 19 Mei 2018 17.30
*/

import java.util.Scanner;
import java.util.Random;

public class RichaDoWhile{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int	tahunSekarang=2018, tahun=25, tahun2018, gaji, gajiTotal, naikPangkat;
		String kenaikan;

		gaji 		= 1500000;
		gajiTotal 	= 0;

		tahun = tahunSekarang - tahun;
		tahun = tahun - 1961;
		tahun2018 = tahun + (tahunSekarang - 1993);
		gajiTotal = gajiTotal + gaji;
		do{
			gaji = gaji;
			for (naikPangkat = 0; naikPangkat < 5; naikPangkat++) {	
				System.out.println("Tahun : "+tahun);
				System.out.println("Gaji  : "+gaji);			
				tahun = tahun + 1;
				gaji = gaji + (gaji * 5 / 100);
				gajiTotal = gajiTotal + gaji;
				if(tahun == tahun2018)
					naikPangkat = 5;
			}
			tahun 	= tahun;
			if(tahun <= tahunSekarang){
				System.out.print(tahun+" naik pangkat: (Y/T) ? ");
				kenaikan = keyboard.next();
				System.out.println();
				if (kenaikan.equals("Y"))
					gaji 	= gaji * 2;
			}
		}while(tahun <= tahun2018);
	}
}
/*

25 tahun yang lalu gaji pak Jokowi hanya 1500.000. Setelah berkarir cukup lama gaji pak jokowi
meningkat 5% per tahunnya dan tiap 5 tahun beliau mungkin naik pangkat hingga gajinya 
menjadi 2 kali lipat dari yang sebelumnya. Berapa gaji pak jokowi sekarang?

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