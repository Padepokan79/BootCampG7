/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 13:55 AM     
     Updated By  : 
     Update Date : 
*/
class Alifar1 {
	public static void main(String[] args) {
		double alirKecil, alirBesar, pipaKecil, pipaBesar, volume;

		pipaKecil = 10;
		pipaBesar = 15;
		alirBesar = 0.8;

		volume = (pipaBesar * alirBesar) / pipaKecil;

		System.out.println("Pipa Besar        : " + pipaBesar);
		System.out.println("Aliran Pipa Besar : " + alirBesar);
		System.out.println("Aliran Pipa Kecil : " + volume);
	}
}

/*
Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran. Pipa kecil dapat mengalirkan air 10 liter/menit, sedangkan pipa besar 15 liter/menit. Waktu yang dibutuhkan untuk mengisi bak menggunakan pipa besar adalah 0,8 menit. Berapa menit yang dibutuhkan untuk mengisi bak menggunakan pipa kecil?
*/