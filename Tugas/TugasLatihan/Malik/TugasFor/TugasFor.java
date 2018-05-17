/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 11:32AM
soal :

Tampilkan angka ganjil dan angka kelipatan 3 dari 1 sampai 1000.
*/

public class TugasFor{
	public static void main(String[] args){
		int angka;

		for ( angka = 1; angka <= 1000; angka++ ) {
			if ( angka%2 == 1 || angka%4 == 0 ) {
				System.out.print(" "+angka);
			}
			
		}
		



	}
}