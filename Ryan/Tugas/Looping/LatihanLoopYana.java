/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 21 May 2018 12:16
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class LatihanLoopYana{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		String pilihan;
		int perMenitBudi = 20, perMenitMan = 40, perMenitTono = 0,
		kelerengBudi = 200, kelerengMan = 10, kelerengTono = 500, menit=0;

		System.out.println("\n=============================================");
		System.out.println("----------------Game Kelereng----------------");
		System.out.println("=============================================");
		System.out.println();
		System.out.println("Kelereng Awal Budi\t "+kelerengBudi+" Pertambahan permenit "+perMenitBudi);
		System.out.println("Kelereng Awal Man\t "+kelerengMan+" Pertambahan permenit "+perMenitMan );
		System.out.println("Kelereng Awal Tono\t "+kelerengTono+ " Pertambahan permenit (Tergantung kocokan dadu)");
		System.out.println();
		System.out.println("=============================================");
		System.out.print("Kocok dadu untuk Tono (y/t) : ");
		pilihan = key.next();

		if (pilihan.equals("y")) {
			perMenitTono = rand.nextInt(6)+1;
		}
		else {
			perMenitTono = 0;
		}

		System.out.println("Hasil permenit untuk Tono "+perMenitTono+" kelereng");

		while (kelerengMan <= kelerengBudi) {
			kelerengBudi = kelerengBudi+perMenitBudi;
			kelerengMan = kelerengMan+perMenitMan;
			kelerengTono = kelerengTono+perMenitTono;
			menit++;
		}

		System.out.println("Perolehan Sementara kelereng pada menit ke "+menit);
		System.out.println("Budi : "+kelerengBudi);
		System.out.println("Man : "+kelerengMan);
		System.out.println("Tono : "+kelerengTono);
		System.out.println();

		System.out.print("Kocok dadu lagi untuk Tono (y/t) : ");
		pilihan = key.next();

		if (pilihan.equals("y")) {
			perMenitTono = rand.nextInt(6)+1;
		}
		else {
			perMenitTono = 0;
		}

		kelerengTono = kelerengTono+kelerengBudi;

		while (kelerengMan <= kelerengTono) {
			kelerengBudi = kelerengBudi+perMenitBudi;
			kelerengMan = kelerengMan+perMenitMan;
			kelerengTono = kelerengTono+perMenitTono;
			menit++;
		}

		System.out.println("Man berhasil menyusul jumlah kelereng tono pada menit ke "+menit);

	}
}