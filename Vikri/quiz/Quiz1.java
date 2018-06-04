/*
	Created By Vikri
	29/05/2018
	Start : 9:10
	End   : 9:37
*/
import java.util.Scanner;
public class Quiz1{
	public static void main(String[] args) {
		int indexAwal, indexAkhir, convertJml = 0, batas = 1000, batasInputan = 0;
		String jmlBaris;

		Scanner input = new Scanner(System.in);


		do{
			System.out.print("Masukan Jumlah Batas: ");
			jmlBaris=input.next();

			if (jmlBaris.matches("[0-9]*")) {
				convertJml = Integer.parseInt(jmlBaris);
				if (convertJml >= 5 && convertJml<100) {
					batas = 0;
				} else if (convertJml>100) {
					System.out.println("Jumlah batas Lebih dari 100");
				} else {
					System.out.println("Jumlah batas kurang dari 5");
				}
			} else {
				System.out.println("Masukan Angka Saja");
				batas--;
			}

		}while(batasInputan > 0);

		int[] arrFib = new int [convertJml];
		arrFib[0] = 0;
		arrFib[1] = 1;
		for (indexAwal = 2; indexAwal < convertJml; indexAwal++) {
			arrFib[indexAwal] = arrFib[indexAwal-1] + arrFib[indexAwal-2];
		}

		for (indexAkhir = 0; indexAkhir < arrFib.length; indexAkhir++) {
			System.out.print(arrFib[indexAkhir]+" ");
		}
		
	}
}