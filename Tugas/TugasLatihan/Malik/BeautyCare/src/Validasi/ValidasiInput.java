package Validasi;
import java.util.Scanner;
public class ValidasiInput {
	static Scanner scan = new Scanner(System.in);
	
	public static String inputValidasiBeautyHuruf(String pertanyaan, boolean cek) {
		String PriceStr;
		cek = true;
		do {
			System.out.print(pertanyaan);
			PriceStr = scan.next();
			cek = ValidasiHuruf.validasiHuruf(PriceStr);
		}while(cek == true);
		return PriceStr;
	}

	public static String inputValidasiBeauty(String pertanyaan, boolean cek) {
		String name;
		cek = true;
		do {
			System.out.print(pertanyaan);
			name = scan.nextLine();
			cek = ValidasiAngka.validasiAngka(name);
		}while(cek == true);
		return name;
	}

}
