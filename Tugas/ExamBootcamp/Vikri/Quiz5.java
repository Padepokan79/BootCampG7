/*
	Created By Vikri
	29/05/2018
	Start : 11:20
	End   : 
*/
import java.util.Scanner;
public class Quiz5{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int batas = 0, batasan = 1000, convertAngka = 0, convertIndex = 0, batasMaxInputan = 10, batasMinInputan = 1;
		int arrNum1[] = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arrNum2 = new int[arrNum1.length+1];
		String  angka, index;

		do{
			System.out.print("Masukan Angka yang mau disisipkan: ");
			angka = scan.next();

			if (angka.matches("[0-9]*")) {
				convertAngka = Integer.parseInt(angka);
				if (convertAngka >= batas&&convertAngka <= batasMaxInputan) {
					batasan = 0;
				} else if (convertAngka<1) {
					System.out.print("Maaf, input posisi tidak boleh kurang dari 1");
				} else {
					System.out.println("Maaf, input posisi tidak boleh lebih dari 10.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				batasan--;
			}

		}while(batasan > 0);
		
		do{
			System.out.print("Sisipkan pada Posisi ke: ");
			index = scan.next();

			if (index.matches("[0-9 -]*")) {
				convertIndex = Integer.parseInt(index);
				if (convertIndex >= 1&&convertIndex <= 10) {
					batas = 0;
				} else if (convertIndex<1) {
					System.out.println("Maaf, input posisi tidak boleh kurang dari 1");
				} else {
					System.out.println("Maaf, input posisi tidak boleh lebih dari 10.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				batas--;
			}

		}while(batas > 0);

		int arrayLama;

		for (int copyIndex = 0; copyIndex < arrNum1.length; copyIndex++) {
			arrNum2[copyIndex] = arrNum1[copyIndex];
		}

		for (int indexAwal = 0; indexAwal < arrNum2.length; indexAwal++) {
			if (indexAwal == convertIndex-1) { // -1 sebagai pengurang agar sesuai dengan index array yang awalnya 0
				arrayLama = arrNum1[indexAwal];
				arrNum2[indexAwal] = convertAngka;
				
				arrNum2[indexAwal+1] = arrayLama;
			}
		}

		for (int coba:arrNum2) {
			System.out.print(coba+" ");
		}

	}
}