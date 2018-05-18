/*
Created by 	: Yana
Time		: 16 Mei 2018
*/

public class TugasFor1{
	public static void main(String[] args) {

		int angkaAwal, angkaKelipatan, angkaMaksismal;

		// angkaAwal = 1;
		angkaKelipatan = 4;
		angkaMaksismal = 1000;

		for ( angkaAwal = 1 ; angkaAwal <= angkaMaksismal ; angkaAwal++) {
			
			if ( angkaAwal%2 == 1 || angkaAwal%4==0) {
			System.out.println("- " +angkaAwal);				
			}
			// System.out.println("- " +angkaAwal);	
		}
		
	}
}

// Tampilkan angka ganjil dan angka kelipatan 4 dari 1 sampai 1000.
