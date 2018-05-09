/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
/*
	2. Seorang anak bernama Oni setiap pagi selalu berolahraga memutari sebuah lapangan dengan keliling 0,5 km. 
Apabila dengan kecepatan lari 5 km/jam Oni mampu memutari lapangan sebanyak 5 kali, 
berapa lamakah Oni lari setiap paginya?J
*/
public class Richa02{
	public static void main(String[] args){
		double keliling, kecepatan, total, operasi, hasil;

		keliling 	= 0.5; // KM = 500 meter
		kecepatan 	= 5; // km/jam = 
		total 		= 5; // sebanyak 5 kali 

		operasi		= total*keliling; // dalam Kilometer 
		hasil 		= operasi/kecepatan; // dalam jam

		System.out.print("Lama Oni lari setiap paginya " + hasil + " Jam");


	}
}