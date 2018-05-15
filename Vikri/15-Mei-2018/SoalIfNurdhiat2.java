/*
	Created By Vikri
	15/05/2018
	13:09
*/
import java.util.Scanner;
public class SoalIfNurdhiat2{
	public static void main(String[] args) {
		int jarak;
		Scanner input = new Scanner(System.in);

	System.out.println("=============================================");
	System.out.println("         Perlanan Ke Tempat Kerja");
	System.out.println("=============================================");


		System.out.print("Masukan jarak rumah dengan perusahaan: ");
		jarak = input.nextInt();

		System.out.println("\nPerjalanan Yang Tersedia Untuk anda Adalah: ");

		if (jarak>=10||jarak<10) {
			System.out.println("Jalan Kaki");
		} if (jarak>=35) {
			System.out.println("Naik Sepeda");
		} if (jarak>=72) {
			System.out.println("Naik Motor");
		} if (jarak>=100) {
			System.out.println("Naik Mobil");
		} if (jarak>=150) {
			System.out.println("Naik Helicopter");
		}
	}
}