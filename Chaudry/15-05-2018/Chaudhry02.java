/*
	DATE CREATED 	: 15 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Chaudhry02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int jarak, jarakA, jarakB, jarakC, jarakD, jarakE, satu;
		jarakA = 10;
		jarakB = 35;
		jarakC = 72;
		jarakD = 100;
		jarakE = 150;
		satu 	= 1;

		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(" PERJALANANKU MENUJU TEMPAT KERJA :) ");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.print("Masukan jarak rumah dengan perusahaan : ");
		jarak = key.nextInt();
		System.out.println("");
		System.out.println("Perjalanan yang tersedia untuk anda: ");

		
		// if (jarak >= jarakE) {
		// 	System.out.println("- Naik helikopter");
		// }
		// if (jarak < jarakE && jarak >= jarakD) {
		// 	System.out.println("- Naik Mobil");
		// }
		// if (jarak < jarakD && jarak >= jarakC) {
		// 	System.out.println("- Naik Motor");
		// }
		// if (jarak < jarakC && jarak >= jarakB) {
		// 	System.out.println("- Naik Sepeda");
		// }
		// if (jarak < jarakB && jarak >= jarakA) {
		// 	System.out.println("- jalan kaki");
		// }

		if (jarak >= jarakE) {
			System.out.println("- Naik helikopter");
		}
		if (jarak <= jarakD) {
			System.out.println("- Naik Mobil");
		}
		if (jarak >= jarakC) {
			System.out.println("- Naik Motor");
		}
		if (jarak >= jarakB) {
			System.out.println("- Naik Sepeda");
		}
		if (jarak <= jarakA) {
			System.out.println("- jalan kaki");
		}

	}
}			