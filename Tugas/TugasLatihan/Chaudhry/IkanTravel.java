/*
	DATA CREATED 	: 14 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;

public class IkanTravel {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		String bis1, bis2, bis3, bis4, bis5, bis6;
		int inputKursi, harga1, harga2, harga3, harga4, harga5, harga6, qty1, qty2, qty3, qty4, qty5, qty6, max, aa, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk, ll, mm;
		boolean hasil;

		bis1 	= "Bis Dengan Kursi 60";
		bis2 	= "Bis Dengan Kursi 45";
		bis3 	= "Bis Dengan Kursi 32";
		bis4 	= "Bis Dengan Kursi 18";
		bis5 	= "Bis Dengan Kursi 12";
		bis6 	= "Bis Dengan Kursi 6 Executive";
		harga1 	= 2300000;
		harga2 	= 2000000;
		harga3 	= 1800000;
		harga4 	= 1500000;
		harga5 	= 1300000;
		harga6 	= 2000000;
		qty1 	= 60;
		qty2 	= 45;
		qty3 	= 32;
		qty4 	= 18;
		qty5 	= 12;
		qty6 	= 6; 
		max 	= 120;

		aa 	= 25;
		bb  = 30;
		cc  = 31;
		dd 	= 37;
		ee  = 51;
		ff  = 58;
		gg  = 60;
		hh  = 64;
		ii  = 73;
		jj  = 78;
		kk  = 90;
		ll  = 93;
		mm  = 106;

		System.out.println("=================================");		
		System.out.println("Selamat Datang di Ikan Travel");
		System.out.println();
		
		System.out.print("Masukan jumlah penumpang: ");
		inputKursi 	= keyboard.nextInt(); // max 120

		System.out.println();
		System.out.print("Bis yang tersedia untuk anda: ");
		System.out.println();
		System.out.println();

		if (inputKursi <= max) {
			
			if (inputKursi >= qty1) {
				System.out.println(bis1 + "\t\tRp. " + harga1);


			}
			if (inputKursi >= qty2) {
				System.out.println(bis2 + "\t\tRp. " + harga2);
			}
			if (inputKursi >= qty3) {
				System.out.println(bis3 + "\t\tRp. " + harga3);
			}
			if (inputKursi >= qty4) {
				System.out.println(bis4 + "\t\tRp. " + harga4);
			}
			if (inputKursi >= qty5) {
				System.out.println(bis5 + "\t\tRp. " + harga5);
			}
			if (inputKursi >= qty6 || inputKursi >= 1) {
				System.out.println(bis6 + "\tRp. " + harga6);

				System.out.println("\n*Rekomendasi Bis untuk anda");
				if (inputKursi <= qty6) {
					int a = 1;
					int hasil6;
					hasil6 = a*harga6;
					System.out.println(a + " Bis Dengan " + qty6 + " Executive dengan Harga " + hasil6);

				}else if (inputKursi > qty6 && inputKursi < qty5 ) {
					int a = 2;
					int hasil6;
					hasil6 = a*harga6;
					System.out.println(a + " Bis Dengan " + qty6 + " Executive dengan Harga " + hasil6);
				}else if( inputKursi == qty5 ){
					int a = 1;
					int hasil5;
					hasil5 = a*harga5;
					System.out.println(a + " Bis Dengan " + qty5 + " kursi dengan Harga " + hasil5);
				}else if( inputKursi > qty5 && inputKursi < qty4 ){
					int a = 2;
					int hasil5;
					hasil5 = a*harga5;
					System.out.println(a + " Bis Dengan " + qty5 + " kursi dengan Harga " + hasil5);
				}else if( inputKursi == qty4 ){
					int a = 1;
					int hasil4;
					hasil4 = a*harga4;
					System.out.println(a + " Bis Dengan " + qty4 + " kursi dengan Harga " + hasil4);
				}else if( inputKursi > qty4 && inputKursi < aa ){
					int a = 2;
					int hasil5;
					hasil5 = a*harga5;
					System.out.println(a + " Bis Dengan " + qty5 + " kursi dengan Harga " + hasil5);
				}else if( inputKursi >= aa && inputKursi <= bb ){
					int a = 1;
					int b = 1;
					int hasil5, hasil4, akhir;
					hasil5 = a*harga5;
					hasil4 = b*harga4;
					akhir  = hasil5 + hasil4;
					System.out.println(a + " Bis Dengan " + qty5 + " kursi dan "+b+" Bis dengan "+qty4+" kursi dengan Harga " + akhir);
				}else if( inputKursi == cc ){
					int a = 2;
					int hasil4;
					hasil4 = a*harga4;
					System.out.println(a + " Bis Dengan " + qty4 + " kursi dengan Harga " + hasil4);
				}else if( inputKursi == qty3 ){
					int a = 1;
					int hasil3;
					hasil3 = a*harga3;
					System.out.println(a + " Bis Dengan " + qty3 + " kursi dengan Harga " + hasil3);
				}else if( inputKursi > qty3 && inputKursi < dd ){
					int a = 2;
					int hasil1;
					hasil1 = a*harga4;
					System.out.println(a + " Bis Dengan " + qty4 + " kursi dengan Harga " + hasil1);
				}else if( inputKursi >= dd && inputKursi < qty2 ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga3;
					hasil2 = b*harga5;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty3 + " kursi dan "+b+" Bis dengan "+qty5+" kursi dengan Harga " + akhir);
				}else if( inputKursi == qty2 ){
					int a = 1;
					int hasil1;
					hasil1 = a*harga2;
					System.out.println(a + " Bis Dengan " + qty2 + " kursi dengan Harga " + hasil1);
				}else if( inputKursi > qty2 && inputKursi < ee ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga3;
					hasil2 = b*harga4;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty3 + " kursi dan "+b+" Bis dengan "+qty4+" kursi dengan Harga " + akhir);
				}else if( inputKursi >= ee && inputKursi < ff ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga2;
					hasil2 = b*harga5;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty2 + " kursi dan "+b+" Bis dengan "+qty5+" kursi dengan Harga " + akhir);
				}else if( inputKursi >= ff && inputKursi < gg ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga2;
					hasil2 = b*harga4;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty2 + " kursi dan "+b+" Bis dengan "+qty4+" kursi dengan Harga " + akhir);
				}
				else if( inputKursi == gg ){
					int a = 1;
					int hasil1;
					hasil1 = a*harga1;
					System.out.println(a + " Bis Dengan " + qty1 + " kursi dengan Harga " + hasil1);
				}else if( inputKursi > gg && inputKursi < hh ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga2;
					hasil2 = b*harga4;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty2 + " kursi dan "+b+" Bis dengan "+qty4+" kursi dengan Harga " + akhir);
				}else if( inputKursi == hh ){
					int a = 2;
					int hasil1;
					hasil1 = a*harga3;
					System.out.println(a + " Bis Dengan " + qty3 + " kursi dengan Harga " + hasil1);
				}else if( inputKursi > hh && inputKursi < ii ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga1;
					hasil2 = b*harga5;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty1 + " kursi dan "+b+" Bis dengan "+qty5+" kursi dengan Harga " + akhir);
				}else if( inputKursi >= ii && inputKursi < jj ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir, akhir2;
					hasil1 = a*harga1;
					hasil2 = b*harga4;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty1 + " kursi dan "+b+" Bis dengan "+qty4+" kursi dengan Harga " + akhir);

					akhir2 = (a*harga2) + (b*harga3);
					System.out.println(a + " Bis Dengan " + qty2 + " kursi dan "+b+" Bis dengan "+qty3+" kursi dengan Harga " + akhir2);
				}else if( inputKursi == jj ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga1;
					hasil2 = b*harga4;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty1 + " kursi dan "+b+" Bis dengan "+qty4+" kursi dengan Harga " + akhir);
				}else if( inputKursi > jj && inputKursi < kk ){
					int a = 2;
					int hasil1;
					hasil1 = a*harga2;
					System.out.println(a + " Bis Dengan " + qty2 + " kursi dengan Harga " + hasil1);
				}else if( inputKursi == kk ){
					int a = 2;
					int hasil1;
					hasil1 = a*harga2;
					System.out.println(a + " Bis Dengan " + qty2 + " kursi dengan Harga " + hasil1);
				}else if( inputKursi > kk && inputKursi < ll ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga1;
					hasil2 = b*harga3;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty1 + " kursi dan "+b+" Bis dengan "+qty3+" kursi dengan Harga " + akhir);
				}else if( inputKursi >= ll && inputKursi < mm ){
					int a = 1;
					int b = 1;
					int hasil1, hasil2, akhir;
					hasil1 = a*harga1;
					hasil2 = b*harga2;
					akhir  = hasil1 + hasil2;
					System.out.println(a + " Bis Dengan " + qty1 + " kursi dan "+b+" Bis dengan "+qty2+" kursi dengan Harga " + akhir);
				}else if( inputKursi >= mm && inputKursi <= max ){
					int a = 2;
					int hasil1;
					hasil1 = a*harga1;
					System.out.println(a + " Bis Dengan " + qty1 + " kursi dengan Harga " + hasil1);
				}

			}

		}else{
			System.out.println("Jumlah penumpang melebihi kapasitas");
		}

	}
}
