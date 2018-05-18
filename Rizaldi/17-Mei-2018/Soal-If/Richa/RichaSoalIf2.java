/*
 * File           : RichaSoalIf2.java
 * Project Name   : Richa
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Richa
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 11:47:53 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 11:48:10 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class RichaSoalIf2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String name, option;
        option=" ";
		int qtyPeople, budget, day, hotelOnly,
		lombokTicket, lombokHotel, lombokFood, snorkling, lombokHotelPrice, totalLombok, 
        bangkokTicket, bangkokHotel, bangkokFood, shoping, bangkokHotelPrice, totalBangkok, 
        singaporeTicket, singaporeHotel, singaporeFood, universalStudio, singaporeHotelPrice, totalSingapura,
		tokyoTicket, tokyoHotel, tokyoFood, ski,  tokyoHotelPrice, totalTokyo;

        lombokTicket        = 2170000;
        lombokHotel         = 255000;
        lombokFood          = 75000;
        snorkling           = 250000;
        lombokHotelPrice    =0;
        totalLombok         =0;

        bangkokTicket       = 3780000;
        bangkokHotel        = 305000;
        bangkokFood         = 55000;
        shoping             = 300000;
        bangkokHotelPrice   =0;
        totalBangkok        =0;

        singaporeTicket     = 1200000;
        singaporeHotel      = 335000;
        singaporeFood       = 85000;
        universalStudio     = 360000;
        singaporeHotelPrice =0;
        totalSingapura      =0;

        tokyoTicket         = 4760000;
        tokyoHotel          = 355000;
        tokyoFood           = 105000;
        ski                 = 325000;
        tokyoHotelPrice     =0;
        totalTokyo          =0;

		System.out.println("=============WELCOME TO TRAVEL 79.com=============\n");
		System.out.println("Tentukan dengan mudah destinasi terbaikmu!");
		System.out.print("Nama\t: ");
		name = keyboard.next();
		System.out.print("Berapa orang yang ikut travel bersamamu? ");
		qtyPeople = keyboard.nextInt();
		System.out.print("Berapa hari kamu akan pergi? ");
		day = keyboard.nextInt();
		System.out.print("Budget kamu berapa "+name+" ? ");
		budget = keyboard.nextInt();
		System.out.println("==================================================");

		hotelOnly = qtyPeople%2;

		// lombok ===============
		if (hotelOnly == 0 ) {
			lombokHotelPrice = lombokHotel*(qtyPeople/2);
		}
		else if (hotelOnly > 0) {
			lombokHotelPrice = lombokHotel*(qtyPeople/2+1);
		}
		totalLombok = (lombokHotelPrice*day) + (lombokTicket*qtyPeople) + (lombokFood*qtyPeople*day) + (snorkling*qtyPeople);

		// Bangkok ===============
		if (hotelOnly == 0 ) {
			bangkokHotelPrice = bangkokHotel*(qtyPeople/2);
		}
		else if (hotelOnly > 0) {
			bangkokHotelPrice = bangkokHotel*(qtyPeople/2+1);
		}
		totalBangkok = (bangkokHotelPrice*day) + (bangkokTicket*qtyPeople) + (bangkokFood*qtyPeople*day) + (shoping*qtyPeople);  

		// Singapura ===============
		if (hotelOnly == 0 ) {
			singaporeHotelPrice = singaporeHotel*(qtyPeople/2);
		}
		else if (hotelOnly > 0) {
			singaporeHotelPrice = singaporeHotel*(qtyPeople/2+1);
		}
		totalSingapura = (singaporeHotelPrice*day) + (singaporeTicket*qtyPeople) + (singaporeFood*qtyPeople*day) + (universalStudio*qtyPeople);

		// tokyo ===============
		if (hotelOnly == 0 ) {
			tokyoHotelPrice = tokyoHotel*(qtyPeople/2);
		}
		else if (hotelOnly > 0) {
			tokyoHotelPrice = tokyoHotel*(qtyPeople/2+1);
		}
		totalTokyo = (tokyoHotelPrice*day) + (tokyoTicket*qtyPeople) + (tokyoFood*qtyPeople*day) + (ski*qtyPeople);

        // start cond 2

		if (totalTokyo < budget) {
			System.out.println("Destinasi rekomendasi kami untuk "+name+" adalah Tokyo");
			System.out.print("Apakah kamu ingin ski? (Y/N) : ");
			option = keyboard.next();
			if (option.equals("Y")) {
				totalTokyo=totalTokyo;
			}
			else if (option.equals("N")) {
				totalTokyo = totalTokyo - (ski*qtyPeople);	
			}
			System.out.println("Total yang harus kamu bayar untuk ke Tokyo "+totalTokyo);	
		}

		else if (totalBangkok < budget) {
			System.out.println("Destinasi rekomendasi kami untuk "+name+" adalah Bangkok");
			System.out.print("Apakah kamu ingin Belanja? (Y/N) : ");
			option = keyboard.next();
			if (option.equals("Y")) {
				totalBangkok=totalBangkok;
			}
			else if (option.equals("N")) {
				totalBangkok = totalBangkok - (shoping*qtyPeople);	
			}
			System.out.println("Total yang harus kamu bayar untuk ke Bangkok "+totalBangkok);	
		}

		else if (totalLombok < budget) {
			System.out.println("Destinasi rekomendasi kami untuk "+name+" adalah Lombok");
			System.out.print("Apakah kamu ingin snorkling? (Y/N) : ");
			option = keyboard.next();
			if (option.equals("Y")) {
				totalLombok=totalLombok;
			}
			else if (option.equals("N")) {
				totalLombok = totalLombok - (snorkling*qtyPeople);	
			}
			System.out.println("Total yang harus kamu bayar untuk ke Lombok "+totalLombok);	
		}

		else if (totalSingapura < budget) {
			System.out.println("Destinasi rekomendasi kami untuk "+name+" adalah Singapura");
			System.out.print("Apakah kamu ingin ke Universal Studio? (Y/N) : ");
			option = keyboard.next();
			if (option.equals("Y")) {
				totalSingapura=totalSingapura;
			}
			else if (option.equals("N")) {
				totalSingapura = totalSingapura - (universalStudio*qtyPeople);	
			}
			System.out.println("Total yang harus kamu bayar untuk ke Singapura "+totalSingapura);	
		}

		else {
			System.out.println("Dana Anda tidak mencukupi");
		}
	}
}