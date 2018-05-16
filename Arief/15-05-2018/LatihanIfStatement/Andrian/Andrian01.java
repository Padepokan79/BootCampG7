/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Andrian01 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		String member;
		int harga, hargaMember, hargaPaket1, hargaPaket2, hargaPaket3, jlhLembar, totalHarga,
			lembarPaket1, lembarPaket2;

		hargaMember = 75;
		hargaPaket1 = 150; // < 100 lembar
		hargaPaket2 = 100; // >= 100 lembar sampai <= 200 lembar
		hargaPaket3 = 80; // >= 200 lembar

		lembarPaket1	= 100;
		lembarPaket2	= 200;

		System.out.print("Apakah anda member (Y/N): ");
		member = inputKey.next();

		System.out.print("Banyak lembar yang akan di fotocopy: ");
		jlhLembar = inputKey.nextInt();

		if(member.equals("Y")) {
			harga = hargaMember;
			totalHarga = harga * jlhLembar;
		}else{
			if (jlhLembar < lembarPaket1) {
				harga = hargaPaket1;
				totalHarga = jlhLembar * harga;
			}else if ((jlhLembar >= lembarPaket1) && (jlhLembar <= lembarPaket2)) {
				harga = hargaPaket2;
				totalHarga = jlhLembar * harga;
			}else{
				harga = hargaPaket3;
				totalHarga = jlhLembar * harga;
			}
		}
		System.out.println("Harga" + harga);
		System.out.println("Bayar" + totalHarga);
	}
}