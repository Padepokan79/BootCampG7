/*
	DATE CREATED : 19 MEI 2018
	TIME CREATED : 08.30 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	1. Saat ini Budi mempunyai 200 butir kelereng, dan akan bertambah 20 butir setiap 1 menit. 
	Sedangkan saat ini Man mempunyai 10 butir kelereng dan akan bertambah 40 butir setiap 1 menit. 
	Pada waktu yang sama Tono memiliki kelereng 500 butir dan setiap menit akan bertambah sebanyak 
	nilai dadu yang dikocok Tono. Pada saat jumlah kelereng Man mengejar jumlah kelereng Budi, 
	kelereng Tono juga akan bertambah sebanyak jumlah kelereng Budi saat itu. Pada menit berapakah 
	jumlah kelereng Man akan mengejar jumlah kelereng Tono?

	-Tono mengocok dadu sebanyak 2 kali.
	-pertama saat kelerengnya berjumlah 500 butir,
	-kedua saat setelah jumlah kelereng Man mengejar jumlah kelereng Budi
	*gunakan random dan perulangan dowhile


	200 butir   20 butir  / menit
	10 butir    40 butir / menit
	500 butir   random nilai dadu / menit

	Misalkan kelereng MAN : 410
			 kelereng BUDI: 

	Penambahan per menit :
	Budi : 200  --> (+20) 220  240  260  280  300  320  340  360  380  400  420  440  460  480  500
	Man  : 10   -->	(+40) 50   90   130  170  210  250  290  330  370  410  450  490  530  570  610
	Tono : 500  -->										

*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileYana{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int budi, dua, man, daduMin, daduMax, waktuBudi, waktuTono, tono, jmlBudi, jmlMan, jmlTono, tambah20, tambah40, tambahDadu, satu, angkaRand;

		jmlBudi = 200;      tambah20 = 20;
		jmlMan  = 10;		tambah40 = 40;
		jmlTono = 500;		tambahDadu = 0;
		satu    = 1;
		dua  	= daduMax = 2;
		waktuBudi 	= waktuTono = 0;

		angkaRand = rand.nextInt(6) + 1;
		jmlTono += angkaRand;

		do{
			jmlBudi += tambah20;
			jmlMan += tambah40;
			waktuBudi++;

			System.out.println("Jumlah kelereng Budi : "+jmlBudi);
			System.out.println("Jumlah kelereng Man  : "+jmlMan);
		}while(jmlBudi > jmlMan);

			
			if (jmlMan > jmlBudi) {
				jmlTono += jmlBudi;	
				angkaRand = rand.nextInt(6) + 1;
				System.out.println("");	
			}


			do{
				jmlMan += tambah40;
				jmlTono += angkaRand;
				waktuTono++;

				System.out.println("Jumlah kelereng Tono : "+jmlTono);
				System.out.println("Jumlah kelereng Man  : "+jmlMan);

			}while(jmlTono > jmlMan);

		System.out.println("Jumlah kelereng MAN mengejar jumlah kelereng BUDI pada menit ke : "+waktuBudi);
		System.out.println("Jumlah kelereng MAN mengejar jumlah kelereng TONO pada menit ke : "+(waktuTono+waktuBudi));

	}
}