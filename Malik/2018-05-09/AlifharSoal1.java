/*
soal : 
Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran. 
Pipa kecil dapat mengalirkan air 10 liter/menit, sedangkan pipa besar 15 liter/menit. 
Waktu yang dibutuhkan untuk mengisi bak menggunakan pipa besar adalah 0,8 menit. 
Berapa menit yang dibutuhkan untuk mengisi bak menggunakan pipa kecil?

create by : Malik Chaudhary
time : 08-05-2018 7:32PM

*/

public class AlifharSoal1{
	public static void main(String[] args){
		int pipaKecil, pipaBesar;
		double wpipaBesar, wpipaKecil;

		pipaKecil = 10;
		pipaBesar = 15;

		wpipaBesar = 0.8;

		wpipaKecil = (pipaBesar*wpipaBesar)/pipaKecil;

		System.out.print("Waktu yang dibutuhkan untuk mengisi bak menggunakan pipa kecil : "+wpipaKecil);

	}
}