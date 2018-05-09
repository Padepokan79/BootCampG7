/*
soal : 
Seorang anak bernama Oni setiap pagi selalu berolahraga memutari sebuah lapangan dengan keliling 0,5 km. 
Apabila dengan kecepatan lari 5 km/jam Oni mampu memutari lapangan sebanyak 5 kali, 
berapa lamakah Oni lari setiap paginya?

create by : Malik Chaudhary
time : 08-05-2018 8:42PM

*/

public class RichaSoal2{
	public static void main(String[] args){
		int kecepatan, banyakPutar, waktu ;
		double keliling, lari;

		banyakPutar = 5;
		kecepatan = 5;
		keliling = 0.5;
		waktu = 60;

		lari = (keliling*waktu)/banyakPutar;
		
		System.out.print("lama Oni lari setiap paginya : "+lari);

	}
}