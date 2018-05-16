/*
	DATE CREATED 	: 15 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Alifhar01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		String positif, negatif, netral, genap, ganjil;
		double inputBil, proses;
		int a, b, c, nol;

		a = 2;
		b = 1;
		c = -1;
		nol = 0;


		System.out.println("===================================");
		System.out.print("Masukan Bilangan: ");
		inputBil 	= key.nextDouble();
		System.out.println("===================================");

		if (inputBil < nol) {
			//negatif
			if ((inputBil % a != nol) && (inputBil % a != b) && (inputBil % a != c) ) {
				negatif = "negatif";
				System.out.println("Bilangan tersebut riil "+negatif);
			}else{
				negatif = "negatif";
				proses = inputBil % a;
				if (proses == 0) {
					genap = "genap";
					System.out.println("Bilangan tersebut bulat "+ genap+ " " +negatif);
				}else{
					ganjil = "ganjil";
					System.out.println("Bilangan tersebut bulat "+ ganjil+ " " +negatif);
				}
				
			}
		}else if(inputBil > 0){
			//positif
			if ((inputBil % a != nol) && (inputBil % a != b) && (inputBil % a != c) ) {
				positif = "positif";
				System.out.println("Bilangan tersebut riil "+positif);
			}else{
				positif = "positif";
				proses = inputBil % a;
				if (proses == 0) {
					genap = "genap";
					System.out.println("Bilangan tersebut bulat "+ genap + " " +positif);
				}else{
					ganjil = "ganjil";
					System.out.println("Bilangan tersebut bulat "+ ganjil + " " + positif);
				}
				
			}
		}else{
			netral = " ";
		}

		
	}
}