/* 	Date 		: 29/5/2018    
	Time Start	: 08:26
	Time End 	: 12.24
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;
	//import java.util.Random;

	public class Kuis1Andrian{
		public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int value=0,valueMax=1, batasInputMin=5, batasInputMax=100;
		String panjang;
		double panjangSebenarnya=0, series1=1, series2=1, sum;

		do {
			System.out.print("Masukan batas yang ada inginkan (minimal 5 maksimal 100): ");
			panjang = key.next();
			if (panjang.matches("[0-9 ]+")) {
				panjangSebenarnya = Integer.parseInt(panjang);
				if (panjangSebenarnya>=batasInputMin && panjangSebenarnya<batasInputMax) {
					
					System.out.println("Fibonancci : ");

					for (int index = 0; index<=panjangSebenarnya; index++ ) {
						System.out.printf(" %.2f ",series1);

						sum = series1 + series2;
						series1 = series2;
						series2 = sum;
					}
					
					value =+1;
				}
				else if (panjangSebenarnya<batasInputMin) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5");
					value = 0;	
				}
				else if (panjangSebenarnya>=batasInputMax) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 100");
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


