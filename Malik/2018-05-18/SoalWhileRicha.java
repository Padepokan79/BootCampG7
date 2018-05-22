/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 9:13PM

Soal :

25 tahun yang lalu gaji pak Jokowi hanya 1.500.000. Setelah berkarir cukup lama gaji pak jokowi
meningkat 5% per tahunnya dan tiap 5 tahun beliau mungkin naik pangkat hingga gajinya menjadi 2 kali lipat dari yang sebelumnya. 
Berapa gaji pak jokowi sekarang?

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
33 1653750
34 1736437.5
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

public class SoalWhileRicha{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		double gajiJokowi, persenNaikGaji, tahunNaikGaji;
		int umur, umurNaik, maxUmur, dua;
		String naikPangkat;

		gajiJokowi		= 1500000;
		persenNaikGaji	= 5.0/100;
		tahunNaikGaji	= 5;

		umur		    = 31;
		umurNaik 		= 35;
		maxUmur			= 56;
		dua 			= 2;
		
		System.out.println("======================");
		System.out.println("      GAJI JOKOWI     ");	
		System.out.println("======================");

		while( umur <= maxUmur ){
			while( umur <= umurNaik && umur <= maxUmur ){	
				System.out.println();
				System.out.println("Umur Jokowi  : "+umur);
				System.out.println("Gaji Jokowi  : Rp. "+gajiJokowi);	
				System.out.println("Naik Pangkat : Tidak");
				System.out.println("---------------------------");
				umur++;
				gajiJokowi = gajiJokowi+(gajiJokowi*persenNaikGaji);
			}
			if ( umur <= maxUmur ) {
				System.out.println();
				System.out.println("Jabatan Jokowi sudah masuk 5 Tahun");
				System.out.print("Apakah Jokowi ingin naik pangkat ? (Y/N) : ");
				naikPangkat = scan.next();
				if ( naikPangkat.equals("Y") ) {
					umurNaik += tahunNaikGaji;
					gajiJokowi *= dua;
				}else{	
					 umurNaik += tahunNaikGaji;
				}
			}
		}
		if ( umur > maxUmur ) {
			System.out.println();
			System.out.println("USIA ANDA SUDAH MAKSIMAL");
			System.out.println("SILAHKAN PENSIUN");
			System.out.println("KEKAYAAN ANDA Rp. "+gajiJokowi);
		}				
	}
}