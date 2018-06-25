/*
	Created By Vikri
	29/05/2018
	Start : 8:28
	End   : 9:02
*/
import java.util.Scanner;
public class Quiz2{
	public static void main(String[] args) {
		int baris, kolom, convertJml = 0, batas = 1000, batasMaxInputan = 20, batasMinInputan = 2;
		String jmlBaris;
		int[][] arrPas = new int [100][100];

		Scanner input = new Scanner(System.in);


		do{
			System.out.print("Masukan Jumlah Batas: ");
			jmlBaris=input.next();

			if (jmlBaris.matches("[0-9]*")) {
				convertJml = Integer.parseInt(jmlBaris);
				if (convertJml >= batasMinInputan&&convertJml <= batasMaxInputan) {
					batas = 0;
				} else if (convertJml>batasMaxInputan) {
					System.out.println("Jumlah batas tidak boleh lebih dari 20");
				} else {
					System.out.println("Jumlah batas tidak boleh kurang dari 2");
				}
			} else {
				System.out.println("Inputan hanya menerima angka");
				batas--;
			}

		}while(batas > 0);

		for (baris = 1; baris <= convertJml; baris++) {
		for (kolom = 1; kolom <= baris; kolom++) {
			if (kolom == baris) {
					arrPas[baris][kolom] = 1;
					System.out.print(arrPas[baris][kolom]+" ");
				} else {
					arrPas[baris][kolom] = arrPas[baris-1][kolom-1] + arrPas[baris-1][kolom];
					System.out.print(arrPas[baris][kolom]+" ");
				}
			}
			System.out.println();
		}
	}
}