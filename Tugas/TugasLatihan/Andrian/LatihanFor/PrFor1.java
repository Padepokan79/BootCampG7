/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class PrFor1 {
		public static void main(String[] args) {
			Scanner key = new Scanner (System.in);
			int pengulangan=0, angka=0, nilaiN;
			String bilanganPrima="";

			System.out.print("Masukan nilai n: ");
			nilaiN = key.nextInt();

			for ( pengulangan = 1 ; pengulangan <= nilaiN ; pengulangan++) {
				int pencacah = 0;
				for (angka = pengulangan ; angka>=1 ; angka--) {
					if (pengulangan%angka == 0) {
						pencacah = pencacah + 1;
					}
				}
				if (pencacah==2) {
					bilanganPrima = bilanganPrima + pengulangan + " ";
				}
			}
			System.out.println("Bilangan prima dari 1 ke n adalah");
			System.out.println(bilanganPrima);
		}
	}