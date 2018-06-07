/* 	Date 		: 29/5/2018    
	Time Start	: 08:26
	Time End 	: 
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				

isip suatu bilangan pada posisi tertentu pada array Number1
{2, 39, 47, 14, 36, 56, 57, 49, 43, 79};

Batasan:
-input posisi tidak boleh lebih dari 10.
-input posisi tidak boleh kurang dari 1.
-input hanya dapat menerima angka.

	*/
	import java.util.Scanner;
	//import java.util.Random;

	public class Kuis5Andrian {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] number1 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
			String posisi, nomorBaru;
			int nomorBaruSebenarnya=0, posisiSebenarnya=0, posisiInputMin=1, posisiInputMax=10, nomorBaruInputMin=1, nomorBaruInputMax=10, value=0, valueMax=1;

			for ( int print : number1 ) {
				System.out.print(print+" ");
			}


			System.out.println();
			System.out.println();

			do {
				System.out.print("Masukan posisi yang akan disisipkan : ");
				posisi = key.next();
				if (posisi.matches("[0-9 ]+")) {
					posisiSebenarnya = Integer.parseInt(posisi);
					if (posisiSebenarnya>=posisiInputMin && posisiSebenarnya<posisiInputMax) {
						value =+1;
					}
					else if (posisiSebenarnya<posisiInputMin) {
						System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 1");
						value = 0;	
					}
					else if (posisiSebenarnya>=posisiInputMax) {
						System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 10");
						value = 0;	
					}
				}
				else {
					System.out.println("Maaf, input yang diterima hanya berupa angka.");
					value = 0;
					}			

			} while (value<valueMax);
			System.out.println();
			do {
				System.out.print("Masukan nilai yang akan disisipkan : ");
				nomorBaru = key.next();
				if (nomorBaru.matches("[0-9 ]+")) {
					nomorBaruSebenarnya = Integer.parseInt(nomorBaru);
					if (nomorBaruSebenarnya>=posisiInputMin && nomorBaruSebenarnya<posisiInputMax) {
						value =+1;
					}
					else if (nomorBaruSebenarnya<nomorBaruInputMin) {
						System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 1");
						value = 0;	
					}
					else if (nomorBaruSebenarnya>=nomorBaruInputMax) {
						System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 10");
						value = 0;	
					}
				}
				else {
					System.out.println("Maaf, input yang diterima hanya berupa angka.");
					value = 0;
					}			

			} while (value<valueMax);

			int indexA =0, nilaiArray=1;

			while (indexA < number1.length) {
				if (nilaiArray==posisiSebenarnya) {
					System.out.print(nomorBaruSebenarnya+" ");
				}
				else {
					System.out.print(number1[indexA]+" ");
					indexA++;
				}
				nilaiArray++;
			}
		}
	}