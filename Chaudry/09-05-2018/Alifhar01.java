/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/

/*
	1. 
*/
public class Alifhar01{
	public static void main(String[] args){
		double pipaKecil, pipaBesar, bakPipaBesar, bakPipaKecil;

		pipaKecil 	= 10; // liter
		pipaBesar 	= 15; // liter
		bakPipaBesar= 0.8; // menit

		bakPipaKecil = (pipaBesar*bakPipaBesar)/pipaKecil;

		System.out.println("Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran. Pipa kecil dapat mengalirkan air 10 liter/menit, sedangkan pipa besar 15 liter/menit. Waktu yang dibutuhkan untuk mengisi bak menggunakan pipa besar adalah 0,8 menit. Berapa menit yang dibutuhkan untuk mengisi bak menggunakan pipa kecil?");
		System.out.print("Yang dibutuhkan untuk mengisi bak menggunakan pipa kecil " + bakPipaKecil + " Menit");
	}
}