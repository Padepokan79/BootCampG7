/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 20 May 2018 16:15
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class LatihanLoopMalik{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		String pilihan="";
		int kesempatan=5, poin=10, jmlPoin=0, nilaiRandom, tebakan, jmlPensil;

		System.out.println("\nTebak Tebakan Jumlah pensil!!!!!");

		System.out.print("\nMasukan Jumlah Pensil : ");
		jmlPensil = key.nextInt();
		System.out.println("------------------------------------\n");

		while (kesempatan > 0) {
			nilaiRandom = rand.nextInt(jmlPensil)+1;

			System.out.print("Tebakan : ");
			tebakan = key.nextInt();

			if (tebakan == nilaiRandom) {
				System.out.println("Mantap Tebakan Benar !!!");
				kesempatan = kesempatan + 1;
				jmlPoin = jmlPoin + poin;
			}
			else {
				System.out.println("Oh no Tebakanmu salah !!!");
				kesempatan = kesempatan - 1;				
			}

			System.out.println("Jumlah Poin\t: "+jmlPoin);
			System.out.println("Sisa Kesempatan\t: "+kesempatan);
			System.out.println("\n------------------------------------\n");

			if ( kesempatan == 0 && jmlPoin >= 10) {
				System.out.println("Kesempatanmu habis, tapi Poin mu ada "+jmlPoin);
				System.out.println("Anda bisa menukar 10 poin untuk 1 kesempatan");
				System.out.println("Apakah anda ingin menukar poin dengan kesempatan? (y/t)");
				pilihan = key.next();
				if (pilihan.equals("y")) {
					kesempatan = jmlPoin/10;
					jmlPoin = 0;
				}
				System.out.println("\n------------------------------------\n");
			}
		}
	}
}