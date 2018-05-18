/*
	DATE CREATED : 16 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class TugasPerulangan01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);
		int inputBatas, angka1, angka2, satu, dua, nol, nilaiCount;
		satu = 1;
		nol  = 0;
		dua  = 2;

		System.out.print("Batas   : ");
		inputBatas = key.nextInt();


		for (angka1 = satu; angka1 <= inputBatas; angka1++) {
			
			nilaiCount = nol;
			for (angka2 = angka1; angka2 >= satu; angka2 -= satu) {
				if (angka1%angka2 == nol) {
					nilaiCount = nilaiCount + satu;
				}
			}

			if (nilaiCount == dua) {
				System.out.print(angka1+" ");
			}
		}
	}
}