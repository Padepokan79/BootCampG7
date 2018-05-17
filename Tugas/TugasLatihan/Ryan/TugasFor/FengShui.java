/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 15:19
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class FengShui{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String number, 
		a0="Khusus, special, langka,", a1="satu, satu-satunya, diri sendiri",
		a2="mudah, gampang, tidak sulit", a3="menemukan, mendapatkan, hidup",
		a4="mati, miskin, susah", a5="Tidak akan, tidak pernah, tidak bisa",
		a6="menuju, akan", a7="Tepat, hoki, atau bisa disebut ketuhanan",
		a8="Makmur", a9="Sukses";

		System.out.println("Masukan No Hp anda : ");
		number = key.next();
		System.out.println("==========================");

		int panjang = number.length();

		for (int banyakNo=0 ; banyakNo < panjang ; banyakNo++ ) {
			System.out.print(number.charAt(banyakNo));
			if (number.charAt(banyakNo) == '0') {
				System.out.println("\t"+a0);
			}
			if (number.charAt(banyakNo) == '1') {
				System.out.println("\t"+a1);
			}
			if (number.charAt(banyakNo) == '2') {
				System.out.println("\t"+a2);
			}
			if (number.charAt(banyakNo) == '3') {
				System.out.println("\t"+a3);
			}
			if (number.charAt(banyakNo) == '4') {
				System.out.println("\t"+a4);
			}
			if (number.charAt(banyakNo) == '5') {
				System.out.println("\t"+a5);
			}
			if (number.charAt(banyakNo) == '6') {
				System.out.println("\t"+a6);
			}
			if (number.charAt(banyakNo) == '7') {
				System.out.println("\t"+a7);
			}
			if (number.charAt(banyakNo) == '9') {
				System.out.println("\t"+a9);
			}
			if (number.charAt(banyakNo) == '8') {
				System.out.println("\t"+a8);
			}
		}
	}
}