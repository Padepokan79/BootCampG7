/*
	Created by vikri
	14/05/2018
	0:41
*/
import java.util.Scanner;
public class SoalBooleanVikri1{
	public static void main(String[] args) {
		int uang;
		String pelajar, ktp;
		boolean kriteria;

		Scanner input = new Scanner(System.in);

		System.out.print("Punya ktp?");
		ktp=input.next();

		System.out.print("Berapa uang yang dibawa? ");
		uang=input.nextInt();

		System.out.print("pelajar bukan? ");
		pelajar=input.next();

		kriteria = ktp.equals("ya")&&pelajar.equals("bukan")&&uang>=200000;
		System.out.println("Masuk kriteria? "+kriteria);
	}
}