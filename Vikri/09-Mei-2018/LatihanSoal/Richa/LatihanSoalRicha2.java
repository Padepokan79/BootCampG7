/*
	Created By Vikri
	09/05/2018
	08:50

	2. Seorang anak bernama Oni setiap pagi selalu berolahraga memutari sebuah lapangan dengan keliling 0,5 km. 
	   Apabila dengan kecepatan lari 5 km/jam Oni mampu memutari lapangan sebanyak 5 kali, 
       berapa lamakah Oni lari setiap paginya?
*/
public class LatihanSoalRicha2{
	public static void main(String[] args) {
		double keliling, kecepatan, memutari, hasil, jarakTotal;
		keliling = 0.5;
		kecepatan = 5;
		memutari = 5;

		jarakTotal = keliling*memutari;
		jarakTotal = jarakTotal/kecepatan;

		hasil = jarakTotal*60;
		
		System.out.println("Oni Selama "+(int)hasil+" menit");
	}
}