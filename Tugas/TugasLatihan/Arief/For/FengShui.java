/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class FengShui {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		String start, nol, satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, phone;
		int end, i, nolX;

		nol = "khusus, special, langka,";
		satu = "satu, satu-satunya, diri sendiri,";
		dua = "mudah, gampang, tidak sulit";
		tiga = "menemukan, mendapatkan, hidup,";
		empat = "mati, miskin, susah,";
		lima = "Tidak akan, tidak pernah, tidak bisa";
		enam = "Menuju, akan";
		tujuh = "Tepat, hoki, atau bisa disebut juga ketuhanan";
		delapan = "Makmur";
		sembilan = "Sukses";
		nolX = 0;

		System.out.println("Enter Phone Number : ");
		phone = inputKey.next();
		end = phone.length();
		System.out.println();

		for ( i = nolX ; i < end ; i ++ ) {
			if (phone.substring(i,i+1).equals("0")) {
				System.out.println(phone.charAt(i) + " " + nol);
			}else if (phone.substring(i,i+1).equals("1")) {
				System.out.println(phone.charAt(i) + " " + satu);
			}else if (phone.substring(i,i+1).equals("2")) {
				System.out.println(phone.charAt(i) + " " + dua);
			}else if (phone.substring(i,i+1).equals("3")) {
				System.out.println(phone.charAt(i) + " " + tiga);
			}else if (phone.substring(i,i+1).equals("4")) {
				System.out.println(phone.charAt(i) + " " + empat);
			}else if (phone.substring(i,i+1).equals("5")) {
				System.out.println(phone.charAt(i) + " " + lima);
			}else if (phone.substring(i,i+1).equals("6")) {
				System.out.println(phone.charAt(i) + " " + enam);
			}else if (phone.substring(i,i+1).equals("7")) {
				System.out.println(phone.charAt(i) + " " + tujuh);
			}else if (phone.substring(i,i+1).equals("8")) {
				System.out.println(phone.charAt(i) + " " + delapan);
			}else if (phone.substring(i,i+1).equals("9")) {
				System.out.println(phone.charAt(i) + " " + sembilan);
			}
		}

	}
}