/*
Created by 	: Yana
Time		: 18 Mei 2018 12.55
*/

public class TugasDoWhile1{
	public static void main(String[] args) {

		int angkaAwal, angkaKelipatan, angkaMaksismal;

		angkaKelipatan = 4;
		angkaMaksismal = 1000;

		angkaAwal 		= 1;
		do{
			angkaAwal++;
			if ( angkaAwal%2 == 1 || angkaAwal%4==0) {
			System.out.print(angkaAwal+ ",\t");				
			}
		}while(angkaAwal < angkaMaksismal);
	}
}
// Tampilkan angka ganjil dan angka kelipatan 4 dari 1 sampai 1000.
