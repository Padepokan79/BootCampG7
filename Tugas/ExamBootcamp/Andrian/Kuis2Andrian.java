/* 	Date 		: 29/5/2018    
	Time Start	: 08:56
	Time End 	: 10.32
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;
	//import java.util.Random;

	public class Kuis2Andrian {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);

			int batasSebenarnya, value=0,valueMax=1,  batasInputMin=2, batasInputMax=20;
			String batas;

			do {
			System.out.print("Masukan batas yang anada ingin kan : ");
			batas = key.next();
			if (batas.matches("[0-9 ]+")) {
				batasSebenarnya = Integer.parseInt(batas);
				int [] sekarang = new int [batasSebenarnya], sebelum = new int [batasSebenarnya]; 
				if (batasSebenarnya>=batasInputMin && batasSebenarnya<batasInputMax) {
					for (int index=0; index<batasSebenarnya; index++) {
						for (int indexA=0; indexA<index+1; indexA++){

								if (indexA==0 || indexA==index) {
									sekarang[indexA] = 1 ;
								}
								else{
									sekarang[indexA] = sebelum[indexA-1] + sebelum[indexA];
								}
								System.out.print(sekarang[indexA]+" ");
							}
							System.out.println();

							for (int pindah=0; pindah<sekarang.length; pindah++) {
								sebelum[pindah] = sekarang[pindah];
							}	
						}
					value =+1;
				}
				else if (batasSebenarnya<batasInputMin) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 2");
					value = 0;	
				}
				else if (batasSebenarnya>=batasInputMax) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 20");
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
