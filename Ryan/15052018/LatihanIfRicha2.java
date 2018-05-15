/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 15 May 2018 13:57
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfRicha2{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String nama, pilihan=" ";
		int jmlOrang, budget, hari, untukHotel,
		tiketLombok = 2170000, hotelLombok = 255000, makanLombok = 75000, snorkling = 250000, hargaHotelLombok=0, totalLombok=0,
		tiketBangkok = 3780000, hotelBangkok = 305000, makanBangkok = 55000, belanja = 300000, hargaHotelBangkok=0, totalBangkok=0,
		tiketSingapura = 1200000, hotelSingapura = 335000, makanSingapura = 85000, universalStudio = 360000, hargaHotelSingapura=0, totalSingapura=0,
		tiketTokyo = 4760000, hotelTokyo = 355000, makanTokyo = 105000, ski = 325000,  hargaHotelTokyo=0, totalTokyo=0;

		System.out.println("============WELCOME TO TRAVEL 79.com=============\n");
		System.out.println("Tentukan dengan mudah destinasi terbaikmu!");
		System.out.print("Nama\t: ");
		nama = key.next();
		System.out.print("Berapa orang yang ikut travel bersamamu? ");
		jmlOrang = key.nextInt();
		System.out.print("Berapa hari kamu akan pergi? ");
		hari = key.nextInt();
		System.out.print("Budget kamu berapa "+nama+" ? ");
		budget = key.nextInt();
		System.out.println("==================================================");

		untukHotel = jmlOrang%2;

		//lombok
		if (untukHotel == 0 ) {
			hargaHotelLombok = hotelLombok*(jmlOrang/2);
		}
		else if (untukHotel > 0) {
			hargaHotelLombok = hotelLombok*(jmlOrang/2+1);
		}
		totalLombok = (hargaHotelLombok*hari) + (tiketLombok*jmlOrang) + (makanLombok*jmlOrang*hari) + (snorkling*jmlOrang);

		//Bangkok
		if (untukHotel == 0 ) {
			hargaHotelBangkok = hotelBangkok*(jmlOrang/2);
		}
		else if (untukHotel > 0) {
			hargaHotelBangkok = hotelBangkok*(jmlOrang/2+1);
		}
		totalBangkok = (hargaHotelBangkok*hari) + (tiketBangkok*jmlOrang) + (makanBangkok*jmlOrang*hari) + (belanja*jmlOrang);  

		//Singapura
		if (untukHotel == 0 ) {
			hargaHotelSingapura = hotelSingapura*(jmlOrang/2);
		}
		else if (untukHotel > 0) {
			hargaHotelSingapura = hotelSingapura*(jmlOrang/2+1);
		}
		totalSingapura = (hargaHotelSingapura*hari) + (tiketSingapura*jmlOrang) + (makanSingapura*jmlOrang*hari) + (universalStudio*jmlOrang);

		//tokyo
		if (untukHotel == 0 ) {
			hargaHotelTokyo = hotelTokyo*(jmlOrang/2);
		}
		else if (untukHotel > 0) {
			hargaHotelTokyo = hotelTokyo*(jmlOrang/2+1);
		}
		totalTokyo = (hargaHotelTokyo*hari) + (tiketTokyo*jmlOrang) + (makanTokyo*jmlOrang*hari) + (ski*jmlOrang);

		//(totalLombok); //2750000
		//(totalBangkok); //4440000
		//(totalSingapura); //1980000
		//(//totalTokyo); //5540000

		if (totalTokyo < budget) {
			System.out.println("Destinasi rekomendasi kami untuk "+nama+" adalah Tokyo");
			System.out.print("Apakah kamu ingin ski? (Y/N) : ");
			pilihan = key.next();
			if (pilihan.equals("Y")) {
				totalTokyo=totalTokyo;
			}
			else if (pilihan.equals("N")) {
				totalTokyo = totalTokyo - (ski*jmlOrang);	
			}
			System.out.println("Total yang harus kamu bayar untuk ke Tokyo "+totalTokyo);	
		}

		else if (totalBangkok < budget) {
			System.out.println("Destinasi rekomendasi kami untuk "+nama+" adalah Bangkok");
			System.out.print("Apakah kamu ingin Belanja? (Y/N) : ");
			pilihan = key.next();
			if (pilihan.equals("Y")) {
				totalBangkok=totalBangkok;
			}
			else if (pilihan.equals("N")) {
				totalBangkok = totalBangkok - (belanja*jmlOrang);	
			}
			System.out.println("Total yang harus kamu bayar untuk ke Bangkok "+totalBangkok);	
		}

		else if (totalLombok < budget) {
			System.out.println("Destinasi rekomendasi kami untuk "+nama+" adalah Lombok");
			System.out.print("Apakah kamu ingin snorkling? (Y/N) : ");
			pilihan = key.next();
			if (pilihan.equals("Y")) {
				totalLombok=totalLombok;
			}
			else if (pilihan.equals("N")) {
				totalLombok = totalLombok - (snorkling*jmlOrang);	
			}
			System.out.println("Total yang harus kamu bayar untuk ke Lombok "+totalLombok);	
		}

		else if (totalSingapura < budget) {
			System.out.println("Destinasi rekomendasi kami untuk "+nama+" adalah Singapura");
			System.out.print("Apakah kamu ingin ke Universal Studio? (Y/N) : ");
			pilihan = key.next();
			if (pilihan.equals("Y")) {
				totalSingapura=totalSingapura;
			}
			else if (pilihan.equals("N")) {
				totalSingapura = totalSingapura - (universalStudio*jmlOrang);	
			}
			System.out.println("Total yang harus kamu bayar untuk ke Singapura "+totalSingapura);	
		}

		else {
			System.out.println("Dana Anda tidak mencukupi");
		}
	}
}