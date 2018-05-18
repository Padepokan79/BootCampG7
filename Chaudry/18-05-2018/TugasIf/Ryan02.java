/*
	DATE CREATED : 17 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
/*
	Ana mempunyai 2 rumah yang akan dijadikan tempat kos dengan rincian harga dan rumah
	R1 = 650rb/kamar, ada 4 kamar, maks perkamar 3 orang
	R2 = 350rb/kamar, ada 7 kamar, maks perkamar 2 orang

buatlah algoritma yang dapat menentukan ke kosan mana orang harus ngekos dengan harga minimum 
*/
import java.util.Scanner;
public class Ryan02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		double inputOrang, max01, max02, hargaKamar01, hargaKamar02, jmlKamar01, jmlKamar02;
		hargaKamar01 = 650000;
		hargaKamar02 = 350000;
		jmlKamar01   = 4;
		jmlKamar02   = 7;
		max01 		 = 3;
		max02 		 = 2;

		System.out.print("Input Jumlah orang : ");
		inputOrang = key.nextInt();

		if (inputOrang > 14 ) {
			System.out.println("Tidak ada kosan untuk jumlah orang " + inputOrang);
		}
		else if (inputOrang == 14) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*7));
		}
		else if (inputOrang == 13) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*7));
		}
		else if (inputOrang == 12) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*6));
		}
		else if (inputOrang == 11) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*6));
		}
		else if (inputOrang == 10) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*5));
		}
		else if (inputOrang == 9) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*5));
		}
		else if (inputOrang == 8) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*4));
		}
		else if (inputOrang == 7) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*4));
		}
		else if (inputOrang == 6) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*3));
		}
		else if (inputOrang == 5) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*3));
		}
		else if (inputOrang == 4) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*2));
		}
		else if (inputOrang == 3) {
			System.out.println("Rumah kosan 1 dengan harga Rp. "+(hargaKamar01*1));
		}
		else if (inputOrang <= 2 && inputOrang >= 1) {
			System.out.println("Rumah kosan 2 dengan harga Rp. "+(hargaKamar02*1));
		}
		
		



	}
}