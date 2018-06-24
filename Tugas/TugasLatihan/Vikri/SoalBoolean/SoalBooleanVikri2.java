/*
	Created by vikri
	14/05/2018
	0:48
*/
import java.util.Scanner;
public class SoalBooleanVikri2{
	public static void main(String[] args) {
		int kecepatan;
		String warna, merk, jenis;
		boolean kriteria;

		Scanner input = new Scanner(System.in);

		System.out.print("Merk Motor: ");
		merk=input.next();

		System.out.print("jenis motor: ");
		jenis=input.next();

		System.out.print("warna: ");
		warna=input.next();

		System.out.print("kecepatan maksimal: ");
		kecepatan=input.nextInt();

		kriteria = merk.equals("honda")&&jenis.equals("matic")&&warna.equals("biru")&&kecepatan>=60;
		System.out.println("Masuk kriteria? "+kriteria);
	}
}