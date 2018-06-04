/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 3:15AM

Soal :

Saat ini Budi mempunyai 200 butir kelereng, dan akan bertambah 20 butir setiap 1 menit. Sedangkan saat ini Man 
mempunyai 10 butir kelereng dan akan bertambah 40 butir setiap 1 menit. Pada waktu yang sama Tono memiliki 
kelereng 500 butir dan setiap menit akan bertambah sebanyak nilai dadu yang dikocok Tono. Pada saat jumlah kelereng 
Man mengejar jumlah kelereng Budi, kelereng Tono juga akan bertambah sebanyak jumlah kelereng Budi saat itu. 
Pada menit berapakah jumlah kelereng Man akan mengejar jumlah kelereng Tono?

-Tono mengocok dadu sebanyak 2 kali.
-pertama saat kelerengnya berjumlah 500 butir,
-kedua saat setelah jumlah kelereng Man mengejar jumlah kelereng Budi
*gunakan random dan perulangan dowhile

Penambahan per menit

Budi    = +20   200 |+ 220 240 260 280 300 320 340 360 380 400 
Man 	= +40   10  |+ 50  90  130 170 210 250 290 330 370 410 menit 11 Man menyusul kelereng Budi
Tono  	=       500

*/
import java.util.Random;
public class SoalWhileYana{
	public static void main(String[] args){
		Random random = new Random();

		int budiKelereng, manKelereng, tonoKelereng, budiTambah, manTambah, banyakDadu, dadu, daduKocok, waktuMan, waktuManDua;
		int satu, enam;
		budiKelereng = 200; 	budiTambah 	= 20; 	dadu 		= 1; 	waktuManDua = 0;
		manKelereng  = 10; 		manTambah 	= 40; 	daduKocok 	= 0; 	satu 		= 1;
		tonoKelereng = 500; 	banyakDadu 	= 2; 	waktuMan 	= 0;	enam 		= 6;
		
		daduKocok = random.nextInt(enam)+satu;
		
		do{
			budiKelereng += budiTambah;
			manKelereng += manTambah;
				tonoKelereng += daduKocok;
			waktuMan++;

			if ( waktuMan == 10 ) {
				tonoKelereng += budiKelereng;
			}

			System.out.println("Jumlah Kelereng Budi : "+ budiKelereng);
			System.out.println("Jumlah Kelereng Man : "+ manKelereng);
		}while( budiKelereng > manKelereng );
			tonoKelereng += budiKelereng;
			System.out.println();
			daduKocok = random.nextInt(enam)+satu;
				do{
					manKelereng += manTambah;
					tonoKelereng += daduKocok;
					System.out.println("Jumlah Kelereng Tono : "+tonoKelereng);
					System.out.println("Jumlah Kelereng Man : "+ manKelereng);
					waktuManDua++;
				}while( tonoKelereng > manKelereng);
				
				System.out.println("Jumlah kelereng Budi akan terkejar Man pada menit ke : "+ waktuMan);
				System.out.println("Jumlah kelereng Tono akan terkejar Man pada menit ke : "+ (waktuMan+waktuManDua));
	}
}