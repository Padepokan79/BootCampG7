/*
	 Program     : Boolean Arief 2 / Toko Elektronik
     Creator     : Khairil
     Created At  : 3 Mei 2018 14:35 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanArief2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputHari, hariBuka1, hariBuka2, hariBuka3, hariBuka4, hariBuka5, hariTutup1, hariTutup2; 
		boolean bukaToko1;

		System.out.print( "Input hari  :  " );
		inputHari = keyboard.next();

		hariBuka1 = "Senin";
		hariBuka2 = "Selasa";
		hariBuka3 = "Rabu";
		hariBuka4 = "Kamis";
		hariBuka5 = "Sabtu";
		hariTutup1 = "Jumat";
		hariTutup2 = "Minggu";

		// bukaToko = ((!inputHari.equals(hariTutup1) && !inputHari.equals(hariTutup2)) );
		bukaToko1 = ((inputHari.equals(hariBuka1) && inputHari.equals(hariBuka2) && inputHari.equals(hariBuka3) && inputHari.equals(hariBuka4) && inputHari.equals(hariBuka5) ) )

		// System.out.println( "toko buka  : " + bukaToko );		
		System.out.println( "toko buka  : " + bukaToko1 );		
	}
}