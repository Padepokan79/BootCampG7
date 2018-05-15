/* 
	Created By Vikri
	13/05/2018
	19:10
*/
import java.util.Scanner;
public class SoalBooleanRicha3{
	public static void main(String[] args) {
		boolean kriteria;
		int gajian,uSuami, uIstri, gelut, sUmur;

		Scanner input = new Scanner(System.in);
		System.out.println("Selamat datang, ketahuilah kecocokan kalian sebagai suami istri!\n");

		System.out.print ("Umur suami: ");
		uSuami = input.nextInt();

		System.out.print ("Umur istri: ");
		uIstri = input.nextInt();

		System.out.print ("Dalam sebulan berapa kali frekuensi kalian bertengkar? ");
		gelut = input.nextInt ();

		System.out.print ("Berapa gaji suami dalam sebulan? ");
		gajian = input.nextInt ();

		sUmur = uSuami - uIstri;
		kriteria = uSuami > uIstri && sUmur <= 9 && gelut <= 5 && gajian > 5000000; 

		System.out.println("Ini hasilnya...."+
						   "\nApakah kalian cocok menjadi suami istri? " + kriteria);
	}
}
 