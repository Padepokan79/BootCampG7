// Created by vikri
// 12/05/2018
// 14:35
import java.util.Scanner;
public class SoalAndrian2{
	public static void main(String[] args) {
		boolean tersortir, tBadanPria, tBadanWanita, Ktp, pria, wanita;
		String jKelamin, nama, ktp;
		int tBadan, penghasilan, umur;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.print("nama : ");
		nama = string.nextLine();

		System.out.print("Jenis Kelamin : ");
		jKelamin = string.next();

		System.out.print("Punya KTP (ya/tidak) : ");
		ktp = string.next();

		System.out.print("Umur : ");
		umur = input.nextInt();

		System.out.print("Penghasilan : ");
		penghasilan = input.nextInt();

		System.out.print("Tinggi Badan : ");
		tBadan = input.nextInt();

		Ktp = ktp.equals("ya");
		pria = jKelamin.equals("pria");
		wanita = jKelamin.equals("wanita");

		tBadanPria = tBadan >= 160 && Ktp && pria;
		tBadanWanita = tBadan >= 153 && Ktp && wanita;
 
		tersortir = penghasilan >= 3000000 && umur >= 25 && (tBadanPria || tBadanWanita);

		System.out.println("\nBoleh ikut Masuk? "+tersortir);
	}
}