/*
	 Program     : Belanja Bulanan
     Creator     : Khairil
     Created At  : 3 Mei 2018 11:00 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BelanjaBulanan {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int rotiIn, rotiJum, selaiIn, selaiJum, kismisIn, kismisJum, mentIn, mentJum, angkaNol, angkaSatu;
		double total, maksimum;
		boolean belanjaBoros;

		System.out.print( "Jumlah Roti >>> " );
		rotiIn = keyboard.nextInt();

		System.out.print( "Jumlah Selai >>> " );
		selaiIn = keyboard.nextInt();

		System.out.print( "Jumlah Kismis >>> " );
		kismisIn = keyboard.nextInt();

		System.out.print( "Jumlah Mentega >>> " );
		mentIn = keyboard.nextInt();

		angkaNol  = 0;
		angkaSatu = 1;
		maksimum  = 100000;
		rotiJum   = 15000;
		selaiJum  = 8500;
		kismisJum = 7500;
		mentJum   = 3500;

		total = (rotiIn * rotiJum) + (selaiIn * selaiJum) + (kismisIn * kismisJum) + (mentIn * mentJum); 

		belanjaBoros = ( (selaiIn >= angkaNol || kismisIn >= angkaNol) && (rotiIn <= angkaSatu && mentIn <= angkaSatu) && total < maksimum);

		System.out.println( "Total belanja  : " + total);
		System.out.println( "Belanja Hemat ?  " + belanjaBoros);
	}	
}

/*
belanja bulanan terdiri dari min 4 item (boleh beli lebih dari 1 

item per jenisnya kecuali mentega dan roti) dan total belanja tidak 

boleh > 100000. Harga masing-masing roti(15000), selai(8500), 

kismis(7500), mentega(3500)
*/