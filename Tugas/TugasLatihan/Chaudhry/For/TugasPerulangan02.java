/*
	DATE CREATED : 16 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class TugasPerulangan02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);
		int inputBatas, jmlKarakter, nol, nol2, angkaBaris, kata, angkaBaris3, spasi;
		String inputWord;
		nol = 0;
		nol2 = 0;

		System.out.print("Batas Segitiga   : ");
		inputBatas = key.nextInt();
		
		System.out.print("Kalimat          : ");
		inputWord = key2.nextLine();

		jmlKarakter = inputWord.length();
		// System.out.print(jmlKarakter);

		for (angkaBaris = nol; angkaBaris < inputBatas; angkaBaris++) {
			for (spasi = angkaBaris; spasi < jmlKarakter; spasi++) {
				System.out.print(" ");
			}

			for (kata = nol; kata <= angkaBaris; kata++) {
				if (nol2 < jmlKarakter) {
					System.out.print(inputWord.substring(nol2, nol2+1));
					System.out.print(" ");
					nol2++;
				}
			}
			System.out.println(" ");
		}
	}
}