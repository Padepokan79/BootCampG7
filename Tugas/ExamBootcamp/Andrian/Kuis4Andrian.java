/* 	Date 		: 29/5/2018    
	Time Start	: 08:26
	Time End 	: 10.32
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				

Shift kiri sebanyak n kali

int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	*/

	import java.util.Scanner;
	//import java.util.Random;

	public class Kuis4Andrian {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int posisiSebenarnya, value=0, valueMax=1, posisiInputMin=1, posisiInputMax=10;
			String posisi;
			int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

			for (int printAwal : deretAngka) {
				System.out.print(printAwal+" ");
			}
			System.out.println();

			do {
				System.out.println("Masukan posisi yang akan di geser : ");
				posisi = key.next();
				if (posisi.matches("[0-9 ]+")) {
					posisiSebenarnya = Integer.parseInt(posisi);
					if (posisiSebenarnya>=posisiInputMin && posisiSebenarnya<posisiInputMax) {
						
						//System.out.println();
						for (int index=0; index<posisiSebenarnya; index++){
							int nilai = deretAngka[0];
							int indexA;
							for (indexA=0; indexA<deretAngka.length-1;indexA++) {
								deretAngka[indexA] = deretAngka[indexA+1];
							}
							deretAngka[indexA] = nilai;
						}

						for (int indexB = 0; indexB<deretAngka.length; indexB++){
							System.out.print(deretAngka[indexB]+" ");
						}
						
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
		}
	}