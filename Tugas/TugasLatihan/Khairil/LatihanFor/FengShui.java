/*
	 Program     : Tugas For - Fengshui
     Creator     : Khairil
     Created At  : 16 Mei 2018 15:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class FengShui {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		char satu, nol, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan;
		String fengshuiWord;
		int bring, enol, satuh;

		enol = 0;
		satuh = 1;
		
		System.out.println("Tabel");
		System.out.println("0 khusus, special, langka,");
		System.out.println("1 satu, satu-satunya, diri sendiri,");
		System.out.println("2 mudah, gampang, tidak sulit");
		System.out.println("3 menemukan, mendapatkan, hidup,");
		System.out.println("4 mati, miskin, susah,");
		System.out.println("5 Tidak akan, tidak pernah, tidak bisa");
		System.out.println("6 Menuju, akan");
		System.out.println("7 Tepat, hoki, atau bisa disebut juga ketuhanan");
		System.out.println("8 Makmur");
		System.out.println("9 Sukses");	

		System.out.println("Masukkan No HP Anda : ");
		fengshuiWord = keyboard.next();

		nol = '0'; satu = '1'; dua = '2'; tiga = '3'; empat = '4'; lima = '5';
		enam = '6'; tujuh = '7'; delapan = '8'; sembilan = '9';

		for(bring = enol; bring <= fengshuiWord.length()-satuh; bring++ ) {
			if(fengshuiWord.charAt(bring) == nol ) {
				System.out.println("0 khusus, special, langka");
			}
			if(fengshuiWord.charAt(bring) == satu ) {
				System.out.println("1 satu, satu-satunya, diri sendiri,");
			}
			if(fengshuiWord.charAt(bring) == dua ) {
				System.out.println("2 mudah, gampang, tidak sulit");
			}
			if(fengshuiWord.charAt(bring) == tiga ) {
				System.out.println("3 menemukan, mendapatkan, hidup,");
			}
			if(fengshuiWord.charAt(bring) == empat ) {
				System.out.println("4 mati, miskin, susah,");
			}
			if(fengshuiWord.charAt(bring) == lima ) {
				System.out.println("5 Tidak akan, tidak pernah, tidak bisa");
			}
			if(fengshuiWord.charAt(bring) == enam ) {
				System.out.println("6 Menuju, akan");
			}
			if(fengshuiWord.charAt(bring) == tujuh ) {
				System.out.println("7 Tepat, hoki, atau bisa disebut juga ketuhanan");
			}
			if(fengshuiWord.charAt(bring) == delapan ) {
				System.out.println("8 Makmur");
			}
			if(fengshuiWord.charAt(bring) == sembilan ) {
				System.out.println("9 Sukses");
			}
		}
		System.out.println();
	}
}