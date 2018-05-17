/*
	Created By Vikri
	16/05/2018
	15:29
*/
import java.util.Scanner;
import java.util.Random;

public class SoalLatihan9{
	public static void main(String[] args) {
		int jmlNo, i;
		String fengshui, number;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Masukan No Hp Anda: ");
		number=input.next();

		jmlNo = number.length();

		for (i = 0; i<jmlNo; i++) {
			if (number.charAt(i)=='0') {
				System.out.println("0 khusus, special");
			} else if (number.charAt(i)=='1') {
				System.out.println("1 satu, diri-sendiri");
			} else if (number.charAt(i)=='2') {
				System.out.println("2 mudah, gampang");
			} else if (number.charAt(i)=='3') {
				System.out.println("3 menemukan, mendapatkan, hidup");
			} else if (number.charAt(i)=='4') {
				System.out.println("4 mati, miskin, susah");
			} else if (number.charAt(i)=='5') {
				System.out.println("5 tidak akan, tidak pernah, tidak bisa");
			} else if (number.charAt(i)=='6') {
				System.out.println("6 menuju,  akan");
			} else if (number.charAt(i)=='7') {
				System.out.println("7 Tepat, hoki");
			} else if (number.charAt(i)=='8') {
				System.out.println("8 makmur");
			} else if (number.charAt(i)=='9') {
				System.out.println("9 sukses");
			} else {
				System.out.println("Tidak terdeteksi");
			}
		}

	}
}