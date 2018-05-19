/*
created by 	: Malik Chaudhary
time 		: 18-05-2018 12:55PM

soal :
Tampilkan angka ganjil dan angka kelipatan 3 dari 1 sampai 1000.
*/

public class DoWhileBilangan{
	public static void main(String[] args){
		int angka = 1, ganjil, kelipatan4, satu = 1;

		do{
			if ( angka%2 == 1 || angka%4 == 0 ) {
				System.out.print(angka+" ");
			}

			angka = angka + satu;
		}while( angka <= 1000 );
	}
}