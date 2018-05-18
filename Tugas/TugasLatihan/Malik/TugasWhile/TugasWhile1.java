/*
created by 	: Malik Chaudhary
time 		: 17-05-2018 12:50PM

soal :
Tampilkan angka ganjil dan angka kelipatan 3 dari 1 sampai 1000.
*/

public class TugasWhile1{
	public static void main(String[] args){
		int angka = 1, ganjil, kelipatan4, satu = 1;

		while( angka <= 1000 ){
			if ( angka%2 == 1 || angka%4 == 0 ) {
				System.out.print(angka+" ");
			}
			angka = angka + satu;
		}
	}
}