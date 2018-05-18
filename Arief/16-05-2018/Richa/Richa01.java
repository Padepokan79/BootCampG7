/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Richa01 {
	public static void main (String [] args) {
		Scanner inputKey = new Scanner (System.in);

		double 	tiketLombok, tiketBangkok, tiketSingapura, tiketTokyo, hotelLombok, hotelBangkok,
				hotelSingpura, hotelTokyo, makanLombok, makanBangkok, makanSingapura, makanTokyo,
				snorkling, ski, belanja, universalStudio, budget, budgetLombok, budgetBangkok,
				budgetSingapura, budgetTokyo;
		int jlhOrang, jlhHari, mod;
		String nama, aktivitas;

		mod = 2;

		tiketLombok = 2170000;
		hotelLombok = 255000;
		makanLombok = 75000;
		snorkling = 250000;

		tiketBangkok = 3780000;
		hotelBangkok = 305000;
		makanBangkok = 55000;
		belanja = 300000;

		tiketSingapura = 1200000;
		hotelSingpura = 335000;
		makanSingapura = 85000;
		universalStudio = 360000;

		tiketTokyo = 4760000;
		hotelTokyo = 355000;
		makanTokyo = 105000;
		ski = 325000;

		System.out.println("             WELCOME TO TRAVEL 79.com             ");
		System.out.println();
		System.out.println("Tentukan dengan mudah destinasi terbaikmu!");

		System.out.print("Nama: ");
		nama = inputKey.next();

		System.out.print("Berapa orang yang ikut travel bersamamu? ");
		jlhOrang = inputKey.nextInt ();

		System.out.print("Berapa hari kamu akan pergi? ");
		jlhHari = inputKey.nextInt ();

		System.out.println("Budget kamu berapa, " + nama + " ? ");
		budget = inputKey.nextDouble();

		budgetLombok = (tiketLombok * jlhOrang) + ((hotelLombok * (jlhOrang / mod) * jlhHari) + (hotelLombok * (jlhOrang % mod) * jlhHari)) + (makanLombok * jlhOrang * jlhHari);
		budgetBangkok = (tiketBangkok * jlhOrang) + ((hotelBangkok * jlhOrang / mod) + (hotelBangkok * jlhOrang % mod)) + (makanBangkok*jlhOrang * jlhHari);
		budgetSingapura = (tiketSingapura * jlhOrang) + ((hotelSingpura * jlhOrang / mod) + (hotelSingpura * jlhOrang % mod)) + (makanSingapura * jlhOrang * jlhHari);
		budgetTokyo = (tiketTokyo * jlhOrang) + ((hotelTokyo * jlhOrang / mod) + (hotelTokyo * jlhOrang % mod)) + (makanTokyo * jlhOrang * jlhHari);

		if (budgetTokyo <= budget) {
			System.out.println("Destinasi rekomendasi kami untuk " + nama + " adalah Tokyo");
			System.out.println ("Apakah kamu ingin ski? (Y/N)");
			aktivitas = inputKey.next ();
			if (aktivitas.equals("Y")) {
				System.out.println( "Total yang harus kamu bayar untuk ke Tokyo adalah " + (budgetTokyo + (ski * jlhOrang)));
			} else {System.out.println( "Total yang harus kamu bayar untuk ke Tokyo adalah " + budgetTokyo);
			}
		}
		else if (budgetBangkok <= budget) {
			System.out.println("Destinasi rekomendasi kami untuk " + nama + " adalah Bangkok");
			System.out.println ("Apakah kamu ingin belanja? (Y/N)");
			aktivitas = inputKey.next ();
			if (aktivitas.equals("Y")) {
				System.out.println( "Total yang harus kamu bayar untuk ke Bangkok adalah " + (budgetBangkok + (belanja * jlhOrang)));
			} else {System.out.println( "Total yang harus kamu bayar untuk ke Bangkok adalah " + budgetBangkok);
			}
		}
		else if (budgetLombok <= budget) {
			System.out.println("Destinasi rekomendasi kami untuk " + nama + " adalah Lombok");
			System.out.println ("Apakah kamu ingin snorkling? (Y/N)");
			aktivitas = inputKey.next ();
			if (aktivitas.equals("Y")) {
				System.out.println( "Total yang harus kamu bayar untuk ke Lombok adalah " + (budgetLombok + (snorkling * jlhOrang)));
			} else {System.out.println( "Total yang harus kamu bayar untuk ke Lombok adalah " + budgetLombok);
			}
		}
		else if (budgetSingapura <= budget) {
			System.out.println("Destinasi rekomendasi kami untuk " + nama + " adalah Singapura");
			System.out.println ("Apakah kamu ingin pergi ke Universal Studio? (Y/N)");
			aktivitas = inputKey.next ();
			if (aktivitas.equals("Y")) {
				System.out.println( "Total yang harus kamu bayar untuk ke Singapura adalah " + (budgetSingapura + (universalStudio * jlhOrang)));
			} else {System.out.println( "Total yang harus kamu bayar untuk ke Singapura adalah " + budgetSingapura);
			}
		}
		else {System.out.println("Mohon maaf kami tidak menemukan pilihan destinasi yang sesuai");
		}

	}
}